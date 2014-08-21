

## Käännä ja käynnistä palvelu

Tiedostossa `Palvelu.java` on määritelty yksinkertainen tervehdyspalvelu. Sen saa ajoon suorittamalla seuraavat komennot:

    javac Palvelu.java
    java Palvelu
    
Nyt palvelu on ajossa osoitteessa

    http://localhost:8080/Palvelu

Sen WSDL generoituu automaattisesti ja on osoitteessa

    http://localhost:8080/Palvelu?wsdl


## Generoi tynkä asiakkaan käyttöön

WSDL:stä voi generoida Java-tyngät asiakkaan käyttöön ohjelmalla `wsimport`, seuraavasti:

    wsimport -keep http://localhost:8080/Palvelu?wsdl

(Parametri -keep säilyttää myös tynkien lähdekoodit. Niitä voi tarkastella hakemistossa `com/example`)


## Suorita asiakas

Tiedostossa `Asiakas.java` on palveluamme käyttävä asiakas. Sen voi ajaa suorittamalla

    javac Asiakas.java
    java Asiakas.java

Jos kaikki meni hyvin, niin tulostuu

    Vastaus: Moi Antti!

