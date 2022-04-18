package com.company;

import com.company.HeroClasses.Cleric;
import com.company.HeroClasses.Mage;
import com.company.HeroClasses.Rouge;
import com.company.HeroClasses.Warrior;

public class HeroFacade {
    private Cleric cleric;
    private Rouge rouge;
    private Warrior warrior;
    private Mage mage;

    public HeroFacade() {
        cleric = new Cleric("Peter",26,1);
        rouge = new Rouge("Thomas",22,1);
        warrior = new Warrior("Jeppe",30,1);
        mage = new Mage("Trine",18,1);
    }

    public void ClericAttack() throws InterruptedException {
        cleric.attack();
        Thread.sleep(500);
    }
    public void RougeAttack() throws InterruptedException {
        rouge.attack();
        Thread.sleep(500);
    }
    public void WarriorAttack() throws InterruptedException {
        warrior.attack();
        Thread.sleep(500);
    }
    public void MageAttack() throws InterruptedException {
        mage.attack();
        Thread.sleep(500);
    }
}
