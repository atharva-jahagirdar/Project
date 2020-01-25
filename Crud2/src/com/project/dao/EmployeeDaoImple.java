package com.project.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.project.model.Employee;

public class EmployeeDaoImple implements EmployeeDao{
	
	 private JdbcTemplate jdbcTemplate;
	 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(Employee employee) {
		String sql = "insert into user values(?,?,?,?)";
		jdbcTemplate.update(sql,employee.getUser_id(),employee.getUser_name(),employee.getSalary(),employee.getAddress());
		
	}

	@Override
	public void delete(int user_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
