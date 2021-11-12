package Task02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Создайте программу, которая будет вычислять и выводить на экран простые множители,
    из которых состоит целое число, введенное пользователем.
    Если введенное число не целое, то нужно сообщать пользователю об ошибке.
*/

public class Main {

    public static void main(String[] args) {

        int number;

        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
            System.out.print("Простые множители: ");
            findPrimeNumbers(number);
        } catch (InputMismatchException e){
            System.out.println("Ошибка ввода!");
        }
    }

    public static void findPrimeNumbers(int number) {

        int minPrimeNumber = 2;

        while (minPrimeNumber <= number) {
            if ((number % minPrimeNumber) == 0) {
                if (minPrimeNumber != number) {
                    System.out.print(minPrimeNumber + " ");
                    findPrimeNumbers(number / minPrimeNumber);
                } else {
                    System.out.print(minPrimeNumber);
                }
                return;
            }

            minPrimeNumber++;
        }
    }
}
