package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner scanner = new Scanner(System.in)) {
			String nome;
			System.out.print("Digite seu nome: ");
			nome = scanner.next();
			
			System.out.println("Olá " + nome + "!");
			System.out.println("Senha Bem Vindo(a) ao teste de sistema!");
			
			System.out.print("Agora defina uma senha: ");
			int senha = scanner.nextInt();
			
			System.out.print("Confirme sua senha: ");
			int confirmacao;
			confirmacao = scanner.nextInt();
			
			while (confirmacao != senha) {
			System.out.println("Confirmação Invalida!");
			System.out.print("Confirme sua senha: ");
				confirmacao = scanner.nextInt();
			}
			
			System.out.println("Senha Criada om sucesso.");
			System.out.print("Para Acessar o sistema digite sua senha: ");
			int escolha;
			escolha = scanner.nextInt();
											
			while (senha != escolha) {
				
				System.out.println("Senha Invalida!");
				System.out.print("Para Acessar o sistema digite sua senha: ");
				escolha = scanner.nextInt();
			}
			
			System.out.println("Acesso Permitido");
			
			Conta conta;
			
			System.out.print("Entre com o numero da conta: ");
			int number = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Entre com o nome do responsavel: ");
			String holder = scanner.nextLine();
			System.out.print("Será realizado um deposito inicial? (s/n): ");
			char respost = scanner.next().charAt(0);
			if (respost == 's') {
				System.out.print("Informe o valor do deposito inicial: ");
				double depositoinicial = scanner.nextDouble();
				conta = new Conta(number, holder, depositoinicial);
			}
			else{
				conta = new Conta(number, holder);
			}
			
			System.out.println();
			System.out.println("Dados da conta: ");
			System.out.println(conta);
			
			System.out.println();
			System.out.print("Informe o valor do deposito: ");
			double depositValue = scanner.nextDouble();
			conta.deposit(depositValue);
			System.out.println("Dados atualizados da conta: ");
			System.out.println(conta);
			
			System.out.println();
			System.out.print("Informe o valor de saque: ");
			double withdrawValue = scanner.nextDouble();
			conta.withdraw(withdrawValue);
			System.out.println("Dados atualizados da conta: ");
			System.out.println(conta);
		}

	}

}
