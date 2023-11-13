// C.  Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z) 

import java.util.*;
import java.io.*;

public class Main {
    
     public  static void isPangram(String s)
      {
           for(char i='a';i<='z';i++)//check character search from a to z
			   { 
				   boolean flag=false;//not pangram assued
				   for(int j=0;j<s.length();j++)//search upto length of string
					   {
						char currentcharacter=s.charAt(j); 
						   if(currentcharacter>='A'&& currentcharacter<='Z')
						   {
							   currentcharacter=(char)(currentcharacter+32);
						   }
						   if(currentcharacter==i)
						   {
								 flag=true; 
							   break;
						   }
					   }
				   if(flag==false)
				   {
					   System.out.println("not pangram");
					   return;
				   }
			   }
		  System.out.println("pangram");
    }


    public static void main(String args[]) 
    
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        
    }

}
