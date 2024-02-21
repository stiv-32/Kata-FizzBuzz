package com.fizzbuzz;

public class FizzBuzz {

  public String replaceNumber(int n) {

    boolean isDivisibleBy3 = n % 3 == 0;
    boolean isDivisibleBy5 = n % 5 == 0;
    

    if (isDivisibleBy3 && isDivisibleBy5) return "FizzBuzz";
    if (isDivisibleBy3 || containsNumber(n, 3)) return "Fizz";
    if (isDivisibleBy5 || containsNumber(n, 5)) return "Buzz";

    return null;
}

  private boolean containsNumber(int n, int i) {
    return String.valueOf(n).contains(String.valueOf(i));
  }
}