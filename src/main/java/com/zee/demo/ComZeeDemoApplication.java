package com.zee.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zee.demo.service.EmployeeService;

import com.zee.demo.model.Employee;

@SpringBootApplication
public class ComZeeDemoApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(ComZeeDemoApplication.class, args);

		//run() is a static method 
		System.out.println("end");
		
		
//		EmployeeService service = new EmployeeService();
//		
//		Employee emp1=new Employee(101,"sonu",238749);
//		service.addEmployee(emp1);
//		
//		System.out.println(service.getAllEmployees().toString());
		
		
		
	}

}
