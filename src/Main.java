
public class Main {

	public static void main(String[] args) {
		Solo<Integer> valI = new Solo<Integer>(12);
		int nbre = valI.getValeur();
		Solo<String> valS = new Solo<String>("oui");
		Solo<Float> valF = new Solo<Float>(12.2f);
		Solo<Double> valD = new Solo<Double>(12.546549687);
		
		Duo<String, Boolean> dual = new Duo<String, Boolean>("toto", false);
		System.out.println("Valeur de l'objet dual : valT = "+dual.getValeurT()+", valS = "+dual.getValeurS());
	}

}
