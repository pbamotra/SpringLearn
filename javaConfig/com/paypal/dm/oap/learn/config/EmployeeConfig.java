package com.paypal.dm.oap.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.paypal.dm.oap.learn.classes.Department;
import com.paypal.dm.oap.learn.service.EmployeeServiceImpl;
import com.paypal.dm.oap.learn.service.itf.EmployeeService;

@Configuration
@Import(PropertyConfigurer.class)
@PropertySource("learn.properties")
public class EmployeeConfig {
	
	private @Value("${employee.name}") String name;
	private @Value("${employee.id}") int id;
	private @Value("${employee.age}") byte age;
	private @Value("${employee.dept}") String dept;
	
	public EmployeeConfig() {
		super();
	}
	
	@Primary
	public @Bean(name = "dept", initMethod = "print") Department getDept() {
		return new Department(dept);
	}
	
	public @Bean(name = "dept", initMethod = "print") Department getDept2() {
		return new Department("Compliance");
	}
	
	public @Lazy @Bean(name = "empServ") @DependsOn("dept") EmployeeService employeeService() {
		return new EmployeeServiceImpl(id, name, age, getDept());
	}
}
