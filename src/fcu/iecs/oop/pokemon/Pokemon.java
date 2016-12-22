package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	private String name;
	private PokemonType type;
	private int cp;

	public Pokemon(String name, PokemonType type, int cp) {
		this.name = name;
		this.type = type;
		this.cp = cp;
	}

	public String getName() {
		return this.name;
	}

	public PokemonType getType() {
		return this.type;
	}
	
	public int getCp(){
		return cp;
	}
	
	public void setCp(int cp){
		this.cp = cp;
	}
	
	public abstract void attack();
}