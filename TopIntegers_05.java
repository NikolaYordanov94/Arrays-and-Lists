package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int currentMax = 0;
        int currentTopInteger = 0;

        for (int index = 0; index <= numbersArray.length - 1; index++) {

            for (int index2 = 0; index2 < numbersArray.length - 1; index2++) {

                if (numbersArray[index] > numbersArray[index2]){
                    currentTopInteger = numbersArray[index];
                }
            }
            }
        System.out.println(currentTopInteger);

        }
    }

