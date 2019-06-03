import java.util.Scanner;
public class NumerosImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner impares = new Scanner (System.in);
		
		int x, numero;
		
		System.out.println("Informe o valor do inteiro: ");
		numero = impares.nextInt();
		
		for (x=numero; x<100; x++) {
			if (x % 2 == 1) {
				System.out.println("Numeros impares: "+x);
			}
		}
		
		System.out.println("Numeros digitado foi: "+numero);

		impares.close();
	}

}
