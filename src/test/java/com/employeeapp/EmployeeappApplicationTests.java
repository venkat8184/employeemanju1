package com.employeeapp;

import java.util.Optional;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employeeapp.entites.Employee;
import com.employeeapp.repositories.EmployeeRepository;

@SpringBootTest
class EmployeeappApplicationTests {
	

	@Autowired
	private EmployeeRepository empRepo;
	
	
	@Test
	void SaveOneEmp() {
	  Employee emp=new Employee();
	  emp.setName("Ramanna");
	  emp.setEmaild("Ramana@1923");
	  emp.setPhone(95027709779l);
	  empRepo.save(emp);
	}
	@Test
	void findOneEmp() {
		Optional<Employee> findById = empRepo.findById(21l);
        if(findById.isPresent()) {
        	Employee employee = findById.get();
        System.out.println(employee.getId());
        System.out.println(employee.getEmaild());
        System.out.println(employee.getPhone());
        System.out.println(employee.getName());
        }else
        	System.out.println("Not Present with the refernce verable"+2l);
	}
	@Test
	void deletOneEmp() {
		empRepo.deleteById(2l);
		System.out.println("Record With id "+2l+"is deleted");
		
	}
	@Test
	void updateOneEmp() {
		Optional<Employee> findById = empRepo.findById(4l);
		if(findById.isPresent()) {
			Employee employee = findById.get();
			employee.setEmaild("Venkataramana@gmail.com");
			employee.setName("Venkataramana");
			employee.setPhone(798632757l);
		empRepo.save(employee);
		System.out.println("Updated employee with id "+4l+" is updated");
		}
	}
	
	

}
