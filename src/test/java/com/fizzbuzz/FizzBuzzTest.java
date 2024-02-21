package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void test_fizzbuzzReplaceNumber_CanReturnFizz() {
        // Given
        int numb = 3;
        FizzBuzz fizzbuzz = new FizzBuzz();
        // when
        String word = fizzbuzz.replaceNumber(numb);
        // Then
        assertEquals("Fizz", word);
    }

    @Test
    public void test_fizzbuzzReplaceNumber_CanReturnBuzz() {
        // Given
        int numb = 5;
        FizzBuzz fizzbuzz = new FizzBuzz();
        // when
        String word = fizzbuzz.replaceNumber(numb);
        // Then
        assertEquals("Buzz", word);
    }
    
    @Test
    public void test_fizzbuzzReplaceNumber_CanReturnFizzBuzz() {
        // Given
        int numb = 15;
        FizzBuzz fizzbuzz = new FizzBuzz();
        // when
        String word = fizzbuzz.replaceNumber(numb);
        // Then
        assertEquals("FizzBuzz", word);
    }

    @Test
    public void test_fizzbuzzReplaceNumber_CanReturnFizzcontainsNumber3() {
        // Given
        int numb = 253;
        FizzBuzz fizzbuzz = new FizzBuzz();
        // when
        String word = fizzbuzz.replaceNumber(numb);
        // Then
        assertEquals("Fizz", word);
    }

    @Test
    public void test_fizzbuzzReplaceNumber_CanReturnBuzzcontainsNumber5() {
        // Given
        int numb = 154;
        FizzBuzz fizzbuzz = new FizzBuzz();
        // when
        String word = fizzbuzz.replaceNumber(numb);
        // Then
        assertEquals("Buzz", word);
    }

}

