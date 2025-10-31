/**
 * @author Vicky Kang
 * @since 16 October 2025
 */

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class RandomNumber {

    // Main method
    public static void main(String[] args) {

        int[] numberSet = generateRandomNumbers(9);
        System.out.println("First set:");
        printAllNumbers(numberSet);
        System.out.printf("Median: %.2f\n", median(numberSet));
        System.out.printf("Average: %.2f\n", average(numberSet));
        System.out.printf("%d numbers are even\n", evens(numberSet));
        System.out.printf("%d numbers are odd\n", odds(numberSet));
        int[] numberSet2 = generateRandomNumbers(10);
        System.out.println("Second set:");
        printAllNumbers(numberSet2);
        System.out.printf("Median: %.2f\n", median(numberSet2));
    }

    /**
     * Generates an array of random integers between 0 and 99, sorts them in ascending order, 
     * and returns the sorted array. The random number generator uses a fixed seed (9) 
     * for reproducibility.
     * @param random number set
     * @return numbers
     */
    private static int[] generateRandomNumbers(int size) {
        Random rnd = new Random();
        rnd.setSeed(9);      
        int [] numbers = new int[size];
        for (int i=0; i < size; i++) {
            numbers[i] = Math.abs(rnd.nextInt()) % 100;
        }     
        Arrays.sort(numbers);   
        return numbers;
    }

    /**
     * print all of the random numbers set
     * @param numberSet
     * @return
     */ 
    private static void printAllNumbers(int[] numberSet) {
        for (int i = 0; i < numberSet.length; i++) {
            System.out.println(numberSet[i] + "");
        }
        
    }


    /**
     * Print how many even in the number set
     * @param numberSet
     * @return even count
     */
    private static int evens(int[] numberSet) {
        int count = 0;
        for (int i  = 0; i < numberSet.length; i++) {
            if (numberSet[i] % 2 == 0) {
                count ++;
            } 
        }
            return count; 
    }

    /**
     * Print how many odds in the number set
     * @param numberSet
     * @return odds count
     */
    private static int odds(int[] numberSet) {
        int count = 0;
        for (int i = 0; i < numberSet.length; i++) {
            if (numberSet[i] % 2 == 1) {
                count ++;
            }
        }
            return count; 
    }

    /**
     * Calculate the sum of the random number and print average
     * @param numberSet
     * @return average
     */
    private static double average(int[] numberSet) {

        int sum = 0;
        for (int i = 0; i < numberSet.length; i++) {
            sum += numberSet[i];
        }
            return (double) sum / numberSet.length; 
    }

    /**
     * Print the middle number of the random number set
     * @param numberSet
     * @return median
     */
    private static double median(int[] numberSet) {
        int n = numberSet.length;
        if (n % 2 ==1) {
            return numberSet[n/2];
        } else {
            return (numberSet[n / 2 - 1] + numberSet[n / 2]) / 2.0;
        }
        
    }
}
