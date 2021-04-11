package com.project;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] A = {-1, -3};
        int ans = getSmallestPositiveInteger(A);
        System.out.println(ans);
    }

    private static int getSmallestPositiveInteger(int[] A) {

        // Add all positive integers of the array into a HashSet.
        // Since we are concern only about the smallest positive integer not in the array
        // The HashSet removes duplicates from the array to shortened processing time
        Set<Integer> positiveNum = Arrays.stream(A).filter(i -> i > 0).boxed().collect(Collectors.toSet());

        // Iterate through positive numbers and find the number not in HashSet and return it
        return IntStream.rangeClosed(1, A.length + 1).filter(i -> !positiveNum.contains(i)).findFirst().orElse(1);

    }
}
