package com.zee.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.demo.model.Employee;
import com.zee.demo.repository.EmployeeRepository;

//CRUD
//getAllEmployees
//getEmployeeById
//addEmployee
//updateEmployee
//deleteEmployee

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> getAllEmployees(){
//		return new ArrayList<Employee>();
		System.out.println("get employees");
		return repository.findAll();
	}
	

	
	public Employee getEmployeeById(int employeeId) {
//		return null;
		System.out.println("get employee "+employeeId);
		return repository.findById(employeeId).get();
	}

	public Employee addEmployee(Employee employee) {
//		return null;
		System.out.println("add employee");
		return repository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee) {
//		return null;
		System.out.println("upd employee");
		return repository.save(employee);
	}
	public Employee deleteEmployee(int employeeId) {
//		return null;
		Employee emp=repository.findById(employeeId).get();
		System.out.println("del employee");
		repository.delete(emp);
		return emp;
	}
	public Employee getEmployeeByfn(String fn) {
		System.out.println("get employee "+fn);
		return repository.findByFirstName(fn).get(0);
	}
	
}
