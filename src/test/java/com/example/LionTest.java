package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    @Test
    public void getKittens() throws Exception{
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }
    @Test
    public void getFood() throws Exception{
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
    @Test
    public void testExpectedException()throws Exception{
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Тест", feline);
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}