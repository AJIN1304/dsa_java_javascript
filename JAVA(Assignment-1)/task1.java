//QUESTION  A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{

    public static void shuffle(int arr[])

    {
    //FISHER YATES ALGORITHAM is used here for shuffling
    int r,temp;
        
    // Iterates over the array from lst element to first element
    for(int i=arr.length-1;i>0;i--)
        {
            //random number generated
            r=(int) (Math.random()*(i+1));
            
            //swap random number at position r with element at position i
            temp=arr[r];
            arr[r]=arr[i];
            arr[i]=temp;
        }
    
    }

    
	public static void main (String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7};
        //before shuffle 
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
       // after shuffle
        System.out.println(Arrays.toString(arr));
	}

    
}
