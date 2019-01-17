import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		//HOJE
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		//DIFF
		LocalDate copa2022 = LocalDate.of(2022, Month.JUNE, 5);
		int anos = copa2022.getYear() - hoje.getYear();
		System.out.println(anos);
		
		//Período
		Period periodo = Period.between(hoje, copa2022);
		System.out.println(periodo.getDays());
		
		//Util
		LocalDate proximaCopa = copa2022.plusYears(4);
		System.out.println(proximaCopa);
		
		//Format
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatador.format(proximaCopa));
		
		//Hora Minuto Segundo
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora =  LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		//Conversoes
		agora.toLocalDate();
		YearMonth mesAno = YearMonth.now();
		System.out.println(mesAno);
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);	
	}
}
