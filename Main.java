public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage ("Roger", 70, 30, 3, 50, 20);
        Warrior warrior = new Warrior ("Max", 100, 50, 1, 80, 40);
        Rogue rogue  = new Rogue ("Stasy", 65, 20, 2, 78, 20);

        warrior.attack(mage);
        warrior.defensiveStance(rogue);
        warrior.whirlwind(mage);

    }

}
