package com.jbl.example.hibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public void save(Employee e){
		employeeDAO.save(e);
	}
	
	public List<Employee> getEmployees(){
		return employeeDAO.getEmployees();
	}
}
