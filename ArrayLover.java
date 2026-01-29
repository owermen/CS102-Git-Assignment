import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayLover {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();

        int range = in.nextInt();
        in.nextLine();

        int[] array = new int[range];

        for (int i = 0; i < range; i++) {
            array[i] = rn.nextInt(101); // 101 is exclusive
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("-- Menu Options --");
            System.out.println("1) Find the minimum");
            System.out.println("2) Find the maximum");
            System.out.println("3) Find the average");
            System.out.println("4) Find the summ of odds and evens");
            System.out.println("5) Exit");
            int answer = in.nextInt();
            in.nextLine();

            if (answer == 1) {
                // MINIMUM
            }

            if (answer == 2) {
                // Maximum
            }

            if (answer == 3) {
                average(array);
            }

            if (answer == 4) {
                sumEvenOdd(array);
            }

            if (answer == 5) {
                exit = true;
                System.out.println("Goodbye!");
            }

        }

        in.close();
    }

    public static void minimum(int[] array){
        
    }

    public static void maximum(int[] array){

    }

    public static void average(int[] array) {
        double average;
        int sum = 0;

        for (int n : array) {
            sum += n;
        }

        average = (double) sum / array.length;

        double[] normalizedArray = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            normalizedArray[i] = array[i] - average;
        }

        System.out.println("Differences from the average: " + Arrays.toString(normalizedArray));

    }

    public static void sumEvenOdd(int[] array) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i % 2 == 0) {
                even += array[i];
            }

            if (i % 2 != 0) {
                odd += array[i];
            }
        }

        System.out.println("Sum of the even indexes are " + even);
        System.out.println("Sum of the odd indexes are " + odd);

    }

}
