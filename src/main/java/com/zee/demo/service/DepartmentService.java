package com.zee.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.demo.model.Department;
import com.zee.demo.model.Department;
import com.zee.demo.repository.DepartmentRepository;
import com.zee.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DepartmentRepository repository;

	public List<Department> getAllDepartments() {
		LOG.info("getAllDepartments"); 
		return repository.findAll();
	}

	public Department getDepartmentById(int departmentId) {
		LOG.info("getAllDepartmentByID");
		return repository.findById(departmentId).get();
	}

	public Department addDepartment(Department department) {
		LOG.info("AddDepartment");
		return repository.save(department);
	}

}