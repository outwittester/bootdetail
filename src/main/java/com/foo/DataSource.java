package com.foo;

/**
 * Created by xikaixiong on 6/26/17.
 */


public class DataSource {

    private String server;
    private int port;

    public DataSource() {
        System.out.println();
    }

    public DataSource(String server, int port) {
        this.server = server;
        this.port = port;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "server is "+server+" port is "+port;
    }
}
