/**Use Case 4: Character Array Based Palindrome Check
 @author Developer
@version 2.0**/
import java.util.Scanner;
public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input: ");
        String input=sc.nextLine();
        char[] arr=new char[input.length()];
        for(int i=0;i<input.length();i++){
            arr[i]=input.charAt(i);
        }
        int start=0;
        int end=arr.length-1;
        boolean isPalindrome=true;
        while(start<end){
            if(arr[start]!=arr[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome) System.out.println("It is palindrome");
        else System.out.println("It is not Palindrome");
        sc.close();
    }

}

