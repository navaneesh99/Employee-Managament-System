package com.emp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.Entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee ,Long>{

	Employee save(Optional<Employee> employee);

}
