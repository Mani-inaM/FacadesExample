package com.company.HeroClasses;

public class Hero {
    private String name;
    private int health;
    private int level;
    public Hero(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }
    public void attack() {
        System.out.println("The hero attacks with a generic placeholder attack");
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
