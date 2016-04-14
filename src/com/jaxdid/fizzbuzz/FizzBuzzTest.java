package com.jaxdid.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void playShouldReturnFizzIfArgumentDivisibleBy3() throws Exception {
        Assert.assertEquals("3 must return fizz", "fizz", FizzBuzz.play(3));
        Assert.assertEquals("6 must return fizz", "fizz", FizzBuzz.play(6));
        Assert.assertEquals("9 must return fizz", "fizz", FizzBuzz.play(9));
    }

    @Test
    public void playShouldReturnTheArgumentAsStringIfNotDivisible3or5() {
        Assert.assertEquals("1 must return 1", 1, FizzBuzz.play(1));
        Assert.assertEquals("2 must return 2", 2, FizzBuzz.play(2));
        Assert.assertEquals("4 must return 4", 4, FizzBuzz.play(4));
    }

    @Test
    public void playShouldReturnBuzzIfArgumentDivisibleBy5() {
        Assert.assertEquals("5 must return buzz", "buzz", FizzBuzz.play(5));
        Assert.assertEquals("10 must return buzz", "buzz", FizzBuzz.play(10));
        Assert.assertEquals("20 must return buzz", "buzz", FizzBuzz.play(20));
    }

    @Test
    public void playShouldReturnFizzBuzzIfArgumentDivisibleBy3and5() {
        Assert.assertEquals("15 must return fizzbuzz", "fizzbuzz", FizzBuzz.play(15));
        Assert.assertEquals("30 must return fizzbuzz", "fizzbuzz", FizzBuzz.play(30));
        Assert.assertEquals("45 must return fizzbuzz", "fizzbuzz", FizzBuzz.play(45));
    }
}