public class Enemy implements GameObject {

	protected double attackStrength;
	protected double health;
	
	/**
	 * Konstruktor sa dva parametra
	 * @param attackStrength
	 * @param health
	 */
	
	public Enemy(double attackStrength, double health)
	{
		setAttackStrength(attackStrength);
		setHealth(health);
	}
	
	/**
	 * Getter za attackStrength
	 * @return attackStrength
	 */
	
	public double getAttackStrength()
	{
		return attackStrength;
	}
	
	/**
	 * Getter za health
	 * @return health
	 */
	
	public double getHealth()
	{
		return health;
	}
	
	/**
	 * Setter za attackStrength
	 * @param attackStrength
	 */
	
	public void setAttackStrength(double attackStrength)
	{
		if (attackStrength <= 0)
		{
			throw new IllegalArgumentException("Attack strength cannot be lesser or equal to zero!");
		}
		else
		{
			this.attackStrength = attackStrength;
		}
	}
	
	/**
	 * Setter za health
	 * @param health
	 */
	
	public void setHealth(double health)
	{
		if (health <= 0)
		{
			throw new IllegalArgumentException("Health cannot be lesser or equal to zero!");
		}
		else
		{
			this.health= health;
		}
	}
	
	/**
	 * Implementacija metode isAlive iz GameObject interfacea
	 * return boolean
	 */
	
	public boolean isAlive() {
		if (this.health > 0)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Implementacija metode attack iz GameObject interfacea
	 */
	
	public void attack(GameObject other) {
		other.handleAttack(attackStrength);
		
	}
	
	/**
	 * Implementacija metode handleAttack iz GameObject interfacea
	 */
	
	public void handleAttack(double attack) {
		this.health -= attack;
		
	}

	/**
	 * Metoda koja vraća string sa svim podacima o objektu
	 */
	
	public String toString()
	{
		return "Enemy " + "\nAttack strength: " + attackStrength + "\nHealth: " + health;
	}
	
	
}
