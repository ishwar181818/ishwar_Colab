package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
@RestController
public class HomeController {
	
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student s)
	
	{
		
		
		return null;
		
	}
	
	@GetMapping("/getAll")
	public String getStudent() {
		return "Student";
	}

	@GetMapping("/delete")
	public String deleteStudent(int rollno)
	{
		return "Student Will Be Deleted";
	}
}