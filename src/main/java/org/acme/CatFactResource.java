package org.acme;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/cat-fact")
public class CatFactResource {

    @Inject CatFactService catFactService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<CatFact> hello() {
        return catFactService.getCatFact();
    }
}
