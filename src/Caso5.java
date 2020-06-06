import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Ingrese primer número:");
		n1 = sc.nextFloat();
		
		System.out.print("Ingrese segundo número:");
		n2 = sc.nextFloat();
		
		System.out.println("Resultados");
		System.out.println("==========");
		System.out.println("Promedio: " + (n1 + n2)/2);
		System.out.println("Primero aumentado en 20%: " + (n1 + (n1 * 0.2)));
		System.out.println("Segundo desminuido en 30%:" + (n2 + (n2 * -0.3)));
		
		

	}

}
