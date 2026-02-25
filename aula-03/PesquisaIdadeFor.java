import java.util.Scanner;

public class PesquisaIdadeFor {
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int idade = 0, somaIdades = 0, qtdPessoas;
    double media;

    System.out.println("Digite a quantidade de participantes da pesquisa: ");
    qtdPessoas = input.nextInt();

    for (int i = 1; i <= qtdPessoas; i += 1) {
        System.out.println("Digite a idade do " + i + "º participante: ");
        idade = input.nextInt();
        somaIdades += idade; // somaIdades = somaIdades + idade;
    }

    if (qtdPessoas >= 1) {
        media = calcularMedia(qtdPessoas, somaIdades);
        System.out.println(qtdPessoas + " pessoas participaram da pesquisa");
        System.out.println("A idade média dos participantes foi de " + media + " anos");
    } else {
        System.out.println("Nenhuma pessoa participou da pesquisa!");
    }

    System.out.println("3² = " + quadrado(3));
    System.out.println("5² = " + quadrado(5));
    System.out.println("9² = " + quadrado(9));
    System.out.println(idade + "² = " + quadrado(idade));
  }

  public static double calcularMedia(int qtd, int somatorio) {
    return somatorio / qtd;
  }

  // f(x) = x²
  public static double quadrado(double x) {
    return x * x;
  }
}