package org.dongjian.webapp.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dongjian.webapp.messenger.model.Message;
import org.dongjian.webapp.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService ms = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		return ms.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId")Long messageId){
		return ms.getMessage(messageId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message postMessage(Message message){
		return ms.addMessage(message);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message message){
		return ms.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public String deleteMessage(@PathParam("messageId")Long id){
		ms.removeMessage(id);
		return "removed successfully";
	}
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMessages(){
//		return "hello world";
//	}
}
