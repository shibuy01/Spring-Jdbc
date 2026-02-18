package com.spring.jdbc.Spring_Jdbc.Dao;

import java.util.List;

import com.spring.jdbc.Spring_Jdbc.entities.Student;

public interface StudentDao {

	public int inset(Student student);
	
	public int Update(Student student);
	
	public int Delete(Student student);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudent();
}
