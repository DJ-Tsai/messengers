package org.dongjian.webapp.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.dongjian.webapp.messenger.model.Message;

public class DBClass {
	private static Map<Long,Message> messages = new HashMap<Long, Message>();
	//private static Map<Long,Profile> profiles = new HashMap<Long, Profile>();
	
	
//	public static Map<Long,Profile> getProfiles(){
//		return profiles;
//	}
	
	public static Map<Long,Message> getMessagesMap(){
		messages.put(1L,new Message(1L,"Hello world","Dongjian"));
		messages.put(2L,new Message(2L,"Hello jersey","DJ"));
		return messages;
	}
}
