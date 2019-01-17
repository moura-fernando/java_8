import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploCursos {
	
	public static void main(String[] args) {
	
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		

	/*	cursos.forEach(System.out::println);   //IMPRIME O toString
		cursos.forEach(c -> System.out.println(c.getNome())); //Prara imprimir o nome só com lambda		
		
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.forEach(c -> System.out.println(c.getNome()));*/
		
		//Lambda
		cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.map(c -> c.getAlunos() )
		.forEach(toral -> System.out.println(toral));
		//ou Method references
		cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.map(Curso::getAlunos)
		.forEach(System.out::println);

		int sum = cursos.stream()
		.filter(c -> c.getAlunos() > 100 )
		.mapToInt(Curso::getAlunos)
		.sum();
		
		System.out.println(sum);
	
		
		//OPTIONAL 
		
		Optional<Curso> optionalCurso = cursos.stream()
			.filter(c -> c.getAlunos() > 10)
			.findAny();
		
		 cursos.stream()
			.filter(c -> c.getAlunos() > 10)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()) );
		
		Curso curso = optionalCurso.orElse(null);
		
		System.out.println(curso.getNome());
		
		
		//Como transformar um stream em uma Collection
		
		List<Curso> listaDeCursos =   cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.collect(Collectors.toList());
		
		listaDeCursos.forEach(c -> System.out.println("Curso de: " +c.getNome()));
		
		
		 Map<String, Integer> collect = cursos 
				.stream() 
				.filter(c -> c.getAlunos() > 100) 
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		
		System.out.println(collect);
		
		
		

	}
}

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}
}
