/**
 * UC13: Performance Comparison
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * The application:
 * - Uses different palindrome algorithms
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madamimadam";   // sample input

        // Algorithm 1: Reverse String Method
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeReverse(text);
        long end1 = System.nanoTime();
        long duration1 = end1 - start1;

        // Algorithm 2: Two Pointer Method
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(text);
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;

        // Display results
        System.out.println("Input String: " + text);
        System.out.println();

        System.out.println("Algorithm 1: Reverse String");
        System.out.println("Is Palindrome: " + result1);
        System.out.println("Execution Time: " + duration1 + " ns");

        System.out.println();

        System.out.println("Algorithm 2: Two Pointer");
        System.out.println("Is Palindrome: " + result2);
        System.out.println("Execution Time: " + duration2 + " ns");
    }


    // Algorithm 1: Reverse String Method
    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }


    // Algorithm 2: Two Pointer Method
    public static boolean isPalindromeTwoPointer(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
