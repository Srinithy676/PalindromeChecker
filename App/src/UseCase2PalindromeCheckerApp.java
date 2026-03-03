/**Use Case 3: Palindrome Checking Using String Reverse
@author Developer
@version 2.0**/
import java.util.Scanner;
public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input: ");
        String original=sc.nextLine();
        String reversed="";
        for(int i=original.length()-1;i>=0;i--){
            reversed+=original.charAt(i);
        }
        System.out.println("Reversed: "+reversed);
        if(original.equals(reversed)){
            System.out.println("It is a Palindrome Number");
        }
        else{
            System.out.println("It is not a Palindrome Number");
        }
        sc.close();
    }
}

