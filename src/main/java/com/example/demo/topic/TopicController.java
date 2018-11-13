package com.example.demo.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.TopicRepo;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;

	@Autowired
	private TopicRepo topicRepo;

	@RequestMapping("/topics")
	public List<Topic> GetAllTopics() {

		return topicservice.GetAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic GetTopic(@PathVariable String id) {
		return topicservice.GetTopic(id);
	}

	@PostMapping("/topics")
	public void AddTopic(@RequestBody Topic topic) {
		topicservice.AddTopic(topic);
	}

	@PutMapping("/topics/{id}")
	public void UpdateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicservice.UpdateTopic(id, topic);
	}

	@DeleteMapping("/topics/{id}")
	public void DeleteTopic(@PathVariable String id) {
		topicservice.DeleteTopic(id);
	}

	@PostMapping("/topics/save")
	public void save(@RequestBody Topic topic) {
		topicRepo.save(topic);
	}

	@PutMapping("/topics/save")
	public void update(@RequestBody Topic topic) {
		topicRepo.save(topic);
	}

	@GetMapping("/topics/save/{id}")
	public Object delete(@PathVariable long id) {
		return topicRepo.findById(id);
	}

}
