package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
@RunWith(Parameterized.class)
public class LionParametrizedTest {
    Feline feline;
    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean hasMane;

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false}
        };
    }
    @Before
    public void open() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void doesHaveMane() throws Exception{
        Lion lion = new Lion(sex, feline);
        boolean expected = hasMane;
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("Параметры наличия гривы и пола не совпадают", expected, actual);
    }
}