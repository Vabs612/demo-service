package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String hello() {
		return "<h1>Hello</h1>";
	}

	@GetMapping("/hi")
	public String hi() {
		return "<h1>Hi</h1>";
	}

}
