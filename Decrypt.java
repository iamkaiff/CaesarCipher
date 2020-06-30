// importing the util package
import java.util.*;
// defining a class with public access modifier
public class Decrypt {
      // defining a class with public access modifier
        public static void main(String args[]) {
        /* creating scanner class to take
	   input from user by using util package
	   and we take predefined object "System.in" */ 
	Scanner sc = new Scanner(System.in);
        System.out.println(" Input the ciphertext message(Do not enter Numbers) : ");
        String ciphertext = sc.nextLine();
        System.out.println(" Enter the shift value : ");
        int shift = sc.nextInt();
	if(shift>25){
	System.out.println("Invalid shift Input");
		return;
	}
        String decryptMessage = "";
        for(int i=0; i < ciphertext.length();i++)  

        {
            // Shift one character at a time
            char alphabet = ciphertext.charAt(i);
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alphabet
                alphabet = (char) (alphabet - shift);
            
                // shift alphabet lesser than 'a'
                if(alphabet < 'a') {
                    //reshift to starting position 
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }    
                // if alphabet lies between A and Z
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
             // shift alphabet
                alphabet = (char) (alphabet - shift);
                
                //shift alphabet lesser than 'A'
                if (alphabet < 'A') {
                    // reshift to starting position 
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;            
            }
            else 
            {
             decryptMessage = decryptMessage + alphabet;            
            } 
        }
        System.out.println(" decrypt message : " + decryptMessage);
    }
}
