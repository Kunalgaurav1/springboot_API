package com.springtest.springtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.springtest.entity.Course;
import com.springtest.springtest.services.CourseService;


@RestController


public class MyController {
	
	@Autowired
	private CourseService kunal;
	
	
	
	@GetMapping("/home")
	public String home() {
	return "this home page ";//hum yeha pe method bana usko return kr rhe hai 

}
	
	@GetMapping("/about")
	public String about() {
		return "this is about page ";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "this is contact page ";
	}
	
	
	
	@GetMapping("/Courses")
	public List<Course> getCourses(){
		
		return this.kunal.getcourses();
		
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	

}
