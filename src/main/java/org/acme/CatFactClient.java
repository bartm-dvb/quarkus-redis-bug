package org.acme;


import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "cat-fact-client")
public interface CatFactClient {

  @GET
  @Path("fact")
  Uni<CatFact> getCatFact();

}
