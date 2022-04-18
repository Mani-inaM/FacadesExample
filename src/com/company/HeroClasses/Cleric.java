package com.company.HeroClasses;

public class Cleric extends Hero {
    public Cleric(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack() {
        System.out.println(this.getName()+" uses their holy symbol, healing all their allies!");
    }
}
