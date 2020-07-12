package org.ben.swagger.listarray;

import org.ben.swagger.listarray.dto.Event;
import org.ben.swagger.listarray.dto.Event1;
import org.ben.swagger.listarray.dto.Event2;
import org.ben.swagger.listarray.dto.EventList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventResource {

	private final static Logger logger = LoggerFactory.getLogger(EventResource.class);
	
	public EventResource() {
		// TODO Auto-generated constructor stub
	}

	@PostMapping(value = "/events", consumes = {"application/json" })
	public ResponseEntity<String> postEvent(@RequestBody EventList eventList) {
		logger.info("Reception list event");
		logger.info("Envoi id : " + eventList.getId());
		
		for (Event event : eventList.getEvents()) {
			if (event.getType().equals("typeEvent1")) {
				Event1 e1 = (Event1) event;
				logger.info("Event de type typeEvent1, Direction: " + e1.getDirection());
			} else if (event.getType().equals("typeEvent2")) {
				Event2 e2 = (Event2) event;
				logger.info("Event de type typeEvent2, Direction: " + e2.getStatus());
			}
		}
		Event event = eventList.getEvent(0);
		logger.info("Event 0 type " + event.getType() + ", Direction: " + ((Event1) event).getDirection() );
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
}
