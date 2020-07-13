package org.ben.swagger.listarray.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Un exemple d'événements AtosWL
 * @author BENOITBlancard
 *
 */
@JsonRootName("typeEvent1")
public class Event1 implements Event {

	private String direction;
	
	public Event1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType() {
		return "typeEvent1";
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
