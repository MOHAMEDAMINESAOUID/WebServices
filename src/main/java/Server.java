import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class Server {
    public static  void main(String[] args){
        Endpoint.publish("http://0.0.0.0:8080/",new BanqueService());
        System.out.println("Web service deployé sur http://0.0.0.0:8080/");
    }
}