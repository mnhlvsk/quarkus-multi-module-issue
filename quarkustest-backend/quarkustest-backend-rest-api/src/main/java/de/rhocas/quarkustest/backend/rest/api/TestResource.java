package de.rhocas.quarkustest.backend.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path( "/api/test" )
public class TestResource {

	@GET
	@Path( "/" )
	public String hello( ) {
		return "hello";
	}

}
