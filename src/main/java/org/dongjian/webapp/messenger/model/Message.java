 package org.dongjian.webapp.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	public long id;
	public String messages;
	public Date created;
	public String author;
	
	public Message(){
	}

	public Message(long id, String messages, String author){
		this.id = id;
		this.messages = messages;
		this.author = author;
		this.created = new Date();
	}
	
	public long getId(){
		return id;
	}
	
	public String getMessage(){
		return messages;
	}
	
	public Date getDate(){
		return created;
	}
	
	public String getAuthor(){
		return author;
	}
	
}
