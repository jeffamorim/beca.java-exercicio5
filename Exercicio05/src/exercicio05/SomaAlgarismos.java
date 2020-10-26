package exercicio05;
import java.util.Scanner;

public class SomaAlgarismos {

	public int numero;
	public int soma;
	public int mod;
	
	
	
	public void Somar() {
		System.out.print("Digite o numero: ");
		int numero = new Scanner(System.in).nextInt();
		
		while(numero < 10) {
			System.out.println("Esse numero possui apenas um algarismo, digite outro numero.");
			System.out.print("Digite o numero: ");
			numero = new Scanner(System.in).nextInt();
		}
		
		while(numero > 0) {
			mod = numero % 10;
			
			soma += mod;
			
			numero /= 10;
		}
		System.out.println("A soma dos algarismos é :"+soma);

	}
	
}

