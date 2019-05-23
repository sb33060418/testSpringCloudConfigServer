package com.sunbin.test.spring.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbin.test.spring.cloud.provider.service.MessageService;

@RestController
@RequestMapping("/provider")
public class MessageContoller {

	@Autowired
	private MessageService messageService;

	@RequestMapping("/get")
	public String getMessage(String name) {
		return "provider returns: " + messageService.getMessage(name);
	}
}
