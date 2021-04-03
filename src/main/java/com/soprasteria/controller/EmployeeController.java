package com.soprasteria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class EmployeeController {

	@GetMapping("/get")
	public String getAll()
	{
		return "Ganesh Patil";
	}
	
	@PostMapping("/add")
	public String addEmp(@RequestBody final String hello) {
		return hello;
	}
	
}
