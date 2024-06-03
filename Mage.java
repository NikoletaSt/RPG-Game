public class Mage extends Character {
    private int intelligence;
    private int spellPower;

    public Mage(String name, int health, int mana, int level, int intelligence, int spellPower) {
        super(name, health, mana, level);
        this.intelligence = intelligence;
        this.spellPower = spellPower;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setIntelligence (int intelligence){
        this.intelligence = intelligence;
    }

    public void setSpellPower (int spellPower){
        this.spellPower = spellPower;
    }



    public void lightningBolt (Character opponent){ //damages the opponent with a lightning
        System.out.println (this.getName() + " casts a lightning bolt on " + opponent.getName());
        this.setMana (this.getMana() - 15);
        opponent.setHealth (opponent.getHealth() - this.getSpellPower() + 10);
        this.setIntelligence (this.getIntelligence() + 3);
        this.setLevel(this.getLevel() + 1);
        System.out.println (this.getName() + " has mana: " + this.getMana() + " and intelligence: " + this.getIntelligence());
        System.out.println (opponent.getName() + " has health of: " + opponent.getHealth());
    System.out.println (this.getName () + " upgrades to level " + this.getLevel());
    }

    public void arcaneWard (){ //increases the resilience of the mage
        System.out.println(this.getName() + " casts an arcane ward spell");
        this.setMana(this.getMana() - 5);
        this.setHealth(this.getHealth() + 10);
        this.setIntelligence(this.getIntelligence() + 10);
        System.out.println(this.getName() + " has a mana of " + this.getMana() + " and health of: " + this.getHealth() + " and intelligence of: " +  this.getIntelligence());
    }

    public void manaShield() { //absorbs damage and reduces mana
        System.out.println(this.getName() + " casts a mana shield spell");
        this.setSpellPower(this.getSpellPower() + 8);
        this.setHealth(this.getHealth() + 15);
        this.setMana(this.getMana() - 10);
        System.out.println(this.getName() + " has a mana of " + this.getMana() + " and health of: " + this.getHealth() + " and spell power of: " +  this.getSpellPower());

    }

}
