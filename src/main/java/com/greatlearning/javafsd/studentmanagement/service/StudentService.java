package com.greatlearning.javafsd.studentmanagement.service;

import java.util.List;



import com.greatlearning.javafsd.studentmanagement.entity.Student;

public interface StudentService {

List<Student> listAll();
public Student findById(int theId);

public void save(Student theStudent);

public void deleteById(int theId);




}
	

