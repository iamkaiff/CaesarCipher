// importing the package
import java.util.*;
// defining a class with public access modifier
public class Encrypt {
    // now creating the main method
	public static void main(String args[]) {
        /* creating scanner class to take
	   input from user by using util package
	   and we take predefined object "System.in" */ 
	Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message(Do not enter numbers) : ");
        String plaintext = sc.nextLine();
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
        int shift = sc.nextInt();
	if(shift>25){
	System.out.println("Invalid shift Input");
		return;
	}
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++) 
        {
             // Shift one character at a time
            alphabet = plaintext.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet + shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + shift);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
    }
    System.out.println(" ciphertext : " + ciphertext);
  }
}
