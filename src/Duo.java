
public class Duo<T, S> {
	private T valT;
	private S valS;
	
	public Duo() {
		this.valT = null;
		this.valS = null;
	}
	
	public Duo(T valT, S valS) {
		this.valT = valT;
		this.valS = valS;
	}
	
	public void setValeurs(T valT, S valS) {
		this.valT = valT;
		this.valS = valS;
	}
	
	public void setValeurT(T valT) {
		this.valT = valT;
	}
	
	public void setValeurS(S valS) {
		this.valS = valS;
	}
	
	public T getValeurT() {
		return valT;
	}
	
	public S getValeurS() {
		return valS;
	}
}
