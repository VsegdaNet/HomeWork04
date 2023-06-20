
package HomeWork04.warriors;

import HomeWork04.armors.Armor;
import HomeWork04.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Armor> {
    public Infantryman(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    public Infantryman(String name, int healthPoint, Melee weapon, Armor armor) {
        super(name, healthPoint, weapon, armor);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}