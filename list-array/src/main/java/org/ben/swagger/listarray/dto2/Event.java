package org.ben.swagger.listarray.dto2;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * Tous les évenements Atos WL implémenteront cette interface.
 * Il faut ajouter tous ces types dans @JsonSubTypes
 * @author BENOITBlancard
 *
 */

@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property="typeEvent", defaultImpl=UnknownEvent.class)
@JsonSubTypes({ @Type(value = Event1.class, name = "typeEvent1"),
                @Type(value = Event2.class, name = "typeEvent2")})
public interface Event {

	String getType();
}
