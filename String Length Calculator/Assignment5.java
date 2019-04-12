import java.util.Scanner;

 /**
    Walther Alvarez
    CISC 500
    Assignment #5
    This program computes the number of words in a string.
    It first requests the user input a string without putting a space in the beginning or end,
    then it checks to see if the user left the string blank, put a space in the front or the end,
    if the string passes all the checks then the countWords method is called to check the amount
    of words in the string and returns the quantity to the user. 
 */
 public class Assignment5
 {
    public static void main(String[] args)
    {
 
      Scanner in = new Scanner(System.in);
      System.out.print("Enter new string separated by spaces [Try to avoid putting a space at the start or end of the string]: ");
      String str = in.nextLine();
      
      if (str.length() == 0)
      {
         System.out.println("Error: No string entered");
      }
      else if (str.charAt(0) == ' ')
      {
         System.out.println("Error: Space at beginning of string");
      }
      else if (str.charAt(str.length() - 1) == ' ')
      {
         System.out.println("Error: Space at end of string");
      }
      else
      {
         int wordCount = countWords(str);
         System.out.println("Number of words are: " + wordCount); 
      }
      }
      /**
         Determines the amount of words in a string
         @param str the string inputed by the user
         @return the word count for the string
      */
      public static int countWords(String str)
      {
         int wordCount = 1;

         for (int i = 0; i < str.length(); i++) 
            {
                if (str.charAt(i) == ' ') 
                {
                    wordCount++;
                } 
                
            }
         return wordCount;

      }
}
