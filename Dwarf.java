public class Dwarf implements GameObject{

	private String name;
	private double attackStrength;
	private double health;
	private double armor;
	
	/**
	 * Konstruktor koji prima sva četiri parametra
	 * @param name
	 * @param attackStrength
	 * @param health
	 * @param armor
	 */
	
	public Dwarf(String name, double attackStrength, double health, double armor)
	{
		setName(name);
		setAttackStrength(attackStrength);
		setHealth(health);
		setArmor(armor);
	}
	
	
	/**
	 * Getter za name
	 * @return name
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Getter za attackStrngth
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
	 * Getter za armor
	 * @return armor
	 */
	
	public double getArmor()
	{
		return armor;
	}
	
	/**
	 * Setter za name
	 * @param name
	 */
	
	public void setName(String name)
	{
		if (name.length() < 1)
		{
			throw new IllegalArgumentException("Name cannot be empty field!");
		}
		else
		{
			this.name = name;
		}
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
	 * Setter za armor
	 * @param armor
	 */
	
	public void setArmor(double armor)
	{
		if (armor <= 0)
		{
			throw new IllegalArgumentException("Armor cannot be lesser or equal to zero!");
		}
		else
		{
			this.armor= armor;
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
		this.health += this.armor;
		
	}
	
	/**
	 * Metoda koja vraća string sa svim podacima o objektu
	 */
	
	public String toString()
	{
		return "Dwarf " + name + "\nAttack strength: " + attackStrength + "\nHealth: " + health + "\nArmor: " + armor;
	}

}
