package com.petehouston.netty.discard;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Discard server starting at: ");
        int port = 9999;
        new DiscardServer(port).run();
    }
}
