public class Main {
    public static void main(String[] args) {
        RPGCharacter character = new RPGCharacter(1);
        System.out.println("Character level: " + character.getLevel());
        System.out.println("Character max HP: " + character.getMaxHP());
        System.out.println("Character mana: " + character.getMana());
        System.out.println("Character run speed: " + character.getRunSpeed());

        Equipments equipments = new Equipments();
        equipments.EquippedSword(character);
        character.setEquip(equipments);
        System.out.println("Character has sword equipped: " + character.getEquip().isEquippedSword());

        equipments.EquippedShield(character);
        character.setEquip(equipments);
        System.out.println("Character has shield equipped: " + character.getEquip().isEquippedShield());

        RPGCharacter enemy = new RPGCharacter(2);
        System.out.println("Enemy level: " + enemy.getLevel());
        System.out.println("Enemy max HP: " + enemy.getMaxHP());
        System.out.println("Enemy run speed: " + enemy.getRunSpeed());

        character.useSword(enemy);
        System.out.println("Enemy max HP after attack: " + enemy.getMaxHP());
        character.levelup();
        System.out.println("Character level: " + character.getLevel());


    }
}