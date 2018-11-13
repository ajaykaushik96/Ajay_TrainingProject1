package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(

			new Topic("Spring", "Spring Framework", "Spring framework Description"),
			new Topic("Java", "Core Java", "Core java  Description"),
			new Topic("JavaScript", "JavaScript ", "JavaScript framework Description")

	));

	
	
	
	public List<Topic> GetAllTopics() {
		return topics;
	}

	public Topic GetTopic(String id) {
		for (Topic tt : topics) {
			if (tt.getId().equals(id)) {
				return tt;
			}
		}
		return null;
	}

	public void AddTopic(Topic topic) {

		topics.add(topic);
	}

	public void UpdateTopic (String id ,Topic topic)
	{
		for(int i=0; i<topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
{
	topics.set(i, topic);
	return;
}
		}
	}

	 public void DeleteTopic( String id)
	 {
		 for(int i=0; i<topics.size(); i++)
			{
				Topic t = topics.get(i);
				if(t.getId().equals(id))
	{
		topics.remove(i);
		return;
	}
			}
		 
	 }
	
}