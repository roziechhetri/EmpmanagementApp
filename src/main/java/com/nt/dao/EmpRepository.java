package com.nt.dao;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee,String>{

}
