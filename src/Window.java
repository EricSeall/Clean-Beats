import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
	JFrame frame;
	JButton met;
	JTextField sp;

	public Window(int length, int width) {
		super("Drum Sequencer");
		frame = new JFrame("Drum Sequencer");
		frame.setSize(length, width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setPreferredSize(getPreferredSize());
		frame.setLayout(null);
		frame.setResizable(false);

		met = new JButton("Metronome");
		frame.add(met);
		met.setBounds(100, 100, 100, 50); // x,y,w,h
		//How to make a button
		
		class Action1 implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.out.println("you clicked me ;)");
			}
		} //Add more of these classes to create actions for more buttons
		
		
		met.addActionListener(new Action1());
		//Do this for each button made
	}
}

//These are here just in case I need them later.
// import java.awt.BorderLayout;
// import java.awt.FlowLayout;
/*import javax.swing.*;

public class Window extends JFrame {
	JFrame frame;
	JButton met;
	JTextField sp;
	public Window(int length, int width) {
		super("Drum Sequencer");
		frame = new JFrame("Drum Sequencer");
		frame.setSize(length, width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setPreferredSize(getPreferredSize());
		frame.setLayout(null);
		frame.setResizable(false);
		
		met = new JButton("Metronome");
		frame.add(met);
		met.setBounds(100, 100, 100, 50); //x,y,w,h
		
		JTextField sp = new JTextField(10);
		frame.add(sp);
		sp.setBounds(150,150,50,50);
	}
} //Double.parseDouble(sp.getText())
*/