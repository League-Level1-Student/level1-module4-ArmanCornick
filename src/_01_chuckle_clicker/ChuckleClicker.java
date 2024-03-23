package _01_chuckle_clicker;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton("joke");
	JButton punchline = new JButton("punchline");
	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();
	}
	void makeButtons(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setVisible(true);
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent clicker) {
		// TODO Auto-generated method stub
		if(clicker.getSource() == joke) {
			JOptionPane.showMessageDialog(joke, "What happens to an illegaly parked frog?");
		}
		if(clicker.getSource() == punchline) {
			JOptionPane.showMessageDialog(joke, "It gets Toad away");
		}
	}

}
