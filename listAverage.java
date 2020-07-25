package com.lambda;

import java.util.*; 
import java.util.stream.IntStream;

public class listAverage {
    public static void main(String[] args) 
    { 
        IntStream input = IntStream.of(20, 30, 40, 50, 60, 70, 80,10);  
        OptionalDouble Avg = input.average(); 
        if (Avg.isPresent()) { 
            System.out.println(Avg.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    }
}