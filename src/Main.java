import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ��� ����� �����:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // ��������� �����
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // �������� ��� �������
        System.out.println("��������: " + (a + b));
        System.out.println("���������: " + (a - b));

        if (b != 0) {
            System.out.println("�������: " + (a / b));
        } else {
            System.out.println("������� �� ���� ����������");
        }

        System.out.println("���������: " + (a * b));

        scanner.close();
    }
}