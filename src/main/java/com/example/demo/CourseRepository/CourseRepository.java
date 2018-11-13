package com.example.demo.CourseRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Course.Course;
import com.example.demo.topic.Topic;

public interface CourseRepository extends JpaRepository<Course, Long>{
	

}
