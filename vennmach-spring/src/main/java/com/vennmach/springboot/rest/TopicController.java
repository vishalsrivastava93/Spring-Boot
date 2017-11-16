package com.vennmach.springboot.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vennmach.springboot.Topic;
import com.vennmach.springboot.TopicService;
/**
 * 
 * @author Vishal Srivastava
 *
 */
@RestController
public class TopicController {

	private final Logger logger=LoggerFactory.getLogger(TopicController.class);
	@Autowired
	private TopicService topicService;  //Marking it autowired means it needs dependency injection

	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return topicService.getAllTopics();

	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}

	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		//This method accepts a payload json and the spring mvc converts that json to a Topic Object
		topicService.addTopic((Topic)topic);
		
		
	}
}
