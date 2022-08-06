package ArraysExercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotations; rotation++) {
            // ротация на масива
            //1. взимаме първия елемент
            //2. местя всички елементи наляво
            //3. задавам последния елемент в масива да е първия

            String firstElement = array[0];
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];


            }
            array[array.length - 1] = firstElement;
        }
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
