/**
 * <b>Coronese Marco</b>
 * <u>4AI</u>
 * <i>04/05/2022</i>
 * 
 * 
 * <h2>Classe CoroneseMarcoClass</h2>
 * 
 * <ul>
 * Funzioni: 
 * <li>CoroneseMet
 * </ul>
 * 
 * @version 2.0 
 * @author Marco Coronese 
 * 
 *
 */
public class CoroneseMarcoClass {
	
	/**
	 * metodo costruttore
	 */
	
	public CoroneseMarcoClass() {}
	
	/**
	 * 
	 * @param n numero su cui calcolare il fattoriale
	 * @return il valore del fattoriale del numero passato (n)
	 */
	
	public int coroneseMet(int n) {
		int fatt;
		int i;
		fatt=1;
		for(i=1; i<=n; i++) {
			fatt=fatt*i;     //errato --> fatt=fatt+i
		}
		return fatt;
	}
	
	/**
	 * 
	 * main usato come test di classe
	 */

	public static void main(String[] args) {
		CoroneseMarcoClass c=new CoroneseMarcoClass();
		
		System.out.println(c.coroneseMet(6));

	}

}
