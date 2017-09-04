package com.chen.repository;

import java.util.List;

import com.chen.Message;

public interface MessageRepository {

	List<Message> findMessage(long max,int count);
	
}
