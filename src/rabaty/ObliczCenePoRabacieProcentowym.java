package rabaty;

import main.Konfiguracja;

public class ObliczCenePoRabacieProcentowym implements ObliczCenePoRabacie {

    @Override
    public double obliczCenePoRabacie(double cena) {

        Konfiguracja k = Konfiguracja.getInstance();


        double procentRabatu = k.getProcentRabatu();
        return cena -= cena * procentRabatu/100;
    }
}
