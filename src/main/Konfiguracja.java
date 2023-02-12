package main;

import rabaty.ObliczCenePoRabacie;
import rabaty.ObliczCenePoRabacieKwotowym;
import rabaty.ObliczCenePoRabacieProcentowym;

public class Konfiguracja {

    private static Konfiguracja instance;

    private  Konfiguracja() {}

    public static Konfiguracja getInstance() {

        if (instance == null) instance = new Konfiguracja();

        return instance;
    }

    public double getKwotaRabatu() {

        return 1;
    }

    public double getProcentRabatu() {

        return 25;

    }

    public ObliczCenePoRabacie getBiezacyRabat() {

        //return new ObliczCenePoRabacieKwotowym();
        return new ObliczCenePoRabacieProcentowym();
    }
}
