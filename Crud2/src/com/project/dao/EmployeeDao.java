package com.project.dao;

import java.util.List;

import com.project.model.Employee;

public interface EmployeeDao {
	
	public void save(Employee employee);
	public void delete(int user_id);
	public void update(Employee employee); 
	public List<Employee> list();

}
