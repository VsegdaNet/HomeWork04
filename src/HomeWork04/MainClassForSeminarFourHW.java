package HomeWork04;

import HomeWork04.armors.Leather;
import HomeWork04.armors.Plate;
import HomeWork04.warriors.Archer;
import HomeWork04.warriors.Infantryman;
import HomeWork04.warriors.Warrior;
import HomeWork04.weapons.meleeWeapon.Axe;
import HomeWork04.weapons.meleeWeapon.Sword;
import HomeWork04.weapons.rangedWeapon.Bow;
import HomeWork04.weapons.rangedWeapon.CrossBow;

public class MainClassForSeminarFourHW {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new Leather()));
        team1.add(new Infantryman("John", 150, new Axe(), new Plate()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new Leather()));
        teamArchers.add(new Archer("Piter", 100, new Bow()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new Plate()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);

        Infantryman melee = new Infantryman("John", 50,new Axe(), new Plate());
        Archer range = new Archer("Robin", 30, new Bow(), new Leather());
        Battle battle1 = new Battle(melee, range);

        System.out.println("---fight---");
        battle1.fight();
    }
}