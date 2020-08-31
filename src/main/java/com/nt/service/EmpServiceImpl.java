package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmpRepository;
import com.nt.entity.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepository empRepo;

	@Override
	public Employee getByID(String id) {
		
		return empRepo.findById(id).get();
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> list = new ArrayList<Employee>();
		Iterable<Employee> itr = empRepo.findAll();
		for (Employee e : itr)
			list.add(e);
		return list;
	}

	@Override
	public void add(Employee e) {
		empRepo.save(e);//insert or update
	}

}
