package sweepstakes_proj;

public class MarketingFirm {
	public SweepstakesManager manager;
	
	public MarketingFirm(SweepstakesManager manager) {
		this.manager = manager;
		
	}
	
	public void AddSweepstakes(String name) {
		Sweepstakes sweepstakes = new Sweepstakes(name);
		manager.insertSweepstakes(sweepstakes);
		
		
	}
	
	public void RunSweepstakes() {
		
	}
}
