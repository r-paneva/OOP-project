package com.lol;

import java.util.ArrayList;
import java.util.List;

public class Hero {

    static String playerID;
    static String name;
    static int health, mana, gold, attackDamage, abilityPower, normalDefence, magicDefence;
    private static final int MAX_PLAYER_ID = 100;
    private static final int MIN_PLAYER_ID = 3;

    String getPlyerID() {
        return playerID;
    }

    public void setPlyerID(String plyerID) {
        if (playerID.length() < MIN_PLAYER_ID || playerID.length() > MAX_PLAYER_ID) {
            return;
        }
        this.playerID = playerID;
    }

}
