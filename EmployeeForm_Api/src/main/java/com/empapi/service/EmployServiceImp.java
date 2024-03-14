package com.empapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapi.entity.Employee;
import com.empapi.repo.Employrepo;

@Service
public class EmployServiceImp implements EmployService{

	@Autowired
	private Employrepo repo;
	@Override
	public void registerEmployee(Employee employee) {
		repo.save(employee);
		
	}
	
}
