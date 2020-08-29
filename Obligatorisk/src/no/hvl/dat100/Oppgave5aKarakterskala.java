package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5aKarakterskala {

	public static void main(String[] args) {
		String poengText = showInputDialog("Hvor mangen poeng fikk du?");
		int poeng = Integer.parseInt(poengText);
				
		if(poeng <= 100 && poeng >= 90){
			showMessageDialog(null,"Du fikk karakter A");
		} else if(poeng <= 89 && poeng >= 80){
			showMessageDialog(null,"Du fikk karakter B");
		} else if(poeng <= 79 && poeng >= 60){
			showMessageDialog(null,"Du fikk karakter C");
		} else if(poeng <= 59 && poeng >= 50){
			showMessageDialog(null,"Du fikk karakter D");
		} else if(poeng <= 49 && poeng >= 40){
			showMessageDialog(null,"Du fikk karakter E");
		} else if(poeng <= 39 && poeng >= 0){
			showMessageDialog(null,"Du fikk karakter F");
		} else {
			showMessageDialog(null, "Skriv en gydlig poengsum!(0-100)");
		}
	}
}
