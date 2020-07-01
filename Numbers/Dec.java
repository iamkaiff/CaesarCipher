// importing the package
import java.util.*;
// defining a class
class Dec{
    // now creating the main method
    public static void main(String args[])
    {
     /* creating scanner class to take
	   input from user by using util package
	   and we take predefined object "System.in" */ 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your ciphertext: ");
        String message = scan.nextLine();
        int length = message.length();
        System.out.print("Enter the Key: ");
        int key = scan.nextInt();
        String numbers = "0123456789";
        System.out.print("The plain Text is: ");
        for(int i = 0 ;i < length ;i++)
        {
            for(int j = 0; j < 26 ;j++)
            {
                if(j < numbers.length() && message.charAt(i) == numbers.charAt(j))
                {
                    System.out.print(numbers.charAt((j-key) % 10)); 
                }
    
            }
        }
        System.out.println();
    }
}