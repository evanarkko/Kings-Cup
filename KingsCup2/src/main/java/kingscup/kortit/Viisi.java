package kingscup.kortit;

import java.util.HashMap;
import java.util.Scanner;
import kingscup.logiikka.Pelaaja;

public class Viisi extends Kortti {

    private Scanner lukija;
    private HashMap<String, Pelaaja> pelaajat;

    public Viisi(Scanner lukija, HashMap<String, Pelaaja> pelaajat) {
        this.lukija = lukija;
        this.pelaajat = pelaajat;
    }

    @Override
    public void suorita() {
        System.out.println("5:");
        System.out.println("Five is Jive\nNostaja tekee tanssiliikeen käsillään."
                + " Seuraava kopioi liikkeen ja lisää siihen uuden liikkeen. Ensimmäinen,"
                + " joka unohtaa tähänastisen liikkeen, juo.");
        System.out.print("mokaaja: ");
        String juoja = lukija.nextLine();
        while (!pelaajat.containsKey(juoja)) {
            System.out.print("pelaaja ei mukana pelissä. Kuka juo? ");
            juoja = lukija.nextLine();
        }

        pelaajat.get(juoja).juo();
    }

}
