import java.net.InetAddress;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.bachoco.com");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
