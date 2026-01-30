import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayLover {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Enter the range of the array: ");
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
                minimum(array);
            }

            if (answer == 2) {
                maximum(array);
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
    public static void maximum(int[] array){
        int max = array[0];
        for (int num : array) {
          if (num > max) {
            max = num;
          }
        }
        System.out.println("Maximum value is: " + max);
    }


    public static void minimum(int[] array){
        int min = array[0];
        for (int num : array) {
          if (num < min) {
            min = num;
          }
        }
        System.out.println("Minimum value is: " + min);
    }

    public static void average(int[] array) {
        int average;
        int sum = 0;

        for (int n : array) {
            sum += n;
        }

        average = sum / array.length;

        int[] normalizedArray = new int[array.length];

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

