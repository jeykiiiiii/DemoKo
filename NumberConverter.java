package DemoKo;

import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //kahit di manalo basta nakapag practice :))

        System.out.println("Input decimal number to convert");
        int userInput = scanner.nextInt();

        String binaryResult = binaryConverter(userInput);
        String hexaResult = hexadecimalConverter(userInput);
        String octalResult = octalConverter(userInput);

        System.out.println("Binary of " + userInput + " is " + binaryResult );
        System.out.println("HexaDecimal of " + userInput + " is " + hexaResult);
        System.out.println("OctalResult of " + userInput + " is " + octalResult);

    }

    private static String binaryConverter(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return binaryConverter(n / 2) + (n % 2);
        }
    }

    private static String hexadecimalConverter(int n) {
        if (n == 0) {
            return "";
        }

        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int remainder = n % 16;
        char hexDigit = hexChars[remainder];
        return hexadecimalConverter(n / 16) + hexDigit;
    }

    private static String octalConverter(int n) {
        if (n == 0) {
            return "0";
        } else if (n < 8) {
            return "" + n;
        } else {
            return octalConverter(n / 8) + (n % 8);
        }
    }
}
