import javax.sound.sampled.*;
import javax.swing.*;

import java.io.*;
import sun.audio.*;

public class Audio implements Playable{
	private Clip clip;
	private String path;

	public Audio(String s) {
		try {

			path = s;
			AudioInputStream ais = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(s));
			AudioFormat baseFormat = ais.getFormat();
			AudioFormat decodeFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, baseFormat.getSampleRate(), 16, baseFormat.getChannels(), baseFormat.getChannels() * 2, baseFormat.getSampleRate(), false);
			AudioInputStream dais = AudioSystem.getAudioInputStream(decodeFormat, ais);
			clip = AudioSystem.getClip();
			clip.open(dais);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void play(Grid g, int loc) {
		if (clip == null)return;
		clip.setFramePosition(0);
		if (g.isOn() && g.getGrid()[loc]) {
			clip.start();
			//System.out.println(clip.isRunning());
		}
	}

	public void stop() {
		//if(clip.isRunning())	
		clip.stop();
		clip.setFramePosition(0);
	}

	public void close() {
		stop();
		clip.close();
	}
	
	public void reset()
	{
		clip.flush();
		clip.setFramePosition(0);
	}

	public String getPath() {
		return path;
	}

	public Clip getClip() {
		return clip;
	}
}
