import java.util.Scanner;

public class Idade {
  public static Scanner input = new Scanner(System.in);
  public static final int ANO_ATUAL = 2026;
  public static void main(String[] args) {
    System.out.println("Digite a sua idade: ");
    int idade = input.nextInt();
    if (idade >= 18) {
      System.out.println("Você já pode tirar carteira de motorista!");
    } else {
      System.out.println("Você ainda não pode tirar carteira de motorista!");
    }
    if (idade < 16) {
      System.out.println("Você não pode votar!");
    } else if (idade < 18) {
      System.out.println("Você pode tirar o título de eleitor e votar!");
    } else if (idade < 70) {
      System.out.println("É obrigatório ter título de eleitor e votar!");
    } else {
      System.out.println("Você não tem mais obrigação de votar!");
    }

    int anoNasc = ANO_ATUAL - idade;
    System.out.println("Você nasceu provavelmente em " + anoNasc);
  }
}
// HARD CODED VALUE - MAGICAL VALUE