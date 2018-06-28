package com.lol;

class Lucian extends Hero {

    private final int START_LUCIAN_HEALTH = 80;
    private final int START_LUCIAN_MANA = 70;
    private final int START_LUCIAN_DAMAGE = 7;
    private final int START_LUCIAN_POWER = 10;

    Lucian(String playerID) {
        Hero.playerID = playerID;
        Hero.name = "Lucian";
        Hero.health = START_LUCIAN_HEALTH;
        Hero.mana = START_LUCIAN_MANA;
        Hero.attackDamage = START_LUCIAN_DAMAGE;
        Hero.abilityPower = START_LUCIAN_POWER;
        Hero.gold = 0;
        Hero.normalDefence = 0;
        Hero.magicDefence = 0;

    }

}
