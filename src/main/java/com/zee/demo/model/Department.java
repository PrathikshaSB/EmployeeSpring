package com.zee.demo.model;

import javax.persistence.*;

@Entity
@Table(name="dep_table")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="departmentId")
	private int departmentId;
	
	@Column(name="departmentName")
	private String departentName;
	
	@Column(name="city")
	private String city;
	
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartentName() {
		return departentName;
	}
	public void setDepartentName(String departentName) {
		this.departentName = departentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Department(int departmentId, String departentName, String city) {
		super();
		this.departmentId = departmentId;
		this.departentName = departentName;
		this.city = city;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
