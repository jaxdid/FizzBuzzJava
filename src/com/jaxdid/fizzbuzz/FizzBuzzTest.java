package com.jaxdid.fizzbuzz;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz tester = new FizzBuzz();

    @org.junit.Test
    public void playShouldReturnFizzIfArgumentDivisibleBy3() throws Exception {
        Assert.assertEquals("6 must return fizz", "fizz", tester.play(6));
    }

    @Test
    public void playShouldReturnTheArgumentAsStringIfNotDivisible3() {
        Assert.assertEquals("2 must return 2", 2, tester.play(2));
    }

    @org.junit.Test
    public void playShouldReturnBuzzIfArgumentDivisibleBy5() {
        Assert.assertEquals("10 must return buzz", "buzz", tester.play(10));
    }

    @Test
    public void playShouldReturnFizzBuzzIfArgumentDivisibleBy3and5() {
        Assert.assertEquals("15 must return fizzbuzz", "fizzbuzz", tester.play(15));
    }
}