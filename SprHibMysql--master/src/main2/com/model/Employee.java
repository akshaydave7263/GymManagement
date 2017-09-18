package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	/*@Column
	@GeneratedValue(strategy = GenerationType.AUTO)*/
	private int id;

	private  String name;

	private int Dept;

	private String manager;
	
	public int getDept() {
		return Dept;
	}
	
	public void setDept(int dept) {
		Dept = dept;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
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
	public Employee(int id, String name, int dept, String manager) {
		super();
		this.id = id;
		this.name = name;
		Dept = dept;
		this.manager = manager;
	}

	

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "\t" +"Employee Id=" + id + ", Name=" + name + ", Dept=" + Dept + ", Manager=" + manager + "";
	}
	
	

}
