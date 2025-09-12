package com.java.ci.test;

import com.java.ci.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MathUtilsTest {

    @Test
    public void givenTwoIntegers_whenUseSumMethod_shouldReturnSum() {
        var n1 = 10;
        var n2 = 30;

        var result = MathUtils.sum(n1, n2);
        Assertions.assertEquals(40, result);
    }

}
