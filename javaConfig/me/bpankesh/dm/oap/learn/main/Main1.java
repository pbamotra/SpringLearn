package me.bpankesh.dm.oap.learn.main;

import me.bpankesh.dm.oap.learn.classes.Employee;
import me.bpankesh.dm.oap.learn.config.EmployeeConfig;
import me.bpankesh.dm.oap.learn.service.itf.EmployeeService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 *		@Configuration, @Bean, @Lazy, @Primary, @Import and @DependsOn  
 */

public class Main1 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerShutdownHook();
		
		context.register(EmployeeConfig.class);
		context.refresh();
		
		EmployeeService service = context.getBean("empServ", EmployeeService.class);
		Employee pankesh = service.getEmployee();
		System.out.println("Employee from context \n" + pankesh);
		
	}
}
