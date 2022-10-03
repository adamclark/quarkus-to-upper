package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/toupper")
public class ToUpperResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String toUpper(@QueryParam("input") String input) {
        return input.toUpperCase();
    }
}