

public class TunnelFight {

	//Testna klasa
	
	static GameObject winner;
	
	public static void main(String[] args) {
		Dwarf obrim = new Dwarf("Obrim, sin Agammov", 9, 30, 2);
		GameObject[] enemy = new GameObject[10];
		for (int i=0; i<enemy.length-1; i++)
		{
			enemy[i] = new Orc(5, 10);
		}
		
		//Anonimna klasa za goblina
		
		enemy[enemy.length-1] = new Enemy(3.0, 3.0)
		{
			@Override
			public void handleAttack(double attack) {
				this.health -= 2*attack;
				
			}
			
			public String toString()
			{
				return "Goblin " + "\nAttack strength: " + attackStrength + "\nHealth: " + health;
			}
		};
		int numEnemies = enemy.length;
		int i=0;
		while (obrim.getHealth() > 0 && numEnemies > 0 )
		{
			Duel battle = new Duel(obrim, enemy[i]);
			winner = battle.fight();
			if (winner == obrim)
			{
				numEnemies--;
			}
			i++;
		}

		
	//Patuljak Obrim može da ubije 9 orka, 10-ti ork ga porazi. Ukoliko dodamo goblina
	// na 10-to mjesto u nizu, patuljak Obrim može da pobijedi 10 protivnika
	}

}
