package arena;

public class Monster implements MiscInterface{

	//fields
	public int strength;
	public int dex;
	public int con;
	public int body;
	public int intel;
	public int ego;
	public int prec;
	public int com;
	public int pd;
	public int ed;
	public int spd;
	public int rec;
	public int end;
	public int stun;
	public int physAtt;
	
	public Monster(){
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

	@Override
	public void physicalAttack() {
		physAtt = (strength / 5);		
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

	@Override
	public void figuredStats() {
		pd = (strength / 5);
		ed = (con / 5);
		spd = (1 + (dex / 10));
		rec = ((strength / 5) + (con / 5));
		end = (con * 2);
		stun = (body + (strength / 2) + (con / 2));
	}
}
