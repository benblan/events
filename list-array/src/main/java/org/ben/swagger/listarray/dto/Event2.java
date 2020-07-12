package org.ben.swagger.listarray.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("typeEvent2")
public class Event2 implements Event {

	private String status;
	
	public Event2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType() {
		return "typeEvent2";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
