package war;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
	private List<String> characters = List.of("Peter Parker","Iron Man", "Black Panther", "DeadPool","Ant-Man","Wolverine", "Captian America","Dracula","Fantastic Four","Hercules","Honey Badger", "Hulk","Iceman","Invisible Woman","Jigsaw","King Cobra",
			"Kingoin","Kalw","Lilith","Lizard","Mad Thinker", "Maddog","Maggott","Magma","Man-Wolf","Mantis","Mary Jane Watson","Maverick","Medusa","Mongoose", "Nightcrawler","Nightmare","Nitro","Ogun","Omega","Orphan","Outlaw Kid","Paper Doll", "Patch", 
			"Pretty Boy","Punisher", "Queen Noir", "QuickSilver","Rattler", "Reaper", "Santa Claus", "Scorpion","Shadowcat", "Shriek","Silk","Silver Surfer","Storm", "Taurus", "Terror", "Thanos", "Thor","Thunderbolt", "Tusk","Unicorn","Unus","Valkyrie");

	private List<String> planets = 
			List.of("Attilan", "Doomstadt", "Heaven", "Atlantis", "Madripoor");
	private List<Card> cards;

	
	public Card draw() {
		return cards.remove(0);

		}
	public Deck() {
	createDeck();
	
}
private void createDeck() {
	cards = new LinkedList<>();
	for(int characterPos = 0; characterPos < characters.size(); characterPos++) {
		int rank = characterPos +2;
		String character = characters.get(characterPos);
		
		for(String planet : planets) {
		 cards.add (new Card(character, planet, rank));
			
	}
	
}	
}
@Override
public String toString() {
	StringBuilder builder =new StringBuilder();
	
	builder.append("Deck:\n");
	
	for(Card card : cards) {
		builder.append("   ").append(card).append("\n");
}
 return builder.toString();
}
public void shuffle() {
	Random random = new Random();
List<Card> temp = new LinkedList<>(cards);
cards.clear();

while(!temp.isEmpty()) {
	int pos = random.nextInt(temp.size());
	cards.add(temp.remove(pos));
}

	
}
public int size() {
	return cards.size();

}

	}

