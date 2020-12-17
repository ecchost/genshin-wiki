/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genshin.wiki;

/**
 *
 * @author Asus
 */
public class ServerModel extends Thread {
    int port;
    Server server;

    public ServerModel(int port) {
        this.port = port;
    }
    
    @Override
    public void run(){
        server = new Server();
        server.start(port);
    }
    
    public void stopServer(){
        server.stop();
    }
}
