package com.employeeapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeapp.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
