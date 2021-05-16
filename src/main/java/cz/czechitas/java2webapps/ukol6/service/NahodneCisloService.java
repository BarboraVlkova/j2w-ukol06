package cz.czechitas.java2webapps.ukol6.service;
import org.springframework.stereotype.Service;
import java.util.Random;


//  anotace @Service = oznacuje objekt s vykonym kodem
//  METODA PRO VRACENI NAHODNEHO CISLA (viz. zadani README.md)

    @Service
    public class NahodneCisloService {

        private final Random nahodneCislo;


        public NahodneCisloService() {
            nahodneCislo = new Random();
        }

        public int dejNahodneCislo(int horniMez) {
            return nahodneCislo.nextInt(horniMez);
        }


}
