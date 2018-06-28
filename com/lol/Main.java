package com.lol;

public class Main {

    public static void main(String[] args) {
        Hero rumy = new Caitlyn("Rumi");
        System.out.println(rumy.getPlyerID() + " " + rumy.name + " health " + rumy.health + " abiityPower " + rumy.abilityPower);
        System.out.println("attack damage:" + rumy.attackDamage + " mana:" + rumy.mana + " health:" + rumy.health);
        Hero alex = new Lucian("Alex");
        System.out.println(alex.name + " health " + alex.health + " abiityPower " + alex.abilityPower);
        System.out.println("attack damage:" + alex.attackDamage + " mana:" + alex.mana + " health:" + alex.health);

    }
}
