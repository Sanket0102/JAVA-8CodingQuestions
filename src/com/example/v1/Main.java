package com.example.v1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Find the sum of all elements in a list using stream
        List<Integer> nums = Arrays.asList(1,2,3,1,4,5,3,4,5);
        int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        // 2.Given a List of integer, write a program to find the maximum elements using stream
        int max = nums.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(max);

        //3. Given a list of strings , write a program to count the number of strings that starts with a specific characters
        List<String> fruits = Arrays.asList("cherry","banana","coconut","berry","cantaloupe");
        long character = fruits.stream()
                .filter(c->c.startsWith("c"))
                .count();
        System.out.println(character);

        //4. Convert a list of string to uppercase
        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //5. Given a List of Integer, write a program to filter out the even numbers using stream
        long count = nums.stream()
                .filter(num -> num%2==0)
                .count();
        System.out.println(count);

        //6. Given a List of Integer, write a program to filter out the even numbers using streams
        List<Double> nums2 = Arrays.asList(45.89,23.34,37.63,78.12,32.78);
        double avg = nums2.stream()
                .mapToDouble(Double::doubleValue)
                .average().getAsDouble();
        System.out.println(avg);

        //7 Given a list of Strings, write a program to concatenate all the string using streams
        String allfruits = fruits.stream()
                .collect(Collectors.joining(" "));
        System.out.println(allfruits);

        //8 Write a program to remove duplicate elements from a list using stream
        nums.stream()
            .distinct()
            .forEach(System.out::println);

        //9 Given a list of objects write a program to sort the objects based on a specific attribute using streams
        List<Person> people = Arrays.asList(
                new Person("Alice",21),
                new Person("Anna",29),
                new Person("Bob",30),
                new Person("Barbie",56),
                new Person("Charlie",20)
        );
        people.stream()
            .sorted(
                    Comparator.comparing(Person::getName).
                        thenComparing(Person::getAge)
                )
            .forEach(System.out::println);

        //10. Write a program to check if all the elements in a list satisfy the given condition using stream

        List<Integer> numbers = Arrays.asList(2,4,6,8,10);
        boolean isValid = numbers.stream()
                .allMatch(item -> item % 2 == 0);
        System.out.println(isValid);

    }
}