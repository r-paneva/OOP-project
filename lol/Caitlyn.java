package lol;

class Caitlyn extends Hero {

    private final int START_CAITLYN_HEALTH = 100;
    private final int START_CAITLYN_MANA = 50;
    private final int START_CAITLYN_DAMAGE = 10;
    private final int START_CAITLYN_POWER = 5;


    public Caitlyn(String playerID) {
        Hero.playerID = playerID;
        Hero.name = "Caitlyn";
        Hero.health = START_CAITLYN_HEALTH;
        Hero.mana = START_CAITLYN_MANA;
        Hero.attackDamage = START_CAITLYN_DAMAGE;
        Hero.abilityPower = START_CAITLYN_POWER;
        Hero.gold = 0;
        Hero.normalDefense = 0;
        Hero.magicDefense = 0;
    }


}
