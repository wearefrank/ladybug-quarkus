package org.wearefrank;

import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.nn.testtool.TestTool;

@Path("/hello")
public class GreetingResource {
	@Inject
	TestTool testTool;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		String correlationId = UUID.randomUUID().toString();
		testTool.startpoint(correlationId, this.getClass().getName(), "Hello", "First level start");
		testTool.startpoint(correlationId, this.getClass().getName(), "Hello 2", "Second level start");
		testTool.endpoint(correlationId, this.getClass().getName(), "Hello 2", "Second level end");
		testTool.endpoint(correlationId, this.getClass().getName(), "Hello", "First level end");
		return "Hello from RESTEasy Reactive";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{name}")
	public String hello(@PathParam("name") String name) {
		String correlationId = UUID.randomUUID().toString();
		testTool.startpoint(correlationId, this.getClass().getName(), "hello", name);
		return testTool.endpoint(correlationId, this.getClass().getName(), "hello", "Hello from RESTEasy Reactive");
	}

}