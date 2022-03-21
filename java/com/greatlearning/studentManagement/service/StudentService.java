package com.greatlearning.studentManagement.service;

import org.springframework.stereotype.Service;

import com.greatlearning.studentManagement.entity.Student;

import java.util.*;


@Service
public interface StudentService {
	
	public List<Student> findAll();
	public Student findById(int id);
	public void save(Student theStudent);
	public void deleteById(int theId);

}
