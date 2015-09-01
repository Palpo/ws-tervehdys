# ws-tervehdys

Yksinkertainen [JAX-WS](http://en.wikipedia.org/wiki/Java_API_for_XML_Web_Services)-esimerkki.

## Ajo-ohjeet

### Käännä ja käynnistä palvelu

Tiedostossa `Palvelu.java` on määritelty yksinkertainen tervehdyspalvelu. Sen saa ajoon suorittamalla seuraavat komennot:

    javac Palvelu.java
    java Palvelu
    
Nyt palvelu on ajossa osoitteessa

    http://localhost:8080/Palvelu

Sen WSDL 1.1 -kuvaus generoituu automaattisesti ja on saatavilla osoitteessa

    http://localhost:8080/Palvelu?wsdl


### Generoi tynkä asiakkaan käyttöön

WSDL:stä voi generoida Java-tyngät asiakkaan käyttöön ohjelmalla `wsimport`, seuraavasti:

    wsimport -keep http://localhost:8080/Palvelu?wsdl

Parametri -keep säilyttää myös tynkien lähdekoodit. Niitä voi tarkastella hakemistossa `com/example`


### Suorita asiakas

Tiedostossa `Asiakas.java` on palveluamme käyttävä asiakas. Sen voi ajaa suorittamalla

    javac Asiakas.java
    java Asiakas.java

Jos kaikki meni hyvin, niin tulostuu

    Vastaus: Moi Antti!



## Muuta

Käynnistämällä palvelun seuraavanlaisella parametrillä tulostuu konsoliin palvelulle tuleva ja lähtevä HTTP-liikenne, eli tässä tapauksessa SOAP-viestit.

    java -Dcom.sun.xml.internal.ws.transport.http.HttpAdapter.dump=true Palvelu

## Seuraaavaksi

http://www.service-repository.com/ listaa avoimia WS
palveluita. Valitse mieleisesi ja luo palvelua vastaavat Java-tyngät
WSDL kuvauksesta wsimportin avulla. Muokkaa sitten
Asiakas.java esimerkin avulla uusi asiakas, joka hyödyntää
valitsemaasi palvelua.