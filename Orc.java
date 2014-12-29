
public class Orc extends Enemy implements GameObject{

	/**
	 * Konstruktor sa dva parametra
	 * @param attackStrength
	 * @param health
	 */
	
	public Orc(double attackStrength, double health) {
		super(attackStrength, health);
		this.attackStrength = attackStrength;
		this.health = health;
	}
	
	/**
	 * Override metode toString
	 */
	
	@Override
	public String toString()
	{
		return "Orc " + "\nAttack strength: " + attackStrength + "\nHealth: " + health;
	}
	
	
}

	
