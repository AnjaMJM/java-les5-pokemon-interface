import java.util.List;

public abstract class Pokemon {
    String name;
    Integer level;
    Integer hp;
    String food;
    String sound;
    String type;
    List<Pokemon> pokemons;


    Pokemon(String name, Integer level, Integer hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public abstract String getType();

    public void setHp(Integer hp) {
        this.hp=hp;
    }
}
