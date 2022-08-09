package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;



        for (int index = 1; index <= numbersArray.length - 1; index++) {

            if(numbersArray[index] == numbersArray[index - 1]){

                length++;

            }else{
                length = 1;
                startIndex = index;
            }

            if (length > maxLength){
                maxLength = length;
                bestStartIndex = startIndex;
            }
        }
        for (int i = bestStartIndex; i < bestStartIndex + maxLength; i++) {
            System.out.print(numbersArray[i] + " ");

        }
    }
}
