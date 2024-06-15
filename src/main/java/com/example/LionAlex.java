package com.example;

import java.util.List;

public class LionAlex extends Lion{
    Feline feline;
    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }
    @Override
    public int getKittens(){
        return 0;
    }
    public List<String> getFriends(){
        return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    }
    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }
}
