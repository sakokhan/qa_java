package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;
    @Test
    public void getFamily() {
        Assert.assertEquals("Ожидалося результат \"Кошачьи\", но результат отличается", "Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittens() {
        Feline feline = new Feline();
        Assert.assertEquals("Неправильное количество котят", 1, feline.getKittens());
    }
    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void eatMeat()throws Exception{
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        Assert.assertEquals("Рацион не соответствует виду животного", expected, actual);
    }
}