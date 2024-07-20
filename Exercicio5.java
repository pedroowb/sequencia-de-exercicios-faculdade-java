import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a posição desejada: ");
        int enesimo = Integer.parseInt(sc.nextLine());
        int f1 = 0;
        int f2 = 1;
        int fibo = 0;
        for (int i = 3; i<= enesimo; i++) {
            fibo = f1 + f2;
            f1 = f2;
            f2 = fibo;
        }
        System.out.println(fibo);
    }
}
