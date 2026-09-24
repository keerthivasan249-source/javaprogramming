// ---------- Server.java ----------
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started. Waiting for client...");

            try (Socket socket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(socket.getInputStream()));
                 PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                System.out.println("Client connected!");

                String clientMessage = in.readLine();
                System.out.println("Message from client: " + clientMessage);

                out.println("Hello Client, message received: " + clientMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}