package com.example.demo.CourseController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Course.Course;
import com.example.demo.CourseService.CourseService;

@RestController
public class CourseController {
	
	private CourseService courseservice;
	
	@GetMapping("/courses")
	public List<Course> GetAllTopics() {
		return courseservice.GetAllCourses();
	}

	
}
