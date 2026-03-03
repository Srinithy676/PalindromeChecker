/**Use Case 2: Hardcoded Palindrome Validation
Description:
This class demonstrates basic palindrome validation
        using a hardcoded string value..
At this stoge, the application:
Stores a predefined string
Compares characters from both ends.
Determines whether the string is a palindrome
Displays the result on the console
This use case introduces fundamental comparison logic
before using advanced data structures.
@author Developer
@version 2.0**/
import java.util.Scanner;
public class UseCase2PalindromeCheckerApp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Text: ");
        String str=sc.nextLine();
        int n=str.length();
        boolean isPalindrome=true;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome) System.out.println("is it a palindrome?: true");
        else System.out.println("Is it a Palindrome?: False");
        sc.close();
    }
}

