import java.util.List;

public class PokemonTrainer {
    String  name;
    List<Pokemon> pokemons;

    PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;

        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    private void setName(String name) {
        this.name=name;
    }


}
