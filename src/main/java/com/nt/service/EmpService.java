package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface EmpService {
	Employee getByID(String id);

	List<Employee> getAll();

	void add(Employee e);

}
