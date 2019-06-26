package org.trellisldp;

import java.util.Collections;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.core.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.trellisldp.http.TrellisHttpResource;

/**
 * Basic HTTP presence.
 *
 */
public class WebApplication extends Application {

    private final static Logger log = LoggerFactory.getLogger(WebApplication.class);

    @Inject
    private TrellisHttpResource httpResource;

    @Override
    public Set<Object> getSingletons() {
        logResourceAdded(httpResource);
        return Collections.singleton(httpResource);
    }

    private void logResourceAdded(Object resource) {
        log.info("Adding application JAX-RS resources: {}", resource);
    }

}
