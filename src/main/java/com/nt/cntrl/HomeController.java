package com.nt.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;
import com.nt.service.EmpService;

@RestController
public class HomeController {

	@Autowired
	EmpService service;
	
	@GetMapping("/emp/id/{id}")
	@ResponseBody 
	public Employee getEmpById(@PathVariable("id") String id) {
		return service.getByID(id);
		
	}
	
	@GetMapping("/all")
	public List<Employee> getAll(){
		return service.getAll();
	}
	@PostMapping("/add")
	public String add(@RequestBody Employee e) {
		service.add(e);
		return "OK";
	}
	
}
