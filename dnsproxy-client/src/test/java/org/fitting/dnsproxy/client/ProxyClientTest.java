package org.fitting.dnsproxy.client;

import org.fitting.dnsproxy.domain.DnsEntry;
import org.fitting.dnsproxy.domain.Proxy;

/** Test class for ProxyClient. */
public class ProxyClientTest {

    public static void main(String[] args) {
        final ProxyClient proxyClient = new ProxyClient("127.0.0.1", 9008);
        final Proxy proxy = new Proxy();
        proxy.setPort(10008);
            proxy.addDnsEntry(new DnsEntry("www.fitting-test.org", "127.0.0.1"));
        proxy.addDnsEntry(new DnsEntry("www.fitting-testing.org", "127.0.0.1"));
        proxy.addDnsEntry(new DnsEntry("localhost", "127.0.0.1"));
//        proxyClient.stop(proxy);
        proxyClient.start(proxy);

        System.out.println(proxyClient.active());

    }
}
