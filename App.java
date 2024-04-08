import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {

    private static HttpServer server;

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println("Result : " +num1 * num2);
    }
}
