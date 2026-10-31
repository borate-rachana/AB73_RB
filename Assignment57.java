/*WAP on String function:
length()
toUppercase()
toLowerCase                                
SubString(Start index)                                
SubString(start index,end index)                                                              
replace()                                
replaceAll()    
trim()
charAt()    
concat()
split()
*/
package javaclassassignments;

public class Assignment57
{

	public static void main(String[] args)
	{
		String str = "  Hello Java Programming  ";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. substring(start index)
        System.out.println("Substring: " + str.substring(8));

        // 5. substring(start index, end index)
        System.out.println("Substring: " + str.substring(8, 12));

        // 6. replace()
        System.out.println("Replace: " + str.replace("Java", "Python"));

        // 7. replaceAll()
        System.out.println("ReplaceAll: " + str.replaceAll("a", "@"));

        // 8. trim()
        System.out.println("Trim: '" + str.trim() + "'");

        // 9. charAt()
        System.out.println("Character: " + str.charAt(7));

        // 10. concat()
        System.out.println("Concat: " + str.concat(" Language"));

        // 11. split()
        String[] words = str.trim().split(" ");
        System.out.println("Split words:");
        for (String word : words)
        {
            System.out.println(word);
        }
    }

}
