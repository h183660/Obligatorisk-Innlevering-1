package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave6nFakultet {

	public static void main(String[] args) {
		
		for(int g = 1; g == 1;g--) {
			String tallTxt = showInputDialog("Skriv inn et positivt heltall n, der n > 0, så skal jeg beregne n! for deg!");
			int tall = Integer.parseInt(tallTxt);
			int fakultet = tall;			
			if(tall > 0) {
				for(int i = 1; i < tall; i++) {
					fakultet = fakultet * i;					
				}				
				showMessageDialog(null, tallTxt + "! = " + fakultet);
			}
			else {
				g++;
				showMessageDialog(null, "Venligst skriv et positivt helt tall.");
			}	
		}		
	}
}
