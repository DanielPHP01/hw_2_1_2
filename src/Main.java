import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(walk(1000, 10000));// ��� ������ � ���� �������� ������ ����� main, ������ ����� :)
        System.out.println(walk(25, 29));
        System.out.println(walk(19, -1));
        System.out.println(walk(45, 25));
        System.out.println(walk(48, 22));

        System.out.println(generateRandomAge());
    }

    public static String walk(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return ("����� ���� ������");
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            return ("����� ���� ������");
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return ("����� ���� ������");
        } else
            return ("����������� ����");
    }

    public static String generateRandomAge() {
        int min = 5;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int randomAge = random.nextInt(diff + 1) + min;

        if (randomAge >= 20 ) {
            return ("����� ������ ������");
        } else if ( randomAge > 5 ) {
            return ("����� ������ ������");
        } else if (randomAge < 80 ) {
            return ("����� ������ ������");
        } else
            return ("����������� ����");


    }

}