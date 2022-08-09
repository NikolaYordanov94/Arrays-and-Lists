package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int currentMagicSumInteger1 = 0;
        int currentMagicSumInteger2 = 0;
        int countEqual = 0;

        int equalToNumber = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbersArray.length - 1; index++) {
            for (int index2 = index + 1; index2 <= numbersArray.length - 1; index2++) {

                if (numbersArray[index] + numbersArray[index2] == equalToNumber) {
                    currentMagicSumInteger1 = numbersArray[index];
                    currentMagicSumInteger2 = numbersArray[index2];

                    if (currentMagicSumInteger1 == currentMagicSumInteger2) {
                        countEqual++;
                        if (countEqual <= 1) {
                            System.out.print(currentMagicSumInteger1 + " ");
                            System.out.println(currentMagicSumInteger2);
                        }
                        }else{
                        System.out.print(currentMagicSumInteger1 + " ");
                        System.out.println(currentMagicSumInteger2);
                    }
                }
                    }
                }
                }
            }




