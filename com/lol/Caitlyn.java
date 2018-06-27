package com.lol;

import java.util.ArrayList;
import java.util.Collections;

import static com.lol.Defense.MAGIC;

class Caitlyn extends Hero {

    private final int START_CAITLYN_HEALTH = 100;
    private final int START_CAITLYN_MANA = 50;
    private final int START_CAITLYN_GOLD = 0;
    private final int START_CAITLYN_DAMAGE = 10;
    private final int START_CAITLYN_POWER = 5;
    private ArrayList<Defense> listOfDefenses = new ArrayList<Defense>(Collections.singleton(MAGIC));

    Caitlyn() {
        Hero.name= "Caitlyn";
        Hero.health = START_CAITLYN_HEALTH;
        Hero.mana = START_CAITLYN_MANA;
        Hero.gold = START_CAITLYN_GOLD;
        Hero.attackDamage=START_CAITLYN_DAMAGE;
        Hero.abilityPower = START_CAITLYN_POWER;
        setListOfDefenses(getListOfDefenses());
    }

    private ArrayList<Defense> getListOfDefenses() {
        return listOfDefenses;
    }

    private void setListOfDefenses(ArrayList<Defense> listOfDefenses) {
        this.listOfDefenses = listOfDefenses;
    }
}
