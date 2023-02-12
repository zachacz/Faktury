package druk;

import dokumenty.Faktura;
import dokumenty.Pozycja;

import java.util.Iterator;

public class Druk {

    public static void wypiszFakture(Faktura faktura)
    {
        System.out.println("=====================================================");
        System.out.println("FA z dnia: "+faktura.getDataSprzedazy().toString());
        System.out.println("Wystawiona dla: "+faktura.getKontrahent());
        System.out.println("Na kwote: "+faktura.getSuma());
        Iterator<Pozycja> iteratorPozycji=faktura.getIteratorPozycji();
        while(iteratorPozycji.hasNext())
        {
            Pozycja pozycja=iteratorPozycji.next();
            System.out.println("Towar: "+pozycja.getNazwa()+" Ilosc: "+pozycja.getIlosc()+" Wartosc:" + pozycja.getWartosc());
        }
        System.out.println("=====================================================");
    }
}
