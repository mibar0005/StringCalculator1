package org.example;

public class StringCalculator {
    public static int calculate(String input) {
        //Store the values of the sum
        int sum = 0;
        if (input.isEmpty()) {
            return 0;
        }

        //Split the array at every comma
        String[] numbersArray = input.split(",");
        if (numbersArray.length > 2) {
            return 0;
        } else {
                for (String number : numbersArray) {
                    sum += Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
                }
            }
        return sum;
    }

}
