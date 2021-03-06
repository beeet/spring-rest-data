package ch.suva.restdata.intranet.entities;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Geschlecht {
    M("maennlich"),
    F("weiblich");
    
    @JsonValue
    private String text;
    
    Geschlecht(String text) {
        this.text = text;
    }
    
}
