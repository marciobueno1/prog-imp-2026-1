import java.util.Random;
import java.util.Scanner;

public class Vetor03 {
    public static final int TAM = 100;
    public static final int MIN = 1;
    public static final int MAX = 10;
    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] numeros = new int[TAM];
        preencherAleatorio(numeros);
        System.out.print("\n\nVetor: ");
        imprimir(numeros);
        bubbleSort(numeros, numeros.length);
        System.out.print("\n\nVetor: ");
        imprimir(numeros);
        double media = calcularMedia(numeros);
        System.out.printf("\n\nA média dos números inteiros deste vetor é %.2f\n", media);
        System.out.print("Vetor: ");
        imprimir(numeros);
        buscarNumeros(numeros);
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

    public static int buscaSequencial(int[] v, int n, int x) {
        for (int i = 0; i < n; i += 1) {
            if (x == v[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaBinaria(int[] v, int n, int x) {
        int inicio = 0, fim = n -1, meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (x == v[meio]) {
                return meio;
            } else if (x < v[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static void buscarNumeros(int[] v) {
        int num;
        System.out.print("\n\nDigite um número a ser buscado: ");
        num = input.nextInt();
        while (num >= MIN && num <= MAX) {
            int pos = buscaBinaria(v, v.length, num);
            if (pos != -1) {
                System.out.printf("Número %d está na posição %d\n", num, pos + 1);
            } else {
                System.out.printf("Número %d não está no vetor\n", num);
            }
            System.out.print("Vetor: ");
            imprimir(v);
            System.out.print("\n\nDigite um número a ser buscado (num inválido para finalizar): ");
            num = input.nextInt();
        }
    }

    public static void preencherAleatorioOrdenadoSemRepeticao(int[] v) {
        int num;
        for (int i = 0; i < v.length; i += 1) {
            do {
                num = random.nextInt(MAX - MIN + 1) + MIN;
                if (buscaSequencial(v, i, num) != -1) {
                    System.out.println("número repetido! " + num);
                }
            } while (buscaSequencial(v, i, num) != -1);
            inserirOrdenado(v, i, num);
        }
    }

    public static void preencherAleatorioOrdenado(int[] v) {
        for (int i = 0; i < v.length; i += 1) {
            inserirOrdenado(v, i, random.nextInt(MAX - MIN + 1) + MIN);
        }
    }

    public static void inserirOrdenado(int[] v, int n, int x) {
        int pos = n;
        while (pos >= 1 && x < v[pos - 1]) {
            v[pos] = v[pos - 1];
            pos -= 1;
        }
        v[pos] = x;
    }

    public static void insertionSort(int[] v, int n) {
        for (int i = 1; i <= n - 1; i += 1) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j -= 1;
            }
            v[j + 1] = chave;
        }
    }

    public static void selectionSort(int[] v, int n) {
        for (int i = 0; i < n - 1; i += 1) {
            int menor = i;
            for (int j = i + 1; j < n; j += 1) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
            int aux = v[i];
            v[i] = v[menor];
            v[menor] = aux;
        }
    }

    public static void bubbleSort(int[] v, int n) {
        int aux;
        int pos = 0, fim = n - 2;
        boolean troca = true;
        while (troca) {
            troca = false;
            for (int i = 0; i <= fim; i += 1) {
                if (v[i] > v[i + 1]) {
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    troca = true;
                    pos = i;
                }
            }
            fim = pos - 1;
        }
    }
}