package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping({ "/", "/v1", "/hello" })
	public String hello() {
		return "Api working fine thanks........";
	}
}
