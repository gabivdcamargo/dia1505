package vetores;

import java.util.ArrayList;

public class somaArrayList {

	public static void main(String[] args) {
		// Criando um ArrayList de soma
		ArrayList<Integer>num = new ArrayList<>();
		int soma=0;
		
		num.add(5);
		num.add(2);
		num.add(10);
		num.add(7);
		num.add(1);
		
		for (int i: num) {
			soma += i;

			
			}
		System.out.println ("A soma dos números é: " + soma);
		
				

	}

}
