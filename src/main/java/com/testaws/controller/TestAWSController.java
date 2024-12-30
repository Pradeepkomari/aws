package com.testaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AWS")
public class TestAWSController {

	@GetMapping("/msg")
	public String getAws() {
		return "Hello Aws";
	}
}
