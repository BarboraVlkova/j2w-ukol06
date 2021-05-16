package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;

import java.util.List;


//  anotace @Service = oznacuje objekt s vykonym kodem
//  METODA PRO NACTENI CITATU Z VYTVORENEHO SEZNAMU (viz. zadani README.md)

@Service
public class CitatyRepository {

    private final List<String> seznamCitatu;

    public CitatyRepository() {
        this.seznamCitatu = List.of(
                "Všichni vědí naprosto přesně, jak mají žít druzí. Zato nikdy nevědí, jak mají žít oni sami. —  Paulo Coelho",
                "Uprostřed problémů leží příležitost. —  Albert Einstein",
                "Nechtěj být člověkem, který je úspěšný, ale člověkem, který za něco stojí. —  Albert Einstein",
                "Ono je lepší mluvit s chytrým člověkem o něčem hloupém než s hlupákem o něčem chytrém. —  Jan Werich",
                "Bylo by to k smíchu, kdyby to nebylo k pláči. —  Jan Werich",
                "Život bez zkoušek nestojí za žití. —  Sókratés",
                "Vodu neoceníme, dokud nám nevyschne studna a to platí o všem v životě. —  Benjamin Franklin",
                "Odmítáme ty co nás milují, a milujeme ty co nás odmítají. —  Seneca",
                "Smích není špatný začátek přátelství a je jeho nejlepším koncem. —  Oscar Wilde",
                "Nedopusť, aby chování jiných ničilo tvůj vnitřní mír. —  Dalajláma",
                "Bez činu zůstává i nejkrásnější myšlenka bezcennou. —  Mahátma Ghándí",
                "Nemluv, pokud tvá slova nejsou lepší než ticho. —  Buddha",
                "Malíř má vesmír ve své mysli a rukou. —  Leonardo Da Vinci",
                "Na světě je tolik věcí, které nepotřebuji! —  Sókratés",
                "Nejlepší pomstou je nebýt jako ten, který vás zranil. —  Marcus Aurelius"
        );
    }


    public int pocet() {
        return seznamCitatu.size();
    }

//    delsi zapis metody vyse
//    public int pocet() {
//        int pocet = seznamCitatu.size();
//        return pocet;
//    }

    public String citat(int poradi) {
        return seznamCitatu.get(poradi - 1);
    }


}
