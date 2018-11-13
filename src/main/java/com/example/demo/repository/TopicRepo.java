package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.topic.Topic;

public interface TopicRepo extends JpaRepository<Topic, Long>{

}
