package com.company.HeroClasses;

import com.company.HeroClasses.Hero;

public class Mage extends Hero {
    public Mage(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack() {
        System.out.println(this.getName()+" casts a powerful spell hitting the enemy for a heavy amount of damage!");
    }
}
