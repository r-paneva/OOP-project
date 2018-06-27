package com.lol;

import java.util.ArrayList;
import java.util.Collections;
import static com.lol.Defense.MAGIC;

class Lucian extends Hero {

    private final int START_LUCIAN_HEALTH = 80;
    private final int START_LUCIAN_MANA = 70;
    private final int START_LUCIAN_GOLD = 0;
    private final int START_LUCIAN_DAMAGE = 7;
    private final int START_LUCIAN_POWER = 10;
    private ArrayList<Defense> listOfDefenses = new ArrayList<Defense>(Collections.singleton(MAGIC));

    Lucian() {
        Hero.name= "Lucian";
        Hero.health = START_LUCIAN_HEALTH;
        Hero.mana = START_LUCIAN_MANA;
        Hero.gold = START_LUCIAN_GOLD;
        Hero.attackDamage=START_LUCIAN_DAMAGE;
        Hero.abilityPower = START_LUCIAN_POWER;
        setListOfDefenses(getListOfDefenses());
    }

    private ArrayList<Defense> getListOfDefenses() {
        return listOfDefenses;
    }

    private void setListOfDefenses(ArrayList<Defense> listOfDefenses) {
        this.listOfDefenses = listOfDefenses;
    }
}
