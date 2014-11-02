package vier;

import javapack.*;

public class Beispiel
{

	
	
public static void main(String[] args) 
	
{
		
/*	System.out.print("Menge:");
		int menge = Einlesen.LiesInt();
		System.out.print("Nettopreis:");
		double nettoPreis = Einlesen.LiesDouble();
		System.out.print("MWST:");
		double mwst = Einlesen.LiesDouble();
		double wareNetto = nettoPreis * menge;
		double wareBrutto = wareNetto * (mwst + 100) / 100;
		System.out.println("WarenpreisBrutto:" + wareBrutto);
		
this was old code		*/
		
double erg=  (Einlesen.LiesDouble("Nettopreis:")*Einlesen.LiesInt("Menge:") *(Einlesen.LiesDouble("MWSt") +100) /100);
		
		
// this is new one

System.out.println(erg);

}

}
