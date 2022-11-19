import java.util.Scanner;

public class Ejercicio_III {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		boolean salir = false;
		int incremento = 0;
		int r_incremento = 0;
		int decremento = 20;
		int r_decremento = 0;
		
		while (!salir) {
			
			System.out.println("(1) Incremento: (+)");
			System.out.println("(2) Decremento: (-)");
			System.out.println("(3) Salir");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				incremento ++;
				if (incremento == 10) {
					r_incremento = (incremento / 2);
					incremento = r_incremento;
					System.out.println(r_incremento);
			
				} else {
					System.out.println(incremento);
					
				}
				
				break;
			case 2: 
				decremento --;
				if (decremento == 1) {
					decremento = 20;
					
				} else if (decremento == 10) {
					r_decremento = (decremento / 2);
					decremento = r_decremento;
					System.out.println(r_decremento);
					
				}  else {
					System.out.println(decremento);
				}
				
				break;
			case 3:
				System.out.println("Salir");
				salir = true;
				
				break;
				
			default:
				System.out.println("Opcion no validad \n Ingrese valor de menu");
				break;
			}
			
		}

	}

}
