package it.unifi.ing.swam.endpoint;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.HashMap;

@Path("/v2")
@RegisterRestClient
public interface MockRestService {

    @GET
    @Path("/5185415ba171ea3a00704eed")
    HashMap<String, String> getMessage();
}
