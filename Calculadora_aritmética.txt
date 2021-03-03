/*12. Ler  um  caracter  op  representando  uma  operação
aritmética (+, -, *, /) e em seguida dois números reais a e b.
Imprimir a expressão matemática junto com o seu resultado no formato: a op b = resultado*/


package exercicio12;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char op;
        float a, b, resultado;
        
        System.out.println("Digite Um Numero: ");
        a = ler.nextInt();
        System.out.println("Digite um operador: [+ - / *] ");
        op = ler.next().charAt(0);
        System.out.println("Digite Outro Numero: ");
        b = ler.nextInt();
        
        if(op == '+'){
            resultado = a+b;
            System.out.printf("%.2f ", a);
            System.out.print(op);
            System.out.printf(" %.2f = ", b);
            System.out.println(resultado);
        }
        
        if(op == '-'){
            resultado = a-b;
            System.out.printf("%.2f ", a);
            System.out.print(op);
            System.out.printf(" %.2f = ", b);
            System.out.println(resultado);
        }
        
        if(op == '/'){
            resultado = a/b;
            System.out.printf("%.2f ", a);
            System.out.print(op);
            System.out.printf(" %.2f = ", b);
            System.out.println(resultado);
        }
        
        if(op == '*'){
            resultado = a*b;
            System.out.printf("%.2f ", a);
            System.out.print(op);
            System.out.printf(" %.2f = ", b);
            System.out.println(resultado);
        }
        
    } 
}
