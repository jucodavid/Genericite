import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Solo<Integer> valI = new Solo<Integer>(12);
		int nbre = valI.getValeur();
		Solo<String> valS = new Solo<String>("oui");
		Solo<Float> valF = new Solo<Float>(12.2f);
		Solo<Double> valD = new Solo<Double>(12.546549687);
		
		Duo<String, Boolean> dual = new Duo<String, Boolean>("toto", false);
		System.out.println("Valeur de l'objet dual : valT = "+dual.getValeurT()+", valS = "+dual.getValeurS());
		
		System.out.println("Liste de String");
		System.out.println("------------------------------");
		List<String> listeString = new ArrayList<String>();
		listeString.add("Une chaîne");
		listeString.add("une autre");
		listeString.add("une dernière");
		listeString.add("en fait non");
		listeString.add("ça devient long");
		
		for(String str : listeString)
			System.out.println(str);
		
		System.out.println("\nListe de float");
		System.out.println("---------------------------------------");
		
		List<Float> listeFloat = new ArrayList<Float>();
		listeFloat.add(12.25f);
		listeFloat.add(15.32f);
		listeFloat.add(42.42f);
		listeFloat.add(12f);
		
		for(float f : listeFloat)
			System.out.println(f);
		
		List<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture());
		listVoiture.add(new Voiture());
		
		List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
		listVoitureSP.add(new VoitureSansPermis());
		listVoitureSP.add(new VoitureSansPermis());
		
		List<Object> listObject = new ArrayList<Object>();
		listObject.add(new Object());
		listObject.add(new Object());
		
		afficher(listVoiture);
		afficher(listVoitureSP);
		
		affiche(listVoiture);
		affiche(listObject);
		
		Garage garage = new Garage();
		garage.add(listVoiture);
		garage.add(listVoitureSP);
	}
	static void afficher(List<? extends Voiture> list) {
		for(Voiture v : list)
			System.out.println(v.toString());
	}
	
	static void affiche(List<? super Voiture> list) {
		for(Object v : list)
			System.out.println(v.toString());
	}
}
