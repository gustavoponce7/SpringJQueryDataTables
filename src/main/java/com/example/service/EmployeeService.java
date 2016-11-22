package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(long id);
	
}
