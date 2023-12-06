import java.util.Scanner;

// Fazer um programa para ler um número inteiro N e a alutura de N pessoas.
// armazenar as N alturas em um vetor. Em seguida mostrar a aultura media dessas pessoas
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Produtos que serão cadastrados: ");
        int n = scanner.nextInt();

        String[] nome = new String[n];
        double[] preco = new double[n];

        for(int i=0; i<n; i++){
            System.out.printf("Nomes dos Produto: ");
            System.out.printf("Nome:");
            scanner.nextLine();
            nome[i] = scanner.nextLine();
            System.out.printf("preço:");
            preco[i] = scanner.nextDouble();
        }

        double soma = 0;
        for(int i=0; i<n; i++){
            soma += preco[i];
        }
        double media = soma/n;
        System.out.printf("O valor medio dos preços é: %.2f",media);
    }
}