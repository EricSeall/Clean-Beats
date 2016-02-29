
public class Player {
	private Grid[] g;
	private Audio[] a;
	public Player(Audio[] a, Grid[] g)
	{
		this.a = a;
		this.g = g;
	}
	public void playClips(int count)
	{
		a[0].play(g[0],count-1);
		a[1].play(g[1],count-1);
		Timer.cycle();
		a[0].stop();
		a[1].stop();
		if(count == 1)
			playClips(Main.gridLen);
		else
			playClips(count-1);		
	}
}
