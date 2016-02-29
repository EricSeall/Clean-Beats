public class Main {
	private static Audio a, b, c, d, e, f, g, h;
	private static Grid mapA, mapB;
	public static int gridLen; 
	private static Window window;
	private static Player p;
	private static Data data;

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		window = new Window(300, 300);
		String[] files = { "/Ace Aura Snare 0.1_3.wav", "/Ace Aura Kick 0.1_1.wav" };
		data = new Data(files);
		gridLen = 8;
		a = new Audio("/Ace Aura Snare 0.1_3.wav");
		b = new Audio("/Ace Aura Kick 0.1_1.wav");

		Timer.setBpm(140);
		data.sampleList();
		mapA = new Grid(gridLen, a);
		mapB = new Grid(gridLen, b);
		p = new Player(new Audio[] { a, b }, new Grid[] { mapA, mapB });
		// mapA.playGrid();
		// mapB.playGrid();
		p.playClips(gridLen);
		/*
		 * for(int i = 0; i<gridLen; i++) { a.play(); b.play(); }
		 */
	}
}
