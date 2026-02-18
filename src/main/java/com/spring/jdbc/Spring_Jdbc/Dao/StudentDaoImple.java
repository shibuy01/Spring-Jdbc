package com.spring.jdbc.Spring_Jdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
	
	@Override
	public Student getStudent(int studentId) {
		// Select single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper= new RowMapperImp();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	@Override
	public List<Student> getAllStudent() {
		// Selecting Multiple Student Data
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImp());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
