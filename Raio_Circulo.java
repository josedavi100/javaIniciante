10. Ler  o  raio  de  um  círculo. Em  seguida,  imprima  o
comprimento e a área do círculo que possui esse raio.
	
	package exercicio10;
	import static java.lang.Math.pow;
	import java.util.Scanner;
	public class Exercicio10 {

    		public static void main(String[] args) {
   			Scanner ler = new Scanner (System.in);
        		double raio, area, comp, pi = 3.14;
        		System.out.println("Digite o raio do circulo: ");
        		raio = ler.nextDouble();
        		comp = 2*pi*raio;
        		area = pi*pow(raio, 2);
        		System.out.printf("O comprimento da Circunferência é: %.2f m^2", comp);
        		System.out.printf("\nE a sua área é: %.2f m^2\n", area);
    		}
    
	}
