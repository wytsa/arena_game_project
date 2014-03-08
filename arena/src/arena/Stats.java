package arena;

/**
 * @author sam
 * 
 * basic building block to store the stats of a player or a monster
 * 
 */
public class Stats {
	
	public int value;
	
	public Stats()
	{
		value = 0;
	}
	
	public int getStat() {
		return value;
	}

	public void setStat(int stat) {
		this.value = stat;
	}
}
