package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4Trinnskatt {

	public static void main(String[] args) {
		
		String bruttoTxt = showInputDialog("Hva er din brutto inntekt?");
		
		double brutto = (Double.parseDouble(bruttoTxt));
		
		double trinn1double = ((254500 - 180800) * 0.0093);
		double trinn2double = ((639750 - 254500) * 0.042);			
		double trinn3double = ((999550 - 639750) * 0.132);
		
		if(brutto < 180800) {
		showMessageDialog(null, "Du betaler ingen trinnskatt.");
		}
		else if (180800 <= brutto && brutto < 254500) {	
		trinn1double = ((Double.parseDouble(bruttoTxt) - 180800) * 0.0093) + 0.5;
		int trinn1 = (int) trinn1double;
		showMessageDialog(null, "Du har trinn 1 i skatt. Da betaler du " + trinn1 + " kr i trinnskatt.");
		}
		else if (254500 <= brutto && brutto < 639750) {
		trinn2double = ((Double.parseDouble(bruttoTxt) - 254500) * 0.042) + trinn1double+ 0.5;
		int trinn2 = (int) trinn2double;
		showMessageDialog(null, "Du har trinn 2 i skatt. Da betaler du " + trinn2 + " kr i trinnskatt.");
		}
		else if (639750 <= brutto && brutto < 999550) {		
		trinn3double = ((Double.parseDouble(bruttoTxt) - 639750) * 0.132) + trinn1double + trinn2double + 0.5;
		int trinn3 = (int) trinn3double;
		showMessageDialog(null, "Du har trinn 3 i skatt. Da betaler du " + trinn3 + " kr i trinnskatt.");	
		}
		else if (999550 <= brutto) {
		double trinn4double = ((Double.parseDouble(bruttoTxt) - 999550) * 0.162)+ trinn1double + trinn2double + trinn3double + 0.5;
		int trinn4 = (int) trinn4double;
		showMessageDialog(null, "Du har trinn 4 i skatt. Da betaler du " + trinn4 + " kr i trinnskatt.");	
		}
	}

}
