package com.timeservice.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeServiceController {

	@RequestMapping(value="/currentTime")
	public String getCurrentTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTime.toString();
	}
}
