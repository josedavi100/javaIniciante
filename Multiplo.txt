11. Ler  um  número  inteiro  e  verificar  se  é  ou  não 
múltiplo de 5, imprimindo mensagem para cada caso.


	package exercicio11;
	import java.util.Scanner;
	public class Exercicio11 {
    		public static void main(String[] args) {
        		Scanner ler = new Scanner (System.in);
        		int num;
        
        		System.out.println("Digite um numero: ");
        		num = ler.nextInt();
        		if(num%5 == 0){
            			System.out.println("Esse numero é multiplo de 5");
        		} else {
            			System.out.println("Esse numero não é multiplo de 5");
        		}
    		}
	}
