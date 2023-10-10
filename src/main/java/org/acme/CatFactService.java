package org.acme;

import io.quarkus.cache.CacheResult;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class CatFactService {

  @Inject @RestClient CatFactClient catFactClient;

  @CacheResult(cacheName = "cat-fact")
  Uni<CatFact> getCatFact() {
    return catFactClient.getCatFact();
  }

}
