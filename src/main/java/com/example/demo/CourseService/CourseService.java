package com.example.demo.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Course.Course;
import com.example.demo.CourseRepository.CourseRepository;
import com.example.demo.topic.Topic;


@Service
public class CourseService {
	
	@Autowired
	private Course course;
	
	@Autowired
	private CourseRepository courserepository; 
	
	public List<Course> GetAllCourses() {
		return courserepository.findAll() ;
		
		public Course GetCourse(String id)
		{
			
				if (course.getId().equals(id)) 
				{
					return course.get;
				}
			
			return null;

		}
		
		
		
		
		
		
		
	}

	
	

}
