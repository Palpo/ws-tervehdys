import com.example.Palvelu;
import com.example.PalveluService;

public class Asiakas {
  public static void main(String[] args) {
    PalveluService p = new PalveluService();
    Palvelu port = p.getPalveluPort();
    String vastaus = port.tervehdi("Antti");
    System.out.println("Vastaus: " + vastaus);
  }
}
