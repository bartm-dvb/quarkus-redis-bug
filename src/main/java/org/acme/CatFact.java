package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CatFact(
    @JsonProperty("fact") String fact,
    @JsonProperty("length") int length) {

}
