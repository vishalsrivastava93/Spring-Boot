package com.vennmach.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.vennmach.springboot.rest.TopicController;

/**
 * 
 * @author Vishal Srivastava
 *
 */
@Service
public class TopicService {
	
	private final Logger logger=LoggerFactory.getLogger(TopicService.class);
	
	private List<Topic> topics= new ArrayList<Topic>( Arrays.asList(
			new Topic("Maths","101","Find X"),
			new Topic("Science","111","Find Velocity"),
			new Topic("Literature","666","Find ThySoul")

			));

	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id) {
		//A subtle way of return something without removing anything 
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic tp)
	{
		
		topics.add(tp);
		logger.info("Added topic, POST request complete");
	}
}
