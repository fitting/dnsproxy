package org.fitting.dnsproxy.server.guice;

import org.fitting.dnsproxy.server.Server;
import org.apache.commons.configuration.Configuration;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/** Server provider. */
public class ServerProvider implements Provider<Server> {

    @Inject
    @Named(value = "server")
    private Configuration configuration;

    @Override
    public Server get() {
        return new Server(configuration);
    }
}
