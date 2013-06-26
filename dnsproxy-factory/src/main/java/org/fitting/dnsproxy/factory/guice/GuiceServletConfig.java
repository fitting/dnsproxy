package org.fitting.dnsproxy.factory.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import org.fitting.dnsproxy.server.guice.ServerModule;

/**
 * Guice servlet config.
 * @author mischa
 */
public class GuiceServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServerModule(), new FactoryModule());
    }
}