package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class acaiArraylist0506 {

	private static ArrayList<String> ing;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> ing = new ArrayList<String>();
		int num = 0, rem = 0;
		String novo;
		
		ing.add("0: Leite Condensado");
		ing.add("1: Nutella");
		ing.add("2: Morango");
		ing.add("3: Banana");
		ing.add("4: Leite em Pó");
		ing.add("5: Ovomaltine");
		ing.add("6: Uva");
		ing.add("7: Granola");
		ing.add("8: Paçoca");
		ing.add("9: 500g de acai");

		System.out.println (ing);
		System.out.println ("Digite 1 para remover um item ou Digite 2 para adicionar algum item ou Digite 3 para manter os mesmos ingredientes");
		 num = ler.nextInt();
		 
		 if (num==1) {
			 System.out.println ("Digite o número do ingrediente correspondente que deseja apagar");
			 rem = ler.nextInt();
			 ing.remove(rem);
			 System.out.println ("Sua nova lista é:" +ing);
		 }
		 
		 else if (num==2) {
			 System.out.println ("Digite o novo ingrediente");
			novo = ler.next();
			ing.add(novo);
			System.out.println ("Sua nova lista é:" +ing);
		 }
		 
		 else if (num==3) {
			 System.out.println ("Agradecemos pela compra!");
		 }
		 
		 else {
			 System.out.println ("Opção Inválida");
			 
		 }
		 
		 
		 ler.close();
		 
		 
		 
		 
		

	}

}
