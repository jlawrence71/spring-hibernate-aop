package com.jbl.example.hibernate;

import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	private static Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService svc = (EmployeeService) context.getBean("employeeService");
		
		Employee employee = new Employee();
		employee.setName("James");
		employee.setSalary(99.99f);
		
		svc.save(employee);
		
		logger.info("Employee::"+employee);
		
		List<Employee> list = svc.getEmployees();
		
		for(Employee p : list){
			logger.info("Employee List::"+p);
		}
		
		//close resources
		context.close();	
	}
}