/**
 *MAIN CLASS-UseCase12PalindromeCheckerApp
 * UC12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 This class demonstrates how different palindrome
 validation algorithms can be selected dynamically
 at runtine using the Strategy Design Pattern.

 @version 12.0
 @author Developer
 **/
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;


interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}


class PalindromeChecker {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        if (choice == 1) {
            checker.setStrategy(new StackStrategy());
        }
        else if (choice == 2) {
            checker.setStrategy(new DequeStrategy());
        }
        else {
            System.out.println("Invalid choice");
            return;
        }

        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
