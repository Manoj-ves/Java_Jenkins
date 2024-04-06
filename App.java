import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {

    public static void main(String[] args) throws IOException {
        // Create HTTP server on port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // Create a simple handler for incoming requests
        server.createContext("/", exchange -> {
            // Set response headers
            exchange.getResponseHeaders().set("Content-Type", "text/plain");

            // Send response
            String response = "Hello from Java HTTP server!";
            exchange.sendResponseHeaders(200, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        });

        // Start the server
        server.start();

        // Output server info
        System.out.println("Server started on port 8000");
    }
}
