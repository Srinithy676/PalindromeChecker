/**Use Case 5: Stack-Based Palindrome Checker
 @author Developer
@version 2.0**/
import java.util.Scanner;
import java.util.Stack;
public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" input: ");
        String input=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
        }
        String reversed="";
        while(!stack.isEmpty()){
            reversed+=stack.pop();
        }
        System.out.println("Reversed through stack: "+reversed);
        if(input.equals(reversed)) System.out.println("is it palindrome? true");
        else System.out.println("It is not Palindrome");
        sc.close();
    }

}

