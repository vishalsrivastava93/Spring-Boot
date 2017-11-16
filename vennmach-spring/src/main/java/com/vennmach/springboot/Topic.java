package com.vennmach.springboot;
/**
 * 
 * @author Vishal Srivastava
 *
 */
public class Topic {

	private String topic;
	private String  id;
	private String description;

	public Topic() {
	}

	public Topic(String topic, String id, String description) {
		super();
		this.topic = topic;
		this.id = id;
		this.description = description;
	}
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}



}
