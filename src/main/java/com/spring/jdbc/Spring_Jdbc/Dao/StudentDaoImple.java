package com.spring.jdbc.Spring_Jdbc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Spring_Jdbc.entities.Student;

public class StudentDaoImple implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int inset(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
