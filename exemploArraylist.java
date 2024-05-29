package vetores;

import java.util.ArrayList;

public class exemploArraylist {

	public static void main(String[] args) {
		// Criando um ArrayList de números inteiros
		ArrayList<Integer>numeros = new ArrayList<>();
		
		numeros.add(10);// Adicionando elementos ao ArrayList
		numeros.add(20);
		
		System.out.println(numeros.get(0));  // Saída: 10 //Acessando elementos do Arraylist
		System.out.println(numeros.get(1));  // Saída: 20
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1));  // Saída: 25  //Modificando um elemento do ArrayList
		
		numeros.remove(0);
		System.out.println(numeros.get(0));  // Saída: 25  // Removendo um elemento do Arraylist
		
		System.out.println(numeros.size());  // Saída :2  // 	Obtendo o tamanho do Arraylist
	}

}
