import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    GrassPokemon(String name, Integer hp, Integer xp, String food, String sound) {
        super(name, hp, xp, food, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.name + " attacks " + enemy.name + " with leafstorm");

        switch (enemy.getType()) {
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 15 hp and has " + enemy.getHp() + "left");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with solarbeam");
        switch (enemy.getType()) {
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with leechseed");
        switch (enemy.getType()) {
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
                name.setHp(name.getHp() + 20);
                System.out.println(name.name + " gains hp and raises to " + name.getHp() + " hp");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.name + " loses 15 hp and has " + enemy.getHp() + "left");
                name.setHp(name.getHp() + 15);
                System.out.println(name.name + " gains hp and raises to " + name.getHp() + " hp");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
                name.setHp(name.getHp() + 10);
                System.out.println(name.name + " gains hp and raises to " + name.getHp() + " hp");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
                name.setHp(name.getHp() + 5);
                System.out.println(name.name + " gains hp and raises to " + name.getHp() + " hp");
            }
        }
    }

    public void leafBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with leafblade");
        switch (enemy.getType()) {
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
            }
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 15);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }

    List<String> attacks = Arrays.asList("leafStorm", "solarbeam", "leechseed", "leafblade");

    List<String> getAttacks() {
        return attacks;
    }


    @Override
    public String getType() {
        return "grass";
    }


}
