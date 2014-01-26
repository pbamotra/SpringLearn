package com.paypal.dm.oap.learn.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.paypal.dm.oap.learn.classes.Employee;
import com.paypal.dm.oap.learn.config.EmployeeConfig;
import com.paypal.dm.oap.learn.service.itf.EmployeeService;

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
