// B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

import java.util.*;
import java.lang.*;
import java.io.*;


class Solution {
   
    
    public int romanToInt(String s) 
            {
    //create a Hashmap
         Map<Character,Integer> map=new HashMap();
         //add values into hashmap
         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500); 
         map.put('M',1000);
         
          int n=s.length();
          int result=0;
    
             for(int i=0;i<n;i++)
             {
                if( i<n-1   && map.get(s.charAt(i)) < map.get(s.charAt(i+1)) )
                {
                   result+=map.get(s.charAt(i+1)) -map.get(s.charAt(i))  ;
                   i++;
                }
                
                else
                {
                  result+= map.get(s.charAt(i)) ;
                }
             }
    
    
                  return result;
            }
    
    
    
    
    
    }
