package com.greatlearning.javafsd.studentmanagement.entity;

import javax.persistence.Column;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name= "student")
@Entity(name = "student_entity")
public class Student {

	
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="id")
	private int id;
	@Column(name = "name")
	private String name;
	
	@Column(name = "department")
	private String department;
	@Column(name = "country")
	private String country;

public  Student() {
	
}
	public Student(int id, String name, String department, String country) {
		super();
		
        this.name=name;
		this.id=id;
		this.department = department;
		this.country = country;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	
	}
