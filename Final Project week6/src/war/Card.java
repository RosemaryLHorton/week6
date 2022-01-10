package war;

public class Card {
	private String character; 
	private String planet;
	private int rank;

	 public Card(String character, String planet, int rank) {
		this.character = character;
		this.planet = planet;
		this.rank = rank;
	}

	@Override
	public String toString() {
		
		return character +" of "+ planet;
	}

	public int getRank() {
		return rank;
	}

}


