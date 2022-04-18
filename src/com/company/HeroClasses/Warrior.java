package com.company.HeroClasses;

import com.company.HeroClasses.Hero;

public class Warrior extends Hero {
    public Warrior(String name, int health, int level) {
        super(name, health, level);
    }
    @Override
    public void attack() {
        System.out.println(this.getName()+" strikes the enemy with their heavy battle axe!");
    }
}
