import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
     FirePokemon(String name, Integer hp, Integer xp, String food, String sound){
         super(name, hp, xp, food, sound);
     }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with inferno");
        switch (enemy.getType()) {
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
                case "fire" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }
    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with pyroball");
        switch (enemy.getType()) {
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }
    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with flamethrower");
        switch (enemy.getType()) {
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }
    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with firelash");
        switch (enemy.getType()) {
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 25);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }

    List<String> attacks = Arrays.asList("inferno", "pyroball", "flamethrower", "firelash");

    List<String> getAttacks() {
        return attacks;
    }

    @Override
     public String getType() {
         return "fire";
     }
}
