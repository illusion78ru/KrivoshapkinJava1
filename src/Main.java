import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции над числами
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));

        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        System.out.println("Умножение: " + (a * b));

        scanner.close();
    }
}