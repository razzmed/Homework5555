package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.heroHealth = 300;
        hero.heroDamage = 50;
        hero.superHeroDamage = hero.heroDamage + 100;
        System.out.println(hero.heroHealth + " " + hero.heroDamage + " " + hero.superHeroDamage);
        Boss boss = new Boss();
        boss.setBossHealth(500);
        boss.setBossDamage(100);
        boss.setBossDefense(40);
        System.out.println(boss.getBossHealth());
        System.out.println(boss.getBossDamage());
        System.out.println(boss.getBossDefense());
        boss.bossChangeDefense();
    }
}
