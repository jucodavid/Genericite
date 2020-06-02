import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Voiture> list = new ArrayList<Voiture>();
	
	public void add(List<? extends Voiture> listVoiture) {
		for(Voiture v : listVoiture)
			list.add(v);
		
		System.out.println("Contenu du garage :");
		for(Voiture v : list)
			System.out.println(v.toString());
	}
}
