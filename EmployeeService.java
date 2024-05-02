package com.emp.service;

import java.util.List;

import com.emp.Entity.Employee;



public interface EmployeeService {
	
public Employee createEmployee(Employee employee);

public Employee getEmployeeDetalisById(Long employeeId);

public List<Employee> getAllEmployeeDetalis();

public void closeEmployee(Long employeeId);

public Employee updateEmployeeById(Long employeeId, Employee employeeDetails);



	
}
	
	


