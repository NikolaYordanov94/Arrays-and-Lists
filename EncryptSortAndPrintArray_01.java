package ArraysMoreExercises;

import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            double sumForEachNameVowels = 0;
            double countForEachNameVowels = 0;
            double sumForEachNameConsonant = 0;
            double countForEachNameConsonant = 0;
            double sum = 0;
            double countNameLetters = 0;

            String name = scanner.nextLine();

            for (char symbol = 0; symbol < name.length(); symbol++) {

                if (name.charAt(symbol) == 'a' || name.charAt(symbol) == 'e' || name.charAt(symbol) == 'i' || name.charAt(symbol) == 'o' || name.charAt(symbol) == 'u' || name.charAt(symbol) == 'A' || name.charAt(symbol) == 'E' || name.charAt(symbol) == 'I' || name.charAt(symbol) == 'O' || name.charAt(symbol) == 'U') {

                    sumForEachNameVowels = (double) name.charAt(symbol) * name.length();
                    countForEachNameVowels += sumForEachNameVowels;

                } else {
                    sumForEachNameConsonant = (double) name.charAt(symbol) / name.length();
                    countForEachNameConsonant += countForEachNameConsonant;
                }
                sum = countForEachNameVowels + countForEachNameConsonant;
            }
            System.out.println(sum);
        }

    }
}
