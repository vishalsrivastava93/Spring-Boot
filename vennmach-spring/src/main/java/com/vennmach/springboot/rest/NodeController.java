package com.vennmach.springboot.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vennmach.test.Node;

@RestController
public class NodeController {

	@RequestMapping("/getNodes")
	public List<Node> getNodes(){
		return Arrays.asList(
				new Node(23,"Root",new Node(21,"LeftChild",new Node(20,"Left Left Child",null))),
				new Node(22,"ABC",null)
				);
	}

}
