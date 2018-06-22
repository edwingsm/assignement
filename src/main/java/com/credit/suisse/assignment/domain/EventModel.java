package com.credit.suisse.assignment.domain;

import java.util.Date;

public class EventModel {
	/*
	 {"id":"scsmbstgra", "state":"FINISHED", type:"APPLICATION_LOG",
host:"12345", "timestamp":1491377495217} 
	 */
	
	private String id;
	private Date timestamp;
	private String type;
	private String host;
	private EventState state;
	
	
	
	public EventModel(String id, Date timestamp, String type, String host, EventState state) {
		this.id = id;
		this.timestamp = timestamp;
		this.type = type;
		this.host = host;
		this.state = state;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public EventState getState() {
		return state;
	}
	public void setState(EventState state) {
		this.state = state;
	}
	
	

	
}
