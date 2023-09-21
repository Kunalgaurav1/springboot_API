package com.springtest.springtest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;


import com.springtest.springtest.entity.Course;

@Service



public class CourseServiceImpl implements CourseService {
	
	List <Course>  list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(1343, "core java", "mast hai"));
		list.add(new Course(3434, "react js", "for development"));
	}
	@Override
	public List<Course> getcourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
