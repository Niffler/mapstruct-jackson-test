package org.example.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Target {
    private final String test;
    private final String name;

    @JsonCreator
    public Target(@JsonProperty("test") String test, @JsonProperty("name") String name) {
        this.test = test;
        this.name = name;
    }

    public String getTest() {
        return this.test;
    }

    public String getName() {
        return name;
    }
}
