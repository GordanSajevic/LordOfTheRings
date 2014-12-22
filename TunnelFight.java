
public class TunnelFight {

	//Testna klasa
	
	public static void main(String[] args) {
		Dwarf obrim = new Dwarf("Obrim, sin Agammov", 9, 30, 2);
		GameObject[] orcs = new Orc[10];
		for (int i=0; i<orcs.length-1; i++)
		{
			orcs[i] = new Orc(5, 10);
		}
		
		//Anonimna klasa
		orcs[orcs.length-1] = new Orc(3, 3){
			
			public void handleAttack(double attack) {
				this.health -= attack*2;
				
			}
			
			public String toString()
			{
				return "Goblin " + "\nAttack strength: " + attackStrength + "\nHealth: " + health;
			}
		};
		int numOrcs = orcs.length;
		int i=0;
		while (obrim.getHealth() > 0 && numOrcs > 0 )
		{
			Duel battle = new Duel(obrim, orcs[i]);
			battle.fight();
			numOrcs--;
			i++;
		}

		
	//Patuljak Obrim može da ubije 9 orka, 10-ti ork ga porazi. Ukoliko dodamo goblina
	// na 10-to mjesto u nizu, patuljak Obrim može da pobijedi 10 protivnika
	}

}
