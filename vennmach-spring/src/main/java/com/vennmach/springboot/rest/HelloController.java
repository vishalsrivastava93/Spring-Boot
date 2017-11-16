package com.vennmach.springboot.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Vishal Srivastava
 *
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String getHi(){
		return "Hi";
	}

}
