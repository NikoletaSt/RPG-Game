public class Rogue extends Character {
    private int agility;
    private int dexterity;

    public Rogue (String name, int health, int mana, int level, int agility, int dexterity) {
        super (name, health, mana, level);
        this.agility = agility;
        this.dexterity = dexterity;
    }

    public int getAgility (){
        return agility;
    }

    public int getDexterity(){
        return dexterity;
    }

    public void setAgility(int agility){
        this.agility = agility;
    }

    public void setDexterity (int dexterity){
        this.dexterity = dexterity;
    }

    public void ambush (Character opponent){ //highly damages the opponent
        System.out.println(this.getName() + " ambushes " + opponent.getName());
        opponent.setHealth(opponent.getHealth() - 10);
        this.setLevel(this.getLevel() + 1);
        this.setAgility(this.getAgility() + 20);
        System.out.println(opponent.getName() + " has health " + opponent.getHealth());
        System.out.println(this.getName() + " has agility rate of: " + this.getAgility() + " and upgrades on level " + this.getLevel());
    }

    public void distract (Character opponent){ //throws something at the opponent and vanishes
        System.out.println(this.getName() + " distracts the opponent and vanishes away");
        this.setDexterity(this.getDexterity() + 10);
        this.setAgility (this.getAgility() + 5);
        opponent.setHealth(opponent.getHealth() - 15);
        this.setLevel(this.getLevel() +1);
        System.out.println(this.getName() + " has dexterity: " + this.getDexterity() + ", agility: " + this.getAgility() + " and upgrades to level: " + this.getLevel());
        System.out.println(opponent.getName() + " has health: " + opponent.getHealth());
    }

    public void backstab (Character opponent) { //powerful attack
        System.out.println(this.getName() + " backstabs the opponent " + opponent.getName());
        this.setHealth(this.getHealth() + 10);
        opponent.setHealth(opponent.getHealth() - 20);
        this.setAgility(this.getAgility() + 10);
        this.setDexterity(this.getDexterity() + 15);
        System.out.println(this.getName() + " has health: " + this.getHealth() + ", agility: " + this.getAgility() + " and dexterity: " + this.getDexterity());
        System.out.println(opponent.getName() + " has health: " + opponent.getHealth());
    }
    }
