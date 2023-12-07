import java.util.Locale;
import java.util.Scanner;
public class Horas_Extras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int c, h;
		double horas_extras = 0, salario, salario_total, valor_hora = 10.00;
		
		System.out.println("Codigo 1 = Técnico: ");
		System.out.println("Codigo 2 = Supervisor: ");
		System.out.println("Codigo 3 = Coordenador: ");
		System.out.println("Informe o codigo: ");
		
		c = sc.nextInt();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		
		h = sc.nextInt();
		
		if (c == 1) {
			if (h > 44) {
				horas_extras = (h - 44) * 20.00;
				salario = (44 * valor_hora);
				salario_total = salario + horas_extras;
				System.out.println("Salario: R$ " + salario);
				System.out.println("Horas Extras: R$ " + horas_extras);
				System.out.println("Salario Total: R$ " + salario_total);
			}
			
		}
		if (c == 1) {
			if (h == 44) {
				horas_extras = (h - 44) * 20.00;
				salario = (44 * valor_hora);
				salario_total = salario + horas_extras;
				System.out.println("Salario: R$ " + salario);
				System.out.println("Horas Extras: R$ " + horas_extras);
				System.out.println("Salario Total: R$ " + salario_total);	
		
			}
			}
		if (c == 2) {
			if (h > 44) {
				horas_extras = (h - 44) * 25.00;
				valor_hora = 15.00;
				salario = (44 * valor_hora);
				salario_total = salario + horas_extras;
				System.out.println("Salario: R$ " + salario);
				System.out.println("Horas Extras: R$ " + horas_extras);
				System.out.println("Salario Total: R$ " + salario_total);
			}
			
		}
		if (c == 2) {
			if (h == 44) {
				horas_extras = (h - 44) * 25.00;
				valor_hora = 15.00;
				salario = (44 * valor_hora);
				salario_total = salario + horas_extras;
				System.out.println("Salario: R$ " + salario);
				System.out.println("Horas Extras: R$ " + horas_extras);
				System.out.println("Salario Total: R$ " + salario_total);	
		
			}
			}
		if (c == 3) {
			if (h > 44) {
				horas_extras = (h - 44) * 30.00;
				valor_hora = 20.00;
				salario = (44 * valor_hora);
				salario_total = salario + horas_extras;
				System.out.println("Salario: R$ " + salario);
				System.out.println("Horas Extras: R$ " + horas_extras);
				System.out.println("Salario Total: R$ " + salario_total);
			}
			
		}
		if (c == 3) {
			if (h == 44) {
				horas_extras = (h - 44) * 30.00;
				valor_hora = 20.00;
				salario = (44 * valor_hora);
				salario_total = salario + horas_extras;
				System.out.println("Salario: R$ " + salario);
				System.out.println("Horas Extras: R$ " + horas_extras);
				System.out.println("Salario Total: R$ " + salario_total);	
		
			}
			}
		
		
		
		sc.close();
	}

}
