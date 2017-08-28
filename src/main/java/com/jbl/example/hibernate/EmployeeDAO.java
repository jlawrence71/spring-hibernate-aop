package com.jbl.example.hibernate;

import java.util.List;

public interface EmployeeDAO {

	public void save(Employee e);
	public Employee getEmployeeById(int employeeId);
	public Employee getEmployee(String name);
	public List<Employee> getEmployees();
}
