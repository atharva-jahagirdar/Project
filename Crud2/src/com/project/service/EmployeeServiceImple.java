package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.dao.EmployeeDao;
import com.project.model.Employee;

public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	
	@Override
	public void save(Employee employee) {
		
		employeeDao.save(employee);
	}



	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void delete(int user_id) {
		employeeDao.delete(user_id);
		
	}

	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);
		
	}

	@Override
	public List<Employee> list() {
		
		return employeeDao.list();
	}
	

}
