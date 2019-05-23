package com.sunbin.test.spring.cloud.provider.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	public String getMessage(String name) {
		return "spring cloud welcomes you, " + name;
	}
}
