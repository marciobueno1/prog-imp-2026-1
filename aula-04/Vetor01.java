import java.util.Scanner;

public class Vetor01 {
    public static Scanner input = new Scanner(System.in);
    public static final int TAM_MIN = 1;
    public static final int TAM_MAX = 30;
    public static void main(String[] args) {
        int qtdPessoas;
        int[] idades;

        do {
            System.out.printf("Digite a quantidade de pessoas (%d-%d): \n",
                TAM_MIN, TAM_MAX
            );
            qtdPessoas = input.nextInt();
        } while (qtdPessoas < TAM_MIN || qtdPessoas > TAM_MAX);
        
        idades = new int[qtdPessoas];

        for (int i = 0; i < idades.length; i += 1) {
            System.out.println("Digite uma idade: ");
            idades[i] = input.nextInt();
        }

        double media = calcularMedia(idades);
        System.out.println("A média de idades é " + media);

        System.out.println("As idades maiores ou iguais a média são: ");
        for (int i = 0; i < idades.length; i += 1) {
            if (idades[i] >= media) {
                System.out.println(idades[i]);
            }
        }

        System.out.println("\n\nAs idades digitadas foram: ");

        for (int i = 0; i < idades.length; i += 1) {
            System.out.println(idades[i]);
        }

        // int[] idades = { 18, 50, 15, 17, 90 };
        // idades = new int[5];
        // idades[0] = 18;
        // idades[1] = 50;
        // idades[2] = 15;
        // idades[3] = 17;
        // idades[4] = 90;
        // System.out.println(idades[0]);
        // System.out.println(idades[1]);
        // System.out.println(idades[2]);
        // System.out.println(idades[3]);
        // System.out.println(idades[4]);
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i += 1) {
            soma += numeros[i];
        }
        return (double) soma / (double) numeros.length;
    }
}