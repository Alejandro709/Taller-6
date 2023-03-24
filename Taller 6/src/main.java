import Punto9.Deck;
import java.util.Scanner;
import punto7.Punto7;
import punto8.Punto8;
public class main {
	
	public static void main(String args[]){ 
		
		Scanner in = new Scanner (System.in);
		
		Punto7 cp = new Punto7();
		cp.promedios();
		
		Punto8 ag = new Punto8();
		ag.Algebra();
		
		Deck d = new Deck();
		d.print();
		
		
		
	
	}

}
