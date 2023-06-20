
package HomeWork04.warriors;

import HomeWork04.armors.Armor;
import HomeWork04.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Armor>{
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }

    public Archer(String name, int healthPoint, Ranged weapon, Armor armor) {
        super(name, healthPoint, weapon, armor);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}