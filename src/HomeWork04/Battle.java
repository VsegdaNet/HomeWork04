package HomeWork04;

import HomeWork04.warriors.Warrior;

public class Battle {
    private final Warrior w1;
    private final Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight() {
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0) {
            String name1 = w1.getName();
            String name2 = w2.getName();
            int damage1 = w1.hit();
            System.out.printf("%s hit %s : %d ---> ", name1, name2, damage1);
            w2.reduceHealth(damage1);
            System.out.printf("%s health - %d\n", name2, w2.getHealthPoint());
            int damage2 = w2.hit();
            if (isDead(w2)) {
                continue;
            }
            System.out.printf("%s hit %s : %d ---> ", name2, name1, damage2);
            w1.reduceHealth(damage2);
            System.out.printf("%s health - %d\n", name1, w1.getHealthPoint());
        }
    }

    private boolean isDead(Warrior w) {
        return w.getHealthPoint() <= 0;
    }
}
