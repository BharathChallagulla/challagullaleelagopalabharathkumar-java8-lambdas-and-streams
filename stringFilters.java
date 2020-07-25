package com.lambda;

import java.util.stream.Stream; 

public class stringFilters {
    public static void main(String[] args) 
    { 
        Stream<String> strings = Stream.of("ane", "and", "two", "are","all","numbers"); 
        strings.filter(s -> s.startsWith("a") && s.length()==3)
        .forEach(System.out::println); 
    }
}