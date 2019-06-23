import java.util.Locale;
import java.util.Scanner;

public class PerceptronMain {

	public static void main(String[] args) {

		double taxaDeAprendizado,nrolimiar;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.print("Taxa de aprendizado ( 0 < n <= 1 ): ");
		taxaDeAprendizado = sc.nextDouble();
		System.out.print("Limiar : ");
		nrolimiar = sc.nextDouble();
		
		PerceptronProcessamento.processa(taxaDeAprendizado, nrolimiar);
	}

}