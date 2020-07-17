package org.ben.swagger.listarray.dto2;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class UnknownEvent implements Event {
	
	private Map<String, Object> properties = new HashMap<String, Object>();

	public UnknownEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Unknown";
	}
	
	@JsonAnySetter
    public void set(String name, Object value) {
        this.properties.put(name, value);
    }

    @JsonAnyGetter
    public Map<String, Object> properties() {
        return this.properties;
    }

}
