package com.lambda;

import java.util.*;

public class isPalindrome {
    static boolean Palindrome(String str) 
    { 
        int i = 0, n = str.length()-1,j=n/2; 
        while (i < j)
        { 
            if (str.charAt(i) != str.charAt(n-i)) 
                return false;
            i++; 
            j--; 
        } 
        return true; 
    }
    public static void main(String args[]){
        int i;
        List<String> listofstrings=new ArrayList<String>();  
        listofstrings.add("bharath");
        listofstrings.add("car");
        listofstrings.add("room");
        listofstrings.add("ababa");
        listofstrings.add("xyzyx");
        for(i=0;i<5;i++)
        { 
        String str=listofstrings.get(i);
        if (Palindrome(str)) 
            System.out.println(str); 
        }
    }
    
}