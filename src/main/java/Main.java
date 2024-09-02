import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite um numero para saber se é negativo ou positivo:");
    int numero = sc.nextInt();
    System.out.println("o numero digitado foi:");
    System.out.println(numero);
    if (numero > 0) {
      System.out.println("ele é positivo");
    }
    if (numero == 0) {
      System.out.println("ele é zero.");
    } else {

      System.out.println("ele é negativo");
    }

    sc.close();
  }

}