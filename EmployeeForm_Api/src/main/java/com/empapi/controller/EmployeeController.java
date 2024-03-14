package com.empapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.empapi.entity.Employee;
import com.empapi.service.EmployService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployService service;
	@GetMapping("/")
	public String register(Model model) {
		Employee employee= new Employee();
		model.addAttribute("employee", employee);
		
		return "register";
	}
	
	@PostMapping("/registerEmployee")
	public String registerEmployee(@ModelAttribute("employee") Employee employee) {
		String result="error";
		System.out.println(employee);
		if(employee.getEpass().equals(employee.getEcopass())){
			
			try {
				service.registerEmployee(employee);
				result ="home";
				
			} 
			catch (Exception e) {
				result ="error password";
			}
		}
		return result;
	}

}
