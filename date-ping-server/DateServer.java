
/**
 *
 * @author kan
 */
package DatePingServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.Date;

public class DateServer {

    public static void main(String[] args) throws IOException {
        try (var listener = new ServerSocket(8080)) {
            System.out.println("Date Ping Server Running");
            while (true) {
                try (var socket = listener.accept()) {
                    var out = new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Date().toString());
                }
            }
        }
    }

}
