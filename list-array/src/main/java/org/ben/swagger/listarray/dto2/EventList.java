package org.ben.swagger.listarray.dto2;

import java.util.ArrayList;
import java.util.List;

public class EventList {

	private int idempotencyKey;
	private List<Event> events;
	
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public int getIdempotencyKey() {
		return idempotencyKey;
	}
	
	public void setIdempotencyKey(int idempotencyKey) {
		this.idempotencyKey = idempotencyKey;
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
		this.idempotencyKey = id;
		events = new ArrayList<Event>();
	}
}
