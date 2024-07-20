import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número para verificar se é um inteiro ou primo: ");
        int numero = sc.nextInt();
        int modulo = numero % 7;
        if (modulo == 0) {
            System.out.println("Seu número é um número primo!");
        }
        else{
            System.out.println("Seu número é natural!");
        }
        sc.close();
    }
}
