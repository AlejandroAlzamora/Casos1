import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base = 0;
		
		int altura = 0;
		
		System.out.print("Ingrese Base:");
		base = sc.nextInt();
		
		System.out.print("Ingrese Altura:");
		altura = sc.nextInt();
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Área del rectangulo:" + base * altura);
		System.out.println("Perimetro:" + (base + altura) * 2);

	}

}
