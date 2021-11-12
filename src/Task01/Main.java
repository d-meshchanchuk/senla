package Task01;

import java.util.Scanner;

/*
    Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
    Если цифр нет, то возвращаемая сумма должна быть равна 0.
*/

public class Main {

    public static void main(String[] args) {

        String inputString;
        String[] strArray;
        int sum = 0;

        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.next();

        strArray = inputString.split("");

        for (String element : strArray) {
            try {
                sum += Integer.parseInt(element);
            } catch (NumberFormatException ignored) {

            }
        }

        System.out.println("Сумма цифр: " + sum);
    }
}
