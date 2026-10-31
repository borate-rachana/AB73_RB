//WAP to check if the string is a palindrome?

package javaclassassignments;

public class Assignment60
{

	public static void main(String[] args) 
	{
		String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev))
        {
            System.out.println("The string is a palindrome.");
        } else
        {
            System.out.println("The string is not a palindrome.");
        }

	}

}
