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
	
	@Override
	public int Update(Student student) {
		// Update the Value
		String query = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(),student.getId());
		return r;
	}
	
	@Override
	public int Delete(Student student) {
		// Delete query
		String query = "delete from student where id = ?";
		int r = this.jdbcTemplate.update(query,student.getId());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
