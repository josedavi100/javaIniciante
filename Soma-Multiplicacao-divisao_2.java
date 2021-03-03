7. Ler dois valores inteiros e imprimir o resultado da
soma,  subtração,  multiplicação,  quociente e resto	
da divisão.


	package exercicio7;
	import java.util.Scanner;
	public class Exercicio7 {

    		public static void main(String[] args) {
       			Scanner ler = new Scanner (System.in);
        		int num1, num2;
        		System.out.println("Digite um numero: ");
        		num1 = ler.nextInt();
        		System.out.println("Digite outro numero: ");
        		num2 = ler.nextInt();
        		System.out.println("Adição: " + (num1+num2));
        		System.out.println("Subtração: " + (num1-num2)); 
        		System.out.println("Multiplicação: " + (num1*num2)); 
        		System.out.println("Quociente: " + (num1/num2)); 
        		System.out.println("Resto Da Divisão: " + (num1%num2));
    		}
    
	}
