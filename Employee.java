package com.emp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long employee_id;
	
	@Column
	private String employee_name;
	@Column
	private String employee_department;
    @Column
	private Double employee_salary;
    
    
    
    public Employee() {
    	
    }
	
	public Employee(String employee_name, String employee_department, Double employee_salary) {
		super();
		this.employee_name = employee_name;
		this.employee_department = employee_department;
		this.employee_salary = employee_salary;

	}
    public Long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_department() {
		return employee_department;
	}

	public void setEmployee_department(String employee_department) {
		this.employee_department = employee_department;
	}

	public Double getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(Double employee_salary) {
		this.employee_salary = employee_salary;
	}

	

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_department="
				+ employee_department + ", employee_salary=" + employee_salary +  "]";
	}
	

	





	
    
    

}
