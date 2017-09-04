package com.chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chen.repository.MessageRepository;

@Controller
@RequestMapping("/msg")
public class MessageController {
	
	private MessageRepository messageRepository;
	
	@Autowired
	public MessageController(MessageRepository messageRepository){
		this.messageRepository = messageRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String message(Model model){
		
		model.addAttribute("messageList",messageRepository.findMessage(40, 20));
		return "message";
	}
	
}
