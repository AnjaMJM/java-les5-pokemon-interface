import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
     ElectricPokemon(String name, Integer hp, Integer xp, String food, String sound){
         super(name, hp, xp, food, sound);
     }
    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with thunder");
        switch (enemy.getType()) {
            case "water" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
                name.setHp(name.getHp() + 15);
                System.out.println(name.name + " gains hp-boost and raises to " + name.getHp() + " hp");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
                name.setHp(name.getHp() + 15);
                System.out.println(name.name + " gains hp-boost and raises to " + name.getHp() + " hp");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
                name.setHp(name.getHp() + 15);
                System.out.println(name.name + " gains hp-boost and raises to " + name.getHp() + " hp");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
                name.setHp(name.getHp() + 15);
                System.out.println(name.name + " gains hp-boost and raises to " + name.getHp() + " hp");
            }
        }
    }
    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with electroball");
        switch (enemy.getType()) {
            case "water" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }
    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with thunderpunch");
        switch (enemy.getType()) {
            case "water" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }
    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with voltTackle");
        switch (enemy.getType()) {
            case "water" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.name + " loses 15 hp and has " + enemy.getHp() + "left");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
        ;
    }
    List<String> attacks = Arrays.asList("thunder", "electroball", "thunderpunch", "volttackle");

    List<String> getAttacks() {
        return attacks;
    }


    @Override
    public String getType() {
        return "electric";
    }
}
