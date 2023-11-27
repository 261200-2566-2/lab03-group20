public class Equipments {
    public boolean isEquippedSword;
    public boolean isEquippedShield;


    public void EquippedSword(RPGCharacter character){
        isEquippedSword = true;
        character.runSpeed -= (0.1+0.04*character.level)*10;
    }
    public void  EquippedShield(RPGCharacter character){
        isEquippedShield = true;
        character.runSpeed -= (0.1+0.08*character.level)*10;
    }
    public void UnequippedSword(RPGCharacter character){
        isEquippedSword = true;
        character.runSpeed += (0.1+0.04*character.level)*10;
    }
    public void  UnequippedShield(RPGCharacter character){
        isEquippedShield = true;
        character.runSpeed += (0.1+0.08*character.level)*10;
    }
    public boolean isEquippedSword(){
        return isEquippedSword;
    }
    public boolean isEquippedShield(){
        return isEquippedShield;
    }
    public void damage(int damage, RPGCharacter target){
        if(isEquippedShield){
            damage -= damage/2;
        }
        target.maxHP -= damage;
    }





}
