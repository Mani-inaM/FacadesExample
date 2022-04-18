package com.company.HeroClasses;

import com.company.HeroClasses.Hero;

public class Rouge extends Hero {
    public Rouge(String name, int health, int level) {
        super(name, health, level);
    }
    @Override
    public void attack() {
        System.out.println(this.getName()+" attacks the enemy with a sneak attack dealing critical damage on the weak spot!");
    }
}
