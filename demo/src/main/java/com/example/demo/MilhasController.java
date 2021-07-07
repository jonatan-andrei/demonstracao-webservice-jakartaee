package com.example.demo;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/milhas")
@Singleton
public class MilhasController {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String converterMilhasParaQuilometros(@FormParam("quilometros") double quilometros) {
        return String.valueOf(quilometros * 0.621371);
    }
}
