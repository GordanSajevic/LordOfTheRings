
public interface GameObject {

	/**
	 * Metoda koja vraća true ako je lik živ, i false u suprotnom
	 * @return boolean
	 */
	
	boolean isAlive();
	
	/**
	 * Metoda koja omogućava napad lika na drugi lik
	 * @param other
	 */
	
	void attack(GameObject other);
	
	/**
	 * Metoda koja liku oduzima od energije u zavisnosti od protivničkog napada
	 * @param attackStrength
	 */
	
	void handleAttack(double attack);
	
}
