package arena;

public class Player extends Misc{
	
	public Player(){
		strength = 10;
		dex = 10;
		con = 10;
		body = 10;
		intel = 10;
		ego = 10;
		prec = 10;
		com = 10;
		figuredStats();
	}

	public void printStats() {
		System.out.println("Strength is " + strength);
		System.out.println("Dexterity is " + dex);
		System.out.println("Constitution is " + con);
		System.out.println("Body is " + body);
		System.out.println("Intelegence is " + intel);
		System.out.println("Ego is " + ego);
		System.out.println("Preception is " + prec);
		System.out.println("Comliness is " + com);
		System.out.println("Physical deffence is " + pd);
		System.out.println("Energy deffence is " + ed);
		System.out.println("Speed is " + spd);
		System.out.println("Recovery is " + rec);
		System.out.println("Endurance is " + end);
		System.out.println("Stun is " + stun);
	}
}
