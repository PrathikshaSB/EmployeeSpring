package com.zee.demo.service;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	//its used only in this class so private, val wont change so final, Logger is the interface 
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> getAllEmployees(){
		
//		return new ArrayList<Employee>();
//		System.out.println("get employees");
		
		LOG.info("getAllEmployees");
		
		return repository.findAll();
	}
	

	
	public Employee getEmployeeById(int employeeId) {
//		return null;
//		System.out.println("get employee "+employeeId);
		
		LOG.info("getAllEmployeeById"+employeeId);
		
		
		//return repository.findById(employeeId).get();
		//findById return Optional obj, means it may or may not contain Employee obj
		//if it exists, get() will execute, else, get() will fail
		
		
		Optional<Employee> empOpt=repository.findById(employeeId);
		Employee empObj;
		try {
			empObj = empOpt.get();
			return empObj;
		}
		catch(NoSuchElementException e) {
			LOG.warn(e.getMessage());
			return null;
		}
		
		
		
	}

	public Employee addEmployee(Employee employee) {
//		return null;
//		System.out.println("add employee");
		LOG.info("addEmployee");
		return repository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee) {
//		return null;
//		System.out.println("upd employee");
		LOG.info("updateEmployees");
		
		
		Optional<Employee> empOpt=repository.findById(employee.getEmployeeId());
		if(empOpt.isPresent()) {
			return repository.save(employee);
		}
		else {
			LOG.warn("employee with id "+employee.getEmployeeId()+" doesnt exists");
			return null;
		}
		
	}
	
	
	
	
	public Employee deleteEmployee(int employeeId) {
//		return null;
//		Employee emp=repository.findById(employeeId).get();
//		System.out.println("del employee");
		
		
		
		Optional<Employee> empOpt=repository.findById(employeeId);
		if(empOpt.isPresent()) {
			Employee emp=repository.findById(employeeId).get();
			repository.delete(emp);
			return emp;
		}
		else {
			LOG.warn("employee with id "+employeeId+" doesnt exists");
			return null;
		}
		
		
//		LOG.info("deleteEmployee "+employeeId);
//		repository.delete(emp);
//		return emp;
	}
	public Employee getEmployeeByfn(String fn) {
//		System.out.println("get employee "+fn);
		LOG.info("getEmployeeByFirstnAME"+fn);
		return repository.findByFirstName(fn).get(0);
	}
	
}
