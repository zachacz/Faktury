package rabaty;

import rabatlosowy.LosowyRabat;

public class AdapterRabatuLosowegoKlasowy extends LosowyRabat implements ObliczCenePoRabacie {



    @Override
    public double obliczCenePoRabacie(double cena) {

        double procentRabatuLosowy = losujRabat()/10;
        return cena -= cena * procentRabatuLosowy;

    }
}
