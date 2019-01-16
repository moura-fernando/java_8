import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("Surf");
		palavras.add("Gremio");
		palavras.add("Futebol");
		
		//#Antes
//		Collections.sort(palavras, comparador);
		//#Java8    -->  sort é um método concreto dentro da interface List: Pode isso Arnaldo?
	//1 palavras.sort(( s1,  s2) -> Integer.compare(s1.length(), s2.length()));
	//2 palavras.sort(Comparator.comparing(s -> s.length()));
	    palavras.sort(Comparator.comparing(String::length));
		
		//#Antes
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		//#Java8
		palavras.forEach(p -> System.out.println(p));
		
		//---------------------------
	}
}	
	
		
	


