import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    WaterPokemon(String name, Integer hp, Integer xp, String food, String sound) {
        super(name, hp, xp, food, sound);
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with surf");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.name + " loses 30 hp and has " + enemy.getHp() + "left");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 20);
                System.out.println(enemy.name + " loses 20 hp and has " + enemy.getHp() + "left");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.name + " attacks " + enemy.name + " with hydropump");
        switch (enemy.getType()) {
            case "fire" -> {
                enemy.setHp(enemy.getHp() - 40);
                System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
            }
            case "electric" -> {
                enemy.setHp(enemy.getHp() - 30);
                System.out.println(enemy.name + " loses 30 hp and has " + enemy.getHp() + "left");
            }
            case "grass" -> {
                enemy.setHp(enemy.getHp() - 10);
                System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
            }
            case "water" -> {
                enemy.setHp(enemy.getHp() - 5);
                System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
            }
        }
    }
    void hydroCanon(Pokemon name, Pokemon enemy) {
            System.out.println(name.name + " attacks " + enemy.name + " with hydrocanon");
            switch (enemy.getType()) {
                case "fire" -> {
                    enemy.setHp(enemy.getHp() - 40);
                    System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
                }
                case "electric" -> {
                    enemy.setHp(enemy.getHp() - 25);
                    System.out.println(enemy.name + " loses 25 hp and has " + enemy.getHp() + "left");
                }
                case "grass" -> {
                    enemy.setHp(enemy.getHp() - 10);
                    System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
                }
                case "water" -> {
                    enemy.setHp(enemy.getHp() - 5);
                    System.out.println(enemy.name + " loses 5 hp and has " + enemy.getHp() + "left");
                }
            }
    }

    void rainDance(Pokemon name, Pokemon enemy) {
            System.out.println(name.name + " attacks " + enemy.name + " with raindance");
            switch (enemy.getType()) {
                case "fire" -> {
                    enemy.setHp(enemy.getHp() - 40);
                    System.out.println(enemy.name + " loses 40 hp and has " + enemy.getHp() + "left");
                }
                case "electric" -> {
                    System.out.println("rainDance has no effect on " + enemy.name);
                }
                case "grass" -> {
                    enemy.setHp(enemy.getHp() + 15);
                    System.out.println(enemy.name + " gains 15 hp, thanks to rejuvenating rain and has now " + enemy.getHp() + "left");
                }
                case "water" -> {
                    enemy.setHp(enemy.getHp() - 10);
                    System.out.println(enemy.name + " loses 10 hp and has " + enemy.getHp() + "left");
                }
            }
    }

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    List<String> getAttacks() {
        return attacks;
    }


    @Override
    public String getType() {
        return "water";
    }
}
