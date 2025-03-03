package multithreaded;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server {

    public Consumer<Socket> getConsumer(){
        return socket -> {
            try{
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
                printWriter.println("Hello from the server");
                printWriter.close();
                socket.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        };
    }


    public void run(){
        try{
            ServerSocket serverSocket = new ServerSocket(8010);
            serverSocket.setSoTimeout(10000);
            System.out.println("Server is Listening on port 8010");

            while(true){
                Socket clientSocket = serverSocket.accept();
                Thread thread = new Thread(()->getConsumer().accept(clientSocket));
                thread.start();

            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }


    public static void main(String[] args){
        Server server = new Server();
        try{
            server.run();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
