package it.unifi.ing.swam.endpoint;


import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;


@Path("/hello")
@RequestScoped
public class HelloResource {

    @Inject
    @RestClient
    MockRestService mockRestService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello(){
        return Response.ok("ciao!").build();
    }

    @GET
    @Path("message")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMessage(){
        return Response.ok(mockRestService.getMessage(), MediaType.APPLICATION_JSON).build();
    }

}
