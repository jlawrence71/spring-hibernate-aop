package com.jbl.example.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	SessionFactory sessionFactory;
    
 	public void save(Employee e) {
    	sessionFactory.getCurrentSession().save(e);;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees() {
		List<Employee> employeeList = sessionFactory.getCurrentSession().createQuery("from Employee").list();
		return employeeList;
	}

	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployee(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}