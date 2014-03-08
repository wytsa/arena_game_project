/**
 * 
 */
package arena;

/**
 * @author wytsa
 *
 */
public class Misc {
	
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

	/*
	 * this is made to generate the stats that must be figured.
	 * pd
	 * ed
	 * spd
	 * rec
	 * end
	 * stun
	 */
	public void figuredStats(){
		pd = (strength / 5);
		ed = (con / 5);
		spd = (1 + (dex / 10));
		rec = ((strength / 5) + (con / 5));
		end = (con * 2);
		stun = (body + (strength / 2) + (con / 2));
	}
	
	/*
	 * this is used to generate the physical attack number
	 */
	public void physicalAttack() {
		physAtt = (strength / 5);
		// TODO Auto-generated method stub
		
	}
}
