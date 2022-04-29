package com.zee.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zee.demo.service.EmployeeService;

import com.zee.demo.model.Employee;

@SpringBootApplication
public class ComZeeDemoApplication {
	
	

	
	private final static Logger LOG = LoggerFactory.getLogger(ComZeeDemoApplication.class);

	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(ComZeeDemoApplication.class, args);
		//run() is a static method 
		LOG.info("End");

		
		
//		EmployeeService service = new EmployeeService();
//		
//		Employee emp1=new Employee(101,"sonu",238749);
//		service.addEmployee(emp1);
//		
//		System.out.println(service.getAllEmployees().toString());
		
	}

}
