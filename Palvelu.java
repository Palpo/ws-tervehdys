
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(name="Palvelu", targetNamespace="http://example.com")
public class Palvelu {

  public String tervehdi(String nimi) {
    return "Moi "+ nimi + "!" ;
  }

  public static void main (String args[]){
    Endpoint.publish("http://localhost:8080/Palvelu", new Palvelu()); ;
  }
}
