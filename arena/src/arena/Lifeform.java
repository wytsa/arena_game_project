package arena;

/**
 * @author sam
 * 
 * basic start of a player or a monster
 *
 */
public class Lifeform extends Stats {
	
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
	
	public Lifeform()
	{
		strength = 0;
		dex = 0;
		con = 0;
		body = 0;
		intel = 0;
		ego = 0;
		prec = 0;
		com = 0;
		pd = (strength / 5);
		ed = (con / 5);
		spd = (1 + (dex / 10));
		rec = ((strength / 5) + (con / 5));
		end = (con * 2);
		stun = (body + (strength / 2) + (con / 2));		
	}
	
	public void printStats()
	{
		System.out.println("strength is " + strength);
		System.out.println("strength is " + dex);
		System.out.println("strength is " + con);
		System.out.println("strength is " + body);
		System.out.println("strength is " + intel);
		System.out.println("strength is " + ego);
		System.out.println("strength is " + prec);
		System.out.println("strength is " + com);
		System.out.println("strength is " + pd);
		System.out.println("strength is " + ed);
		System.out.println("strength is " + spd);
		System.out.println("strength is " + rec);
		System.out.println("strength is " + end);
		System.out.println("strength is " + stun);
	}

}
