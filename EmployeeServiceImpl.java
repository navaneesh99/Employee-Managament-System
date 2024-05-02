package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Entity.Employee;
import com.emp.repo.EmployeeRepository;



@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository repo;
	@Override
	public Employee createEmployee(Employee employee) {
		Employee employee_saved =repo.save(employee);
		return employee_saved;
		
		
	}

	
	@Override
	public Employee getEmployeeDetalisById(Long employeeId) {
		Optional<Employee> employee=repo.findById(employeeId);
		if(employee.isEmpty()) {
			throw new RuntimeException ("Account is not present");
		}
		
		Employee employee_found=employee.get();
		return employee_found;
		
	}

	@Override
	public List<Employee> getAllEmployeeDetalis() {
		List<Employee> listofEmployees=repo.findAll();
		return listofEmployees;
	}
	
	public Employee updateEmployeeById(Long employeeId, Employee employeeDetails) {
		  // Find the employee by ID
		  Optional<Employee> employeeOptional = repo.findById(employeeId);

		  if (employeeOptional.isPresent()) {
		    Employee existingEmployee = employeeOptional.get();

		    // Update employee details based on provided data (assuming non-null values)
		    if (employeeDetails.getEmployee_name() != null) {
		      existingEmployee.setEmployee_name(employeeDetails.getEmployee_name());
		    }
		    if (employeeDetails.getEmployee_department() != null) {
		      existingEmployee.setEmployee_department(employeeDetails.getEmployee_department());
		    }
		    if (employeeDetails.getEmployee_salary() != null) {
		      existingEmployee.setEmployee_salary(employeeDetails.getEmployee_salary());
		    }

		    // Save the updated employee
		    return repo.save(existingEmployee);
		  } 
		return employeeDetails;
		}

	
	@Override
	public void closeEmployee(Long employeeId) {
		getEmployeeDetalisById(employeeId);
		repo.deleteById(employeeId);
		
	}


	

	
	


}
