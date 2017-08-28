package com.jbl.example.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {  

	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;  
	@Column(name="name", nullable=false)
	private String name;  
	@Column(name="salary", nullable=false)
	private float salary;
	
	//getters and setters  

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}  
  
  
	public String toString(){
		return "id="+id+", name="+name+", salary="+salary;		
	}
}  