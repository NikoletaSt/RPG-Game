public class Warrior extends Character {
    private int strength;
    private int armor;

    public Warrior(String name, int health, int mana, int level, int strength, int armor) {
        super(name, health, mana, level);
        this.strength = strength;
        this.armor = armor;
    }

    public int getStrength(){
        return strength;
    }

    public int getArmor(){
        return armor;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setArmor (int armor){
        this.armor = armor;
    }

    public void powerStrike (){

    }

    @Override
    public void attack (Character opponent){
        System.out.println (this.getName() + " attacks " + opponent.getName());
        opponent.setHealth(opponent.getHealth()-10);
        System.out.println (opponent.getName() + " has a health rate of: " + opponent.getHealth());
    }

    @Override
    public void defend () {
        System.out.println (this.getName() + " defends");
        this.setHealth (this.getHealth() + 15);
        System.out.println(this.getName () + " has a health rate of: " + this.getHealth());
    }

    public void charge (Character opponent){ //runs towards the opponent and damages them/knocks them down
        System.out.println (this.getName() + " charges and knocks down " + opponent.getName() + " with a strength " + this.strength);
        this.setStrength (this.getStrength() - 5);
        this.setHealth(this.getHealth() +10);
        this.setLevel (this.getLevel() +1);
        opponent.setHealth(opponent.getHealth() - 20);
        System.out.println (opponent.getName() + " has a health rate of: " + opponent.getHealth());
        System.out.println (this.getName() + " has a health rate of " + this.getHealth() + " and strength of " + this.getStrength());
        System.out.println (this.getName() + " upgrades to level " + this.getLevel());
    }

    public void whirlwind (Character opponent){ //the warrior spins around himself and damages the opponent
        System.out.println (this.getName() + " wirlwinds " + opponent.getName() + " with a strength " + this.strength);
        this.setStrength (this.getStrength() - 15);
        this.setArmor(this.getArmor() -5 );
        opponent.setHealth(opponent.getHealth() - 10);
        System.out.println (opponent.getName() + " has a health rate of: " + opponent.getHealth());
        System.out.println (this.getName() + " has a strength rate of " + this.getStrength() + " and an armor of " + this.getArmor());
    }

    public void defensiveStance (Character opponent){ //the warrior stands in a defensive position and reduces damage on himself but also damage on the opponent
        System.out.println (this.getName() + " is in a defend position against  " + opponent.getName() + " with a strength " + this.strength);
        this.setStrength (this.getStrength() + 25);
        this.setHealth (this.getHealth() +10);
        this.setArmor(this.getArmor() + 5 );
        opponent.setHealth(opponent.getHealth() + 10);
        System.out.println (opponent.getName() + " has a health rate of: " + opponent.getHealth());
        System.out.println (this.getName() + " has a strength rate of " + this.getStrength() + ", health rate of: " + this.getHealth() + " and an armor of " + this.getArmor());
    }

}
