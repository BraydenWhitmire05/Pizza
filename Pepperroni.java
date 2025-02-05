package intec_2150;
public class Pepperroni extends Pizza {

	private int pepperroni;
	
	public Pepperroni() {
		
	}
	
	public Pepperroni(String name, int pepperroni, int Cheese, int Sauce, double Price) {
		this.pepperroni = pepperroni;
	}
	

	public int getPepperroni() {
		return pepperroni;
	}

	public void setPepperroni(int pepperroni) {
		this.pepperroni = pepperroni;
	}

	@Override
	public String toString() {
		return super.toString() ;
	}
	
	
	
}
