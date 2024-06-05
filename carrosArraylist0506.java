package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class carrosArraylist0506 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		ArrayList<String>carros= new ArrayList<String>();
		int transporte = 0;
		carros.add("Civic");
		carros.add("Nivus");
		carros.add("Tracker");
		carros.add("Fusca");
		carros.add("Celta");
		carros.add("Jetta");
		carros.add("Onix");
		carros.add("Spin");
		carros.add("Gol");
		carros.add("Porsche");

		System.out.println (carros);
		

		System.out.println ("Informe qual carro voce se interessa");
		 transporte = ler.nextInt();
		 
		 System.out.println (carros.get(transporte));
		 
		
		 ler.close();
		
		


}
}
