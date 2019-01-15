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
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		//#Antes
//		Collections.sort(palavras, comparador);
		//#Java8    -->  sort é um método concreto dentro da interface List: Pode isso Arnaldo?
		palavras.sort(comparador);
		
		//#Antes
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		//#Java8
//		palavras.forEach(p -> System.out.println(p));
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
				
			}
		});
	}
}	
	
	class ComparadorPorTamanho implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			if (s1.length()<s2.length()) {
				return -1;
			}
			if (s1.length()>s2.length()) {
				return 1;
			}
			return 0;
		}
		
	}


