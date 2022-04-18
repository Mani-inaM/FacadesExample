package com.company;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        HeroFacade hero = new HeroFacade();
        for (int i = 0; i < 5; i++) {
            hero.ClericAttack();
            hero.RougeAttack();
            hero.MageAttack();
            hero.WarriorAttack();
        }
        System.out.println("The enemy is dead!");
    }
}

