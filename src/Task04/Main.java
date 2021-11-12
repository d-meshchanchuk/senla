package Task04;

import java.util.Arrays;
import java.util.Scanner;

/*
    Создайте программу, которая будет получать число и печатать его в следующем формате
    (формы цифр можно придумать свои, главное, чтобы они читались на экране)
    (*) Дополнительно: сделайте так, чтобы наибольшая цифра состояла не из ‘*’,
    а из соответствующих маленьких (обычных) цифр.
*/

public class Main {

    public static void main(String[] args) {
        int number;
        int[] arrNumber;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();


        arrNumber = new int[String.valueOf(number).length()];
        splitOnNumbers(number, arrNumber);
        printNumber(arrNumber, 1);


    }

    //Разбивает число на цифры и записывает в массив
    static void splitOnNumbers(int number, int[] arrNumber) {

        for (int i = arrNumber.length - 1; i >= 0; i--) {

            switch (number % 10) {
                case 1:
                    arrNumber[i] = 1;
                    break;
                case 2:
                    arrNumber[i] = 2;
                    break;
                case 3:
                    arrNumber[i] = 3;
                    break;
                case 4:
                    arrNumber[i] = 4;
                    break;
                case 5:
                    arrNumber[i] = 5;
                    break;
                case 6:
                    arrNumber[i] = 6;
                    break;
                case 7:
                    arrNumber[i] = 7;
                    break;
                case 8:
                    arrNumber[i] = 8;
                    break;
                case 9:
                    arrNumber[i] = 9;
                    break;
                case 0:
                    arrNumber[i] = 0;
                    break;
            }

            number /= 10;
        }
    }

    static String[][] add(int number, String symbol) {

        String[][] arr;

        switch (number) {
            case 1:
                arr = new String[][]{{" ", " ", " ", symbol, " ", " "}, {" ", " ", symbol, symbol, " ", " "}, {" ", " ", " ", symbol, " ", " "}, {" ", " ", " ", symbol, " ", " "}, {" ", " ", " ", symbol, " ", " "}};
                break;
            case 2:
                arr = new String[][]{{symbol, symbol, symbol, symbol, symbol, " "}, {" ", " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}, {symbol, " ", " ", " ", " ", " "}, {symbol, symbol, symbol, symbol, symbol, " "}};
                break;
            case 3:
                arr = new String[][]{{symbol, symbol, symbol, symbol, symbol, " "}, {" ", " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}, {" ", " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}};
                break;
            case 4:
                arr = new String[][]{{symbol, " ", " ", " ", symbol, " "}, {symbol, " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}, {" ", " ", " ", " ", symbol, " "}, {" ", " ", " ", " ", symbol, " "}};
                break;
            case 5:
                arr = new String[][]{{symbol, symbol, symbol, symbol, symbol, " "}, {symbol, " ", " ", " ", " ", " "}, {symbol, symbol, symbol, symbol, symbol, " "}, {" ", " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}};
                break;
            case 6:
                arr = new String[][]{{symbol, symbol, symbol, symbol, symbol, " "}, {symbol, " ", " ", " ", " ", " "}, {symbol, symbol, symbol, symbol, symbol, " "}, {symbol, " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}};
                break;
            case 7:
                arr = new String[][]{{symbol, symbol, symbol, symbol, symbol, " "}, {" ", " ", " ", " ", symbol, " "}, {" ", " ", " ", symbol, " ", " "}, {" ", " ", symbol, " ", " ", " "}, {" ", symbol, " ", " ", " ", " "}};
                break;
            case 8:
                arr = new String[][]{{symbol, symbol, symbol, symbol, symbol, " "}, {symbol, " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}, {symbol, " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}};
                break;
            case 9:
                arr = new String[][]{{symbol, symbol, symbol, symbol, symbol, " "}, {symbol, " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}, {" ", " ", " ", " ", symbol, " "}, {symbol, symbol, symbol, symbol, symbol, " "}};
                break;
            case 0:
                arr = new String[][]{{" ", symbol, symbol, symbol, " ", " "}, {symbol, " ", " ", " ", symbol, " "}, {symbol, " ", " ", " ", symbol, " "}, {symbol, " ", " ", " ", symbol, " "}, {" ", symbol, symbol, symbol, " ", " "}};
                break;
            default:
                arr = new String[][]{{" ", " ", " ", " ", " ", " "}, {" ", " ", " ", " ", " ", " "}, {" ", " ", " ", "", " ", " "}, {" ", " ", " ", " ", " ", " "}, {" ", " ", " ", " ", " ", " "}};
        }

        return arr;
    }

    static void printNumber(int[] arrNumber, int maxNumber) {

        String symbol = "*";

        for (int i = 0; i < add(0, symbol).length; i++) {
            for (int j = 0; j < arrNumber.length; j++) {

                symbol = (arrNumber[j] == maxNumber(arrNumber)) ? Integer.toString(arrNumber[j]) : "*";

                for (int k = 0; k < add(arrNumber[j], symbol)[i].length; k++) {
                    System.out.print(add(arrNumber[j], symbol)[i][k]);
                }
            }
            System.out.println();
        }
    }

    //Поиск максимального элемента
    static int maxNumber(int[] arrNumber) {
        int[] arrTemp = Arrays.copyOf(arrNumber, arrNumber.length);
        Arrays.sort(arrTemp);
        return arrTemp[arrTemp.length - 1];
    }
}
