package main;

import java.util.Iterator;
import java.util.Calendar;

import druk.Druk;
import magazyn.Towar;

import dokumenty.Faktura;
import dokumenty.Pozycja;

//ZEWNETRZNY RABAT
import rabatlosowy.LosowyRabat;
import rabaty.ObliczCenePoRabacieKwotowym;
import rabaty.ObliczCenePoRabacieProcentowym;


public class Ui {

	public static void main(String[] args) {
		Calendar teraz=Calendar.getInstance();
		
		//Tworzymy towary
		Towar t1=new Towar(10,"buty");
		Towar t2=new Towar(2,"skarpety");
		
		//I przykladowa fakture
		Faktura f=new Faktura(teraz.getTime(),"Fido");
		//f.setLiczarkaRabatu(new ObliczCenePoRabacieProcentowym());
		//f.setLiczarkaRabatu(new ObliczCenePoRabacieKwotowym());
		f.dodajPozycje(t1,3);
		f.dodajPozycje(t2, 5);
		
		Druk.wypiszFakture(f);

		
		//TEST ZEWN. rabatu
		LosowyRabat lr=new LosowyRabat();
		System.out.println(lr.losujRabat());
	}


}
