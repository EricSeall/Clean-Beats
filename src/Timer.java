public class Timer {
	private static double bpm;
	private static long start;
	private static boolean isRunning;

	public Timer(double bpm) {
		this.bpm = bpm;
	}

	public static void cycle() {
		start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 60000 / bpm) {
		}
		isRunning = false;
	}

	public static void setBpm(int b) {
		bpm = b;
	}

	public static double getBpm() {
		return bpm;
	}

	public static boolean isRunning() {
		return isRunning;
	}
}
