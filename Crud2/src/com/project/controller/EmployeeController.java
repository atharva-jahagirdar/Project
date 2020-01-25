package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.model.Employee;
import com.project.service.EmployeeService;

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	@RequestMapping(value="/compReg", method = RequestMethod.POST)
	public String add(@ModelAttribute() Employee emp)
	{
		employeeService.save(emp);
		return "index";
	}

}
