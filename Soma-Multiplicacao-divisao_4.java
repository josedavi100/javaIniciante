9. Qual o resultado das expressões abaixo?

a) 5 * 4 / 6 + 7  
b) 5 * 4 / (6 + 7) 
c) 5 * 4.0 / 6 + 7
d) 5 * 4 % 6 + 7
e) 5 * 4 / (float)6 + 7
f) (4 / 3) + (3.0 * 5)
g) (4 / 3.0) + (3 * 5)
h) (int)(4 / 3.0) + (3 * 5)


	package exercicio9;

	public class Exercicio9 {

  	  public static void main(String[] args) {
 	  	double resultado;
        	System.out.println("----------------------------------------");
        	resultado = 5*4/6+7;
        	System.out.print("A) ");System.out.println(resultado);
        	resultado = 5*4/(6+7);
        	System.out.print("B) ");System.out.println(resultado);
        	resultado = 5*4.0/6+7;
        	System.out.print("C) ");System.out.println(resultado);
        	resultado = 5*4%6+7;
        	System.out.print("D) ");System.out.println(resultado);
        	resultado = 5*4/(float)6+7;
        	System.out.print("E) ");System.out.println(resultado);
        	resultado = (4/3)+(3.0*5);
        	System.out.print("F) ");System.out.println(resultado);
        	resultado = (4/3.0)+(3*5);
        	System.out.print("G) ");System.out.println(resultado);
        	resultado = (int)(4/3.0)+(3*5);
        	System.out.print("H) ");System.out.println(resultado);
        	System.out.println("----------------------------------------");
   	 }
    
	}
