package com.spring.jdbc.Spring_Jdbc.Dao;

import com.spring.jdbc.Spring_Jdbc.entities.Student;

public interface StudentDao {

	public int inset(Student student);
	
	public int Update(Student student);
	
	public int Delete(Student student);
}
