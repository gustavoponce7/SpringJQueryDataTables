package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
