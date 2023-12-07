import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome;
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Olá " + nome);
		System.out.println("Senha Bem Vindo(a) ao teste de sistema!");
		
		System.out.println("Agora defina uma senha: ");
		int senha = sc.nextInt();
		
		System.out.println("Confirme sua senha");
		int confirmacao;
		confirmacao = sc.nextInt();
		
		while (confirmacao != senha) {
		System.out.println("Confirmação Invalida");
			confirmacao = sc.nextInt();
		}
		
		System.out.println("Senha Criada om sucesso.");
		System.out.println("Para Acessar o sistema digite sua senha");
		int escolha;
		escolha = sc.nextInt();
										
		while (senha != escolha) {
			
			System.out.println("Senha Invalida");
			escolha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		char resp;
		do {
		System.out.print("Digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.00;
		System.out.printf("Temperatura em F: %.2f%n", F);
		System.out.print("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		
		sc.close();
	}

}