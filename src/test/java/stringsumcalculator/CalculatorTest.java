package stringsumcalculator;

import org.junit.jupiter.api.Test;
import stringsumcalculator.model.Calculator;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @DisplayName("쉼표로 합계를 잘 구하는가")
    public void calculateSumWithComma(){
        String string = "1,3,5";

        assertEquals(Calculator.calculate(string),9);
    }

    @Test
    @DisplayName("쉼표와 콜론으로 합계를 잘 구하는가")
    public void calculateSumWithCommaAndColon(){
        String string = "1,3:5";

        assertEquals(Calculator.calculate(string),9);
    }

    @Test
    @DisplayName("입력 값에 0을 넣어도 연산이 되는가")
    public void calculateByZero(){
        assertEquals(Calculator.calculate("0"),0);
    }

    @Test
    @DisplayName("입력 값이 공백이어도 연산이 되는가")
    public void calculateByBlank(){
        assertEquals(Calculator.calculate(""),0);
    }

    @Test
    @DisplayName("입력 값이 null이어도 연산이 되는가")
    public void calculateByNull(){
        assertEquals(Calculator.calculate(null),0);
    }

}
