import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int notas = 0;

        boolean entrada;

        Scanner scanner = new Scanner(System.in);

        do {
            try{
                System.out.printf("Quantas serão as notas recebidas pelo aluno?");
                notas = scanner.nextInt();
                entrada = true;
            }
            catch (InputMismatchException e) {
                System.out.printf("Digite um valor inteiro");
                scanner.nextInt();
                entrada = false;
            }
            catch(Exception e) {
                System.out.printf("Favor, digitar um valor válido.");
                scanner.nextInt();
                entrada = false;
            }
        } while(!entrada);

        double[] vNotas = new double[notas];
        for(int i=0; i<notas; i ++)  {
            try{
                System.out.printf("Qual a nota do" + i + 1 + "Aluno");
                scanner.nextInt();
            }
            catch(InputMismatchException e) {
                System.out.printf("Favor, digitar um valor válido.");
                scanner.nextInt();
            }

        }
        double somaTotal = 0;
        for(int i=0; i<notas; i++){
            somaTotal += vNotas[i];
        }
        double media = somaTotal/notas;
        System.out.printf("O Resultado é: %.2f", media);
    }
}