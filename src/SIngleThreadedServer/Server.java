package SIngleThreadedServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {



    public void run(){
        int port = 8010;
        try{
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(10000);


            while(true){

                System.out.println("Server is Listening on port "+port);
                Socket acceptedConnection  =  serverSocket.accept();
                System.out.println("Connection accepted from client "+acceptedConnection.getRemoteSocketAddress());
                PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream());
                BufferedReader fromClient =  new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));

                //this will convert the text into byte format
                toClient.println("Hello from the server");
//                toClient.flush();

            }

        }catch(IOException ioException){
            ioException.printStackTrace();
        }

    }


    public static void main(String[] args){
            Server server = new Server();
            try{
                server.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
