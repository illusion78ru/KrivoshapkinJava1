import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 числа: a и b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b: ");
        } else if (a < b) {
            System.out.println("a < b: ");
        } else {
            System.out.println("a = b: ");
        }

        System.out.println("Результат сложения: " + (a + b));
        System.out.println("Результат вычитания: " + (a - b));

        if (b != 0) {
            System.out.println("Результат деления: " + (a / b));
        } else {
            System.out.println("На 0 делить нельзя");
        }

        System.out.println("Результат умножения: " + (a * b));

        scanner.close();
    }
}