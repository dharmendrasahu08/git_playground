package com.demo;


import javax.json.JsonStructure;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.ext.Provider;
import org.apache.johnzon.jaxrs.jsonb.jaxrs.JsonbJaxrsProvider;
import java.io.OutputStream;


import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;




/*
@Provider
@Produces({ "application/json", "application/*+json" })
@Consumes({ "application/json", "application/*+json" })
public class MyJsonbJaxRsProvider<T> extends JsonbJaxrsProvider<T> {
	
	public boolean isWriteable(final Class<?> rawType, final Type genericType, final Annotation[] annotations,
			final MediaType mediaType) {
		return super.isWriteable(rawType, genericType, annotations, mediaType)
				&& !OutputStream.class.isAssignableFrom(rawType) && !StreamingOutput.class.isAssignableFrom(rawType)
				&& !Writer.class.isAssignableFrom(rawType) && !Response.class.isAssignableFrom(rawType)
				&& !JsonStructure.class.isAssignableFrom(rawType);
	}
}
*/