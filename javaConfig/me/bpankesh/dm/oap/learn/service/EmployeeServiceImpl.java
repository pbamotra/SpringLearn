package me.bpankesh.dm.oap.learn.service;

import me.bpankesh.dm.oap.learn.classes.Department;
import me.bpankesh.dm.oap.learn.classes.Employee;
import me.bpankesh.dm.oap.learn.service.itf.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	private int id;
	private String name;
	private byte age;
	private Department dept;
	
	public EmployeeServiceImpl() {
		super();
	}

	public EmployeeServiceImpl(int id, String name, byte age, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	@Override
	public Employee getEmployee() {
		return new Employee(id, name, age, dept);
	}
	
	public void print() {
		System.out.println( "EmployeeService [id=" + id + ", name=" + name + ", age=" + age
				+ ", dept=" + dept + "]");
	}
	
	
}
