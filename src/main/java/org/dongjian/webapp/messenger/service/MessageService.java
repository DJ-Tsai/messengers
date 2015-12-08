package org.dongjian.webapp.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dongjian.webapp.messenger.database.DBClass;
import org.dongjian.webapp.messenger.model.Message;

public class MessageService {
	
	private Map<Long,Message> messages;
	
	public MessageService(){
		messages = DBClass.getMessagesMap();
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if (message.getId()<=0)
			return null;
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(Message message){
		return message;
	}
/*	
	// First Version
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L,"Hello world","Dongjian");
		Message m2 = new Message(2L,"Hello jersey","DJ");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	}
		
	public Message getMessage(Long id){
		return new Message(1L,"Hello world","Dongjian");
	}
*/
	
	
	
}
	