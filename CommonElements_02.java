package ArraysExercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        String coincidence = "";

        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {

                if(firstArr[j].equals(secondArr[i])){
                    coincidence = firstArr[j];
                    System.out.print(coincidence + " ");
                    }
                }
            }
        }
    }
