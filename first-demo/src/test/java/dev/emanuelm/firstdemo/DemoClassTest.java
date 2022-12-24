package dev.emanuelm.firstdemo;

import dev.emanuelm.fistdemo.DemoClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoClassTest {


    @Test
    void testEqualsAndNotEquals(){
        DemoClass demoClass = new DemoClass();
        int expected = 6;
        int actual = demoClass.add(2,4);
        Assertions.assertEquals(expected, actual, "2+4 must be 6");
    }
}
