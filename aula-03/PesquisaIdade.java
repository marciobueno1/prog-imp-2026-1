import java.util.Scanner;

public class PesquisaIdade {
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int idade, somaIdades = 0, qtdPessoas = 0;
    double media;

    System.out.println("Digite a sua idade: ");
    idade = input.nextInt();

    while (idade >= 0) {
      qtdPessoas += 1;
      somaIdades += idade;

      System.out.println("Digite a sua idade (< 0 para sair): ");
      idade = input.nextInt();
    }


    if (qtdPessoas != 0) {
      media = somaIdades / qtdPessoas;
      System.out.println(qtdPessoas + " pessoas participaram da pesquisa");
      System.out.println("A idade média dos participantes foi de " + media + " anos");
    } else {
      System.out.println("Nenhuma pessoa participou da pesquisa!");
    }
  }
}