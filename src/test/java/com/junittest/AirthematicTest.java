package com.junittest;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AirthematicTest {
    private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Airthematic airthematic;

    public AirthematicTest(int firstNumber,int secondNumber,int expectedResult){
        super();
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize()
    {
        airthematic = new Airthematic();
    }
    @Parameterized.Parameters
    public static Collection input()
    {
       return Arrays.asList(new Object[][] { {1, 2, 3 },{11, 22, 33 },{111,222,333} });
    }
    @Test
    public void testAirthematicTest(){
        System.out.println("sum of Numbers = : " + expectedResult);
        assertEquals(expectedResult,airthematic.sum(firstNumber,secondNumber));
    }
}
