package sweepstakes_proj;

import java.util.HashMap;
import java.util.List;

public class Sweepstakes {
	public String name;
	public HashMap<Integer, Contestant> contestants;
	
	public Sweepstakes(String name) {
		this.name = name;
		RegisterContestants();
	}
	public void RegisterContestants() {
		CSVParser csvParser = new CSVParser();
		List<Contestant> csvContestants = csvParser.parse();
		contestants = new HashMap<Integer, Contestant>();
		for (Contestant contestant : csvContestants) {
			contestants.put(contestant.id, contestant);
		}
		
	}
	
	public static Contestant PickWinner() {
		return null;
		
	}
}
