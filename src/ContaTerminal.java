import java.util.Scanner;
public class ContaTerminal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome completo: ");
		String NomeCliente = entrada.nextLine();
		
		System.out.println("Por favor, digite o n�mero da sua agencia: ");
		String Agencia = entrada.nextLine();
		
		System.out.println("Por favor, digite o n�mero da sua conta: ");
		int Numero = entrada.nextInt();				
		
		System.out.println("Por favor, digite seu saldo da conta: ");
		double Saldo = entrada.nextDouble();
		
		System.out.printf("Ol� %s, obrigado por criar uma conta em nosso banco, "
				         + "sua ag�ncia � %s, conta %d e seu saldo %s j� est� "
				         + "dispon�vel para saque.",NomeCliente, Agencia, Numero, String.format("%.2f",Saldo));
	}

}