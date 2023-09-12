package com.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String m1() {
		return "Welcome to spring boot";
	}
	
	@GetMapping("/hello2")
	public String m2() {
		return "Welcome to spring boot";
	}
	

	@GetMapping("/hello4")
	public String m4() {
	return "Welcome to spring boot";
	}
  
	@GetMapping("/hello3")
	public String m3() {
		return "Welcome to spring boot";
	}
}
