import java.util.ArrayList;
import java.util.Collections;

public class Main {//

    public static void main(String[] args) {
        ;//
        task1();
        task2();
        task3();
        task4();
    }


    public static int[] generateRandomArray() {//
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println(" Задача 1 ");
        int[] arr = generateRandomArray();
        double sum = 0.0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println(" Сумма трат за месяц составила " + sum + " рублей ");


    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int[] payment = generateRandomArray();
        int min = payment[0];
        for (int i = 0; i < payment.length; i++) {
            if (min > payment[i])
                min = payment[i];
        }

        int max = 0;
        for (int i = 0; i < payment.length; i++)
            if (max < payment[i]) {
                max = payment[i];
            }
        System.out.println(" Максимальная сумма трат за месяц составила " + max + " рублей . Минимальная сумма трат за месяц составила " + min + " рублей ");


    }


    public static void task3() {
        System.out.println(" Задача 3 ");
        int[] payment = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < payment.length; i++) {
            sum += payment[i];
        }
        double average = sum / payment.length;
        System.out.println(" Средняя сумма трат за месяц = " + average + " рублей ");

    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);

    }
}













































