package com.example.demo.Course;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.example.demo.topic.Topic;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Course_id;
	private String id;
	private String name;
	private String description;
	
	
	private Topic topic;
	
	
	public Course(String id, String name, String description) {
	
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public List<Course> getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
