import java.util.Scanner;
public class ContaTerminal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome completo: ");
		String NomeCliente = entrada.nextLine();
		
		System.out.println("Por favor, digite o número da sua agencia: ");
		String Agencia = entrada.nextLine();
		
		System.out.println("Por favor, digite o número da sua conta: ");
		int Numero = entrada.nextInt();				
		
		System.out.println("Por favor, digite seu saldo da conta: ");
		double Saldo = entrada.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
				         + "sua agência é %s, conta %d e seu saldo %s já está "
				         + "disponível para saque.",NomeCliente, Agencia, Numero, String.format("%.2f",Saldo));
	}

}