package Task03;

import java.util.Arrays;
import java.util.Scanner;

/*
    Создайте программу, которая будет:
    -подсчитывать количество гласных в словах
    -выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
    -делать первую гласную букву в слове заглавной
    Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).
*/

public class Main {

    public static void main(String[] args) {

        String inputStr;
        String[] arrWords;
        String[] arrLetters;
        int[] arrNumberVowels;
        int countVowels;
        boolean isSorted = false;
        int sumVowels = 0;
        String[] arrVowels = {"А", "О", "И", "Е", "Ё", "Э", "Ы", "У", "Ю", "Я"};

        System.out.println("Введите строку русскими буквами. Разделитель пробел (“ ”)");
        Scanner scanner = new Scanner(System.in);
        inputStr = scanner.nextLine();

        arrWords = inputStr.split(" ");
        arrNumberVowels = new int[arrWords.length];

        for (int i = 0; i < arrWords.length; i++) {
            arrLetters = arrWords[i].split("");
            countVowels = 0;

            for (int j = 0; j < arrLetters.length; j++) {
                if (Arrays.asList(arrVowels).contains(arrLetters[j].toUpperCase())) {
                    countVowels++;
                    sumVowels++;
                }
            }

            arrNumberVowels[i] = countVowels;
        }

        System.out.println("Количество гласных в словах: " + sumVowels);
        System.out.println("Слова отсортированные по количеству гласных (сначала те, у которых больше гласных):");

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrNumberVowels.length - 1; i++) {

                if (arrNumberVowels[i] < arrNumberVowels[i + 1]) {
                    int tempInt = arrNumberVowels[i];
                    arrNumberVowels[i] = arrNumberVowels[i + 1];
                    arrNumberVowels[i + 1] = tempInt;

                    String tempStr = arrWords[i];
                    arrWords[i] = arrWords[i + 1];
                    arrWords[i + 1] = tempStr;

                    isSorted = false;
                }
            }
        }

        for (int i = 0; i < arrWords.length; i++) {
            arrLetters = arrWords[i].split("");

            for (int j = 0; j < arrLetters.length; j++) {
                if (Arrays.asList(arrVowels).contains(arrLetters[j].toUpperCase())) {
                    arrLetters[j] = arrLetters[j].toUpperCase();
                    break;
                }
            }

            System.out.println(String.join("", arrLetters));
        }
    }
}
