13.  Ler um número de alunos n. Em seguida,
ler as notas dos n alunos e imprimir, ao final,
a média da turma. Faça uma solução com for e outra solução com while.



FOR:


package exercicio13;
import java.util.Scanner;
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n = 0;
        double media = 0;
        System.out.print("Digite o numero de alunos: ");
        n = ler.nextInt();
        double nalunos[] = new double[n];
        int i;
        for(i=0;i<n;i++){
            System.out.print("Digite a nota: ");
            nalunos[i] = ler.nextDouble();
            media = media + nalunos[i];
        }
        media = media / n;
        System.out.printf("A Média da turma é: %.2f\n", media);
    }
    
}



WHILE:


package exercicio13part2;
import java.util.Scanner;
public class Exercicio13part2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n = 0, i = 0;
        double media = 0;
        double nalunos;
        System.out.print("Digite o numero de alunos: ");
        n = ler.nextInt();
        while(i < n){
            i=i+1;
            System.out.print("Digite a nota: ");
            nalunos = ler.nextDouble();
            media = media + nalunos;
        }
        media = media / n;
        System.out.printf("A Média da turma é: %.2f\n", media);
    } 
}
