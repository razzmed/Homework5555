package com.company;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private int bossDefense;

    public void setBossHealth(int bossHealth){
        this.bossHealth = bossHealth;
    }
    public int getBossHealth(){
        return bossHealth;
    }
    public void setBossDamage(int bossDamage){
        this.bossDamage = bossDamage;
    }
    public int getBossDamage(){
        return bossDamage;
    }
    public void setBossDefense(int bossDefense){
        this.bossDefense = bossDefense;
    }
    public int getBossDefense(){
        return bossDefense;
    }
    public void bossChangeDefense() {
        System.out.println(bossDefense + 30);
    }
}
