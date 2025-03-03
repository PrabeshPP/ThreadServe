package SIngleThreadedServer;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public void run(){
        int port = 8010;
       try{

           InetAddress inetAddress = InetAddress.getByName("localhost");
           Socket socket = new Socket(inetAddress,port);
           PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
           BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));

           String line = fromSocket.readLine();
           System.out.println("Response from the socket is :"+ line);
           out.close();
           fromSocket.close();
           socket.close();



       }catch(UnknownHostException ex){

           ex.printStackTrace();

       } catch (IOException e) {

           e.printStackTrace();
       }
    }


//    public static void main(String[] args){
//        Client client = new Client();
//        try{
//            client.run();
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//    }
}
