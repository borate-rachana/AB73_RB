/*"Write a Java program to take the string ""Java Selenium Testing"" and:
Convert it into a character array using toCharArray().
Split it into words using split("" "").
Print both arrays using Arrays.toString()."
*/
package javaclassassignments;

import java.util.Arrays;

public class Assignment61 {

	public static void main(String[] args)
	{
		 String str = "Java Selenium Testing";

	        // Convert string into character array
	        char[] ch = str.toCharArray();

	        // Split string into words
	        String[] words = str.split(" ");

	        // Print both arrays
	        System.out.println("Character Array: " + Arrays.toString(ch));
	        System.out.println("Word Array: " + Arrays.toString(words));

	}

}
