import java.util.Random;

public class Vetor02 {
    public static final int TAM = 100;
    public static final int MIN = 1;
    public static final int MAX = 30;
    public static Random random = new Random();
    
    public static void main(String[] args) {
        int[] numeros = new int[TAM];
        preencherAleatorio(numeros);
        double media = calcularMedia(numeros);
        System.out.printf("A média dos números inteiros deste vetor é %.2f\n", media);
        imprimir(numeros);
    }

    public static void preencherAleatorio(int[] v) {
        for (int i = 0; i < v.length; i += 1) {
            v[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }
    }

    public static double calcularMedia(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i += 1) {
            soma += v[i];
        }
        return (double) soma / (double) v.length;
    }

    public static void imprimir(int[] v) {
        System.out.print("{");
        if (v.length >= 1) {
            System.out.print(" " + v[0]);
            for (int i = 1; i < v.length; i += 1) {
                System.out.print(", " + v[i]);
            }
        }
        System.out.print(" }");
    }
}