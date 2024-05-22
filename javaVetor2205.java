package vetores;

import java.util.Scanner;

public class javaVetor2205 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int val=0, soma=0;
		int a [] = new int [5];

		for (int i=0; i<=4; i++)   {
			System.out.println ("Informe um valor" + i +"..:");	}
		int i;
		a[i]= ler.nextInt ();
		
		soma = soma + a[i];
		
		if (soma>30)  {
			System.out.println("O valor é maior que 30, a soma ´´é = ");
		}
	
		

		for (int  i1=0; i1<5; i1++) {
			System.out.println (a[i]);

		}
		ler.close();
	}

}
