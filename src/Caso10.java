import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int radio = 0;
		
		System.out.print("Ingrese Radio:");
		radio = sc.nextInt();
		
		System.out.println("RESULTADOS");
		System.out.println("==========");
		System.out.println("Área del círculo:" + 3.1416 * (radio * radio));;
	}

}
