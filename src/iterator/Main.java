package iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	MyCollection colecao1 = new MyCollection();

	
	colecao1.add("Bandido");
	colecao1.add("Bodacious");
	colecao1.add("Mascherano");
	colecao1.add("Destruidor");
	colecao1.add("Insano");
	colecao1.add("Juizo Final");
	colecao1.add("Tsunami");
	Iterator<String> iterator = colecao1.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
		
	}
		

	}

}
