package com.example.demo;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/quilometros")
@Singleton
public class QuilometrosController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Quilometros converterQuilometrosParaNos(Nos nos) {
        Quilometros quilometros = new Quilometros(String.valueOf(Double.parseDouble(nos.getNos()) * 1.852));
        return quilometros;
    }
    
}
