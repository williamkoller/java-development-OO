import java.util.Scanner;
public class NumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pares = new Scanner (System.in);
		int i, numero;
		
		System.out.println("Informe o valor do inteiro: ");
		numero = pares.nextInt();
		
		for (i=numero; i<100; i++) {
			if (i % 2 == 0) {
				System.out.println(" Numeros pares: "+i);
			}
		}
		
		System.out.println("Numeros digitado foi: "+numero);

		
		pares.close();
	}

}
