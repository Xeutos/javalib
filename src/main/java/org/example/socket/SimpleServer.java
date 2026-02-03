package org.example.socket;

import java.io.IOException;
import java.net.ServerSocket;

public class SimpleServer {

    static void main() {

        int port = 3000;

        try (ServerSocket serverSocket = new ServerSocket(port, 64)) {

            IO.readln();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
