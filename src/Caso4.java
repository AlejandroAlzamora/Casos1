import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0, n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextInt();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextInt();
		
		//Procesamiento
		int suma = n1 + n2;
		int resta = n1 - n2;
		int producto = n1 * n2;
		float division = n1 / n2;
		int resto_entero = n1 % n2;
		
		//Salida de resultados
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Producto: " + producto);
		System.out.println("Division : " + division);
		System.out.println("Resto Entero: " + resto_entero);
	}

}
