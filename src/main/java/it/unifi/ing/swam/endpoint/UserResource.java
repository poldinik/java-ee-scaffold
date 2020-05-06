package it.unifi.ing.swam.endpoint;

import it.unifi.ing.swam.dao.UserDao;
import it.unifi.ing.swam.model.User;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/users")
@RequestScoped
public class UserResource {

    @Inject
    UserDao userDao;


    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(User user){
        return Response.ok(userDao.create(user), MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") Integer id){
        return Response.ok(userDao.read(id), MediaType.APPLICATION_JSON).build();
    }

}

