package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
public class LionAlexTest {
    Feline feline;
    @Test
    public void getKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals(0, lionAlex.getKittens());
    }
    @Test
    public void getFriends() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expected = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        Assert.assertEquals(expected, lionAlex.getFriends());
    }
    @Test
    public void getPlaceOfLiving() throws Exception{
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
    @Test
    public void doesHaveMane()throws Exception{
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertTrue(lionAlex.doesHaveMane());
    }
}