package org.example;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class StringCalculatorTest {

    @Test
    public void whenTwoNumbersAreGiven() {
        //arrange the data (precondition or given)
        String input = "1,2";
        //act -- When
        int result = StringCalculator.calculate(input);
        //assert  -- Then (Outcome) (1 is valid String, 0 is unvalid String0
        Assert.assertEquals(3, result);
    }

    @Test
    public void whenThreeNumbersAreGiven() {
        //arrange the data (precondition or given)
        String input = "78,90,99";
        //act -- When
        int result = StringCalculator.calculate(input);
        //assert -- Then (Outcome) (1 is valid String, 0 is invalid String)
        Assert.assertEquals(0, result);
    }

    @Test
    public void whenNonNumbersAreGiven() {
        //arrange the data (precondition or given)
        String input = "1,x";
        //act -- When
        int result = StringCalculator.calculate(input);
        //assert -- Then (Outcome) (1 is valid String, 0 is invalid String)
        Assert.assertEquals(0, result);
    }


    //Requirement 2: Return 0 for an empty string
    @Test
    public void returnZeroForAnEmptyString() {
        // given
        String input = "";
        // when
        int result = StringCalculator.calculate(input);
        // then
        Assert.assertEquals( 0 , result);
    }

    //Requirement 3: Method returns the sum of the numbers
    @Test
    public void returnTheSumOfTheNumbers() {
        //given
        String input = "1,2";
        //when
        int result = StringCalculator.calculate(input);
        //then
        Assert.assertEquals(3, result);
    }


    //Requirement 4: Allow the add method to handle an unknown amout of numbers
    @Test
    public void handleUnknownAmountOfNumbers() {
        String input = "1,2,3,4,5,6,7,8,9";

        int result = StringCalculator.calculate(input);

        Assert.assertEquals(45, result);
    }

}

