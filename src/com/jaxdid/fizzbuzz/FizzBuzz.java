package com.jaxdid.fizzbuzz;

public class FizzBuzz {
    public static Object play(int number) {
        if (isDivisibleBy(number, 15)) {
            return "fizzbuzz";
        }
        else if (isDivisibleBy(number, 5)) {
            return "buzz";
        }
        else if (isDivisibleBy(number, 3)) {
            return "fizz";
        }

        return number;
    }

    private static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
