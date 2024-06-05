package vetores;

import java.util.ArrayList;

public class frutasArraylist0506 {

	public static void main(String[] args) {
		ArrayList<String>frutas = new ArrayList<String>();

		frutas.add("morango");
		frutas.add("banana");
		frutas.add("mexerica");
		frutas.add("uva verde");
		frutas.add("melancia");
		frutas.add("manga");
		frutas.add("amora");
		frutas.add("pitaia");
		frutas.add("abacate");
		frutas.add("laranja");

		System.out.println (frutas);


		frutas.remove(5);
		frutas.remove(2);
		frutas.remove(7);
		frutas.remove(3);
		frutas.remove(1);

		System.out.println (frutas);
		System.out.println (frutas.size());



	}

}
