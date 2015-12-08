 package org.dongjian.webapp.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private long id;
	private String messages;
	private Date created;
	private String author;
	
	public Message(){
	}

	public Message(long id, String messages, String author){
		this.id = id;
		this.messages = messages;
		this.author = author;
		this.created = new Date();
	}
	
	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public long getId(){
		return id;
	}
	
	public Date getDate(){
		return created;
	}
	
	public String getAuthor(){
		return author;
	}
	
}
