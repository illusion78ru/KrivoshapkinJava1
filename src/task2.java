import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 строки: a и b");
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        }
        else System.out.println("Строки неидентичны");
    }
}