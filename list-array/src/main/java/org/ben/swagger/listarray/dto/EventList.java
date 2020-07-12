package org.ben.swagger.listarray.dto;

import java.util.ArrayList;
import java.util.List;

public class EventList {

	private int id;
	private List<Event> events;
	
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Event getEvent(int index) {
		return events.get(index);
	}

	public void addEvent(Event anEvent) {
		this.events.add(anEvent);
	}
	
	public EventList() {
		
	}

	public EventList(int id) {
		this.id = id;
		events = new ArrayList<Event>();
	}
}
