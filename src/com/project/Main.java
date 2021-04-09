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

        Set<Integer> positiveNum = Arrays.stream(A).filter(i -> i > 0).boxed().collect(Collectors.toSet());

        return IntStream.rangeClosed(1, A.length + 1).filter(i -> !positiveNum.contains(i)).findFirst().orElse(1);

    }
}
