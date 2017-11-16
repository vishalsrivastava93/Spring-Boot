package com.vennmach.test;
/**
 * 
 * @author Vishal Srivastava
 *
 */
public class Node {
	
	int data;
	String name;
	Node nextNode;
	
	public Node(int data, String name, Node nextNode) {
		super();
		this.data = data;
		this.name = name;
		this.nextNode = nextNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
}

