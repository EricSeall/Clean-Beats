import java.util.Random;

public class Grid {
	private boolean[] grid;
	private Random rand;
	private Audio a;
	private int size;
	private boolean on;

	public Grid(int size, Audio a) {
		grid = new boolean[size];
		rand = new Random();
		on = true;
		this.a = a;
		this.size = size;
		for (int i = 0; i < grid.length; i++) {
			grid[i] = true;
		}
	}

	public void toggleSpace(int loc) {
		if (loc > grid.length - 1 || loc < 0)
			System.out.println("Out of range");
		else if (grid[loc])
			grid[loc] = false;
		else
			grid[loc] = true;
	}

	public boolean[] getGrid() {
		return grid;
	}

	public void randomize() {
		for (int i = 0; i < grid.length; i++) {
			grid[i] = rand.nextBoolean();
		}
	}

/*	public void playGrid() {
		if (on == false)
			return;
		int i = 0;
		while (i < size && isOn()) {
			if (getGrid()[i]) {
				System.out.println("a playing");
				//a.play(this, size);
			}
			if (i >= size - 1) {
				i = -1;
			}
			// timer.cycle();

		}
	}
*/
	public void playSpace(int spot) {
		if (getGrid()[spot])
			a.play(this, size);
	}

	public boolean isOn() {
		return on;
	}

	public void toggleGrid() {
		if (isOn())
			on = false;
		else
			on = true;
	}

	public int getSize() {
		return size;
	}
}
