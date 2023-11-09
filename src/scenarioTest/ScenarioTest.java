package scenarioTest;

import villagegaulois.Etal;
import villagegaulois.IEtal;
import produit.*;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier= new Etal<>();
		IEtal<Poisson> etalPoisson= new Etal<>();
		etals[0] = etalSanglier;
		etals[1] = etalPoisson;
	}
	
}
