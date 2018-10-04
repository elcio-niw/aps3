package colecao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
	 ArrayList<Integer> colecao =  new ArrayList<Integer>();
	 
	 for(int i =1; i<=10;i++) {
	 colecao.add(i);
	 }
	 
	 
	 
	
	 
	 ArrayList<Integer> colecao2 = new ArrayList<Integer>();
	 
	 for(int i=1; i <=20;i++) {
		 colecao2.add(i);
		 
	 }

	 Iterator<Integer> it = colecao.iterator();
	 Iterator<Integer> it2= colecao2.iterator();
	 while (it.hasNext() && it2.hasNext()) {
		 
		 
		 
		

		 Integer string = it.next();
		 Integer string2 = it2.next();
		 if(string2==2) {
			
			
		 }
		 
		 
		 
		 System.out.println(string+"/"+string2);
	 
	 

	}

}
}
