/**Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 @author Developer
 @version 2.0**/

import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(normalized);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
