package ArraysExercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] peopleArray = new int [n];

        int sum = 0;

        for (int i = 0; i < peopleArray.length; i++) {

            peopleArray [i] = Integer.parseInt(scanner.nextLine());
            sum += peopleArray[i];
            System.out.print(peopleArray[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
