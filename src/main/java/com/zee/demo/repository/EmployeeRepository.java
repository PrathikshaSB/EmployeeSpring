package com.zee.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zee.demo.model.Employee;


//we can extend CrudRepository and PagingAndSortingRepository
//provide methods for basic crud operations
//like insert update delete search


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	public abstract List<Employee> findByFirstName(String name);
	
	public abstract List<Employee> findBySalary(double salary);
	
//	@Query(name="SELECT E FROM EMPLOYEE WHERE E.SALARY = ?1") //JPQL
//	public abstract List<Employee> findBySalary(double salary);
//	
//	public abstract List<Employee> findBySalaryGreaterThan(double salary);
//	
//	public abstract List<Employee> findBySalaryLesserThan(double salary);
//	
//	public abstract List<Employee> findBySalaryBetweeen(double salary1, double salary2);
	
}
