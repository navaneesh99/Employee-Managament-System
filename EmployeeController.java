package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.Entity.Employee;
import com.emp.service.EmployeeService;




@RestController
@RequestMapping("/employee")
public class EmployeeController {
  @Autowired
 EmployeeService service;
  
  @PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		 Employee createEmployee=service.createEmployee(employee);
		
		
		return  ResponseEntity.status(HttpStatus.CREATED).body(createEmployee);

}
  
  
  @GetMapping("/{employeeId}")
	public Employee getEmployeeDetalisById(@PathVariable Long employeeId) {
		Employee employee=service.getEmployeeDetalisById(employeeId);
		return employee;
		
		
	}
  
  @GetMapping("/getallemployees")
	public java.util.List<Employee> getallaAccountdetalis(){
		
	
	 java.util.List<Employee> allEmployeeDetalis=service.getAllEmployeeDetalis();
	return allEmployeeDetalis;
		
	}
  @PutMapping("/update/{employeeId}")
  public ResponseEntity<Employee> updateEmployee(@PathVariable Long employeeId, @RequestBody Employee employeeDetails) {
    Employee updatedEmployee = service.updateEmployeeById(employeeId, employeeDetails);
    return ResponseEntity.ok(updatedEmployee);
  }
  
  
  
  @DeleteMapping("/delete/{employee_id}")
	public ResponseEntity <String> deleteAccount(@PathVariable Long employee_id){
		service.closeEmployee(employee_id);
		return ResponseEntity.ok("Account Closed");
		
	}
  
  
}
