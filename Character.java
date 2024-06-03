public class Character {
        private String name;
        private int health;
        private int mana;
        private int level;

        public Character (String name,int health, int mana, int level){
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.level = level;
        }

        public String getName(){
            return name;
        }

        public int getHealth(){
            return health;
        }

        public int getMana(){
            return mana;
        }

        public int getLevel(){
            return level;
        }

        public void setMana(int mana){
        this.mana = mana;
        }

        public void setHealth (int health){
            this.health = health;
        }

        public void setLevel (int level) {this.level = level;}


        public void attack (Character opponent){
            System.out.println (this.name + " attacks " + opponent.getName());
            opponent.setHealth(opponent.getHealth()-5);
            System.out.println (opponent.getName() + " has a health rate of: " + opponent.getHealth());
        }

        public void defend () {
            System.out.println (this.name + " defends");
            this.health +=10;
            System.out.println(this.name + " has a health rate of: " + this.health);
        }

        public void castSpell (Character opponent){
            if (mana>70){
                mana-=10;
                System.out.println (this.name + " casts a spell " + "Babtio congoles " + " on " + opponent.getName());
                System.out.println (this.name + " has a mana rate of: " + this.mana);
            }

            else if (mana>50){
                mana-=7;
                System.out.println (this.name + " casts a spell " + "Gorgola paroles! " + " on " + opponent.getName());
                System.out.println (this.name + " has a mana rate of: " + this.mana);
            }

            else if (mana>20) {
                mana-=3;
                System.out.println (this.name + " casts a spell " + "Terento mori!" + " on " + opponent.getName());
                System.out.println (this.name + " has a mana rate of: " + this.mana);
            }
            else {
                mana-=1;
                System.out.println (this.name + " casts a spell " + "Singales!" + " on " + opponent.getName());
                System.out.println (this.name + " has a mana rate of: " + this.mana);
            }
        }

        public void levelUp (){
            this.level++;
            this.health+=10;
            this.mana +=8;
            System.out.println(this.name + " levels up to level " + this.level);
            System.out.println (this.name + " has a health rate: " + this.health + ", mana rate" + this.mana + ", and is on level: " + this.level);
        }}
