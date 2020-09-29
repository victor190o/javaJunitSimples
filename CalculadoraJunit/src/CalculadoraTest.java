import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumOp() {
        // arrange
        double n1 = 10;
        double n2 = 20;
        double expectedValue = 30;
        double actualValue;
        String msgError = "10 + 20 = 30";
        // act
        actualValue = Calculadora.sumOp(n1,n2);
        // assert
        assertEquals(expectedValue, actualValue, msgError);
    }

    @Test
    void subOp() {
        // arrange
        double n1 = 10;
        double n2 = 20;
        double expectedValue = -10;
        double actualValue;
        String msgError = "10 - 20 = -10";
        // act
        actualValue = Calculadora.subOp(n1,n2);
        // assert
        assertEquals(expectedValue, actualValue, msgError);
    }

    @Test
    void multOp() {
        // arrange
        double n1 = 10;
        double n2 = 20;
        double expectedValue = 200;
        double actualValue;
        String msgError = "10 * 20 = 200";
        // act
        actualValue = Calculadora.multOp(n1,n2);
        // assert
        assertEquals(expectedValue, actualValue, msgError);
    }

    @Test
    void divOp() {
        // arrange
        double n1 = 10;
        double n2 = 2;
        double expectedValue = 5;
        double actualValue;
        String msgError = "10 / 2 = 5";
        // act
        actualValue = Calculadora.divOp(n1,n2);
        // assert
        assertEquals(expectedValue, actualValue, msgError);
    }

    @Test
    void divOpOfInvalidTest() {
        //só pra mostrar dando erro
        // arrange
        double n1 = 1;
        double n2 = 2;
        double expectedValue = 5;
        double actualValue;
        String msgError = ">>>>>>>era pra dar erro mesmo";
        // act
        actualValue = Calculadora.divOp(n1,n2);
        // assert
        assertEquals(expectedValue, actualValue, msgError);
    }

    @Test
    void divOpNumeroPorZero() {
        // arrange
        double n1 = 2;
        double n2 = 0;
        double expectedValue = NaN;
        double actualValue;
        String msgError = "Não foi feito tratamento de divisão por 0";
        // act
        actualValue = Calculadora.divOp(n1,n2);
        // assert
        assertEquals(expectedValue, actualValue, msgError);
    }
}