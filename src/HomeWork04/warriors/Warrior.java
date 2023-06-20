package HomeWork04.warriors;

import HomeWork04.armors.Armor;
import HomeWork04.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, A extends Armor> {
    private final String name;
    private int healthPoint;
    private W weapon;
    private A armor;

    public Warrior(String name, int healthPoint, W weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armor = null;
    }

    public Warrior(String name, int healthPoint, W weapon, A armor) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public A getArmor() {
        return armor;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public void setArmor(A armor) {
        this.armor = armor;
    }

    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void reduceHealth(int damage) {
        int defence = 0;
        if (armor != null) {
            defence = armor.getDefence();
        }
        damage -= defence;
        if (damage < 0) {
            damage = 0;
        }
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(name).append(",");
        builder.append(" Weapon: ").append(weapon).append(",");
        if (armor != null){
            builder.append(" Armor: ").append(armor).append(",");
        }
        builder.append(" HealthPoint: ").append(healthPoint);
        return builder.toString();
    }
}