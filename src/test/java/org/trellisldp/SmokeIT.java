package org.trellisldp;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SmokeIT {

    private static final Logger log = LoggerFactory.getLogger(SmokeIT.class);

    private static final String testUri = "http://localhost:" + Integer.getInteger("testServerHttpPort") + "/trellis-micro";

    private static final HttpClient testClient = HttpClients.createDefault();

    @Test
    void findTrellis() throws IOException {
        final HttpResponse response = testClient.execute(new HttpGet(testUri));
        final int statusCode = response.getStatusLine().getStatusCode();
        final String statusPhrase = response.getStatusLine().getReasonPhrase();
        log.info("Got response {} for {}", statusCode, statusPhrase);
    }

}
