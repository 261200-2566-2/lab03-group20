public class RPGCharacter {

        //build basic variable
        public int level;
        public int maxHP;
        private int mana;
        public double runSpeed;
        public Equipments equip;
        public RPGCharacter(){
            equip = new Equipments();
        }

        public RPGCharacter(int level){ //build default
            this.level = level;
            this.maxHP = 100+10*level;
            this.mana = 50+2*level;
            this.runSpeed = 10.0+(0.1+0.03*level);
            this.equip = new Equipments();
        }
        public void levelup(){
            if (level < 20) {
                level++;
                maxHP += 100;
                mana += 50;
                runSpeed += (0.1 + 0.03 * level) * 10;
            }else {
                System.out.println( " level is already at the max.");
            }
        }


        public void useSword(RPGCharacter enemy){
            if(equip.isEquippedSword){
                int damage = 10+level;
                enemy.equip.damage(damage,enemy);
            }
        }

        public int getLevel(){
            return level;
        }
        public int getMaxHP(){
            return maxHP;
        }

        public int getMana() {
            return mana;
        }
        public double getRunSpeed(){
            return runSpeed;
        }

    public void setEquip(Equipments equip) {
        this.equip = equip;
    }

    public Equipments getEquip() {
        return equip;
    }



}
