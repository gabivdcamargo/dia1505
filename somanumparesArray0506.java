package vetores;

import java.util.ArrayList;
import java.util.Random;

public class somanumparesArray0506 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();

		int soma = 0;
		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt (100);
			numeros.add(numeroAleatorio);

		}

		for (int i : numeros) {
			if (i %2 == 0)  {
				soma += i; 

			for (int numero : numeros)  {
				System.out.println(numero);
			}
			}
		}
		System.out.println ("A soma dos números é: " + soma);

	}

}

