package _11_lights_out;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener {

	JPanel gamePanel;
	JFrame frame;
	JLabel[] labels;
	boolean win;
	Random z;

	public LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		//1. Make your gamePanel a 5x5 grid with setLayout(new GridLayout(5, 5));
			frame = new JFrame();
			gamePanel = new JPanel();
			gamePanel.setLayout(new GridLayout(5,5));
			labels = new JLabel[25];
			z = new Random();
			
			//2. Add 25 JLabels to your gamePanel (these are your lights)
			for(int i=0;i<25;i++) {
				labels[i] = new JLabel();
				gamePanel.add(labels[i]);
				labels[i].setBackground(Color.LIGHT_GRAY);
				labels[i].addMouseListener(this);
				labels[i].setText(Integer.toString(i));
				labels[i].setSize(100,100);
				labels[i].setOpaque(true);
			}
			for(int x=0;x<25;x++) {
				int r = z.nextInt(2);
				if(r == 1) {
					labels[x].setBackground(Color.LIGHT_GRAY);
				}  else {
					labels[x].setBackground(Color.WHITE);
				}
			}
			//3. Use setText() to add a position number to each light (0-24).

			//4. Set the background of each light to LIGHT_GRAY
			// - you will also have to set the background to opaque.
			// - Use light.setOpaque(true);

			//5. Add a mouseListener to each light
		
		
		//6. Add your panel to a frame
frame.add(gamePanel);
		//7. Set the size of the frame
frame.setSize(550,550);
frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		win = true;
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`
			JLabel clicked = (JLabel) e.getSource();
		// 2. Get the number (position) of the light
		// 3. Now use the makeMove method to code which lights turn on and off.
			makeMove(Integer.parseInt(clicked.getText()));
			gamePanel.repaint();
		// 4.Check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color
			for(int x=0;x<25;x++) {
				if(labels[x].getBackground()==Color.WHITE) {
					win = false;
				} 
			} if(win==true) {
				System.out.println("Winner!");
			}

		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?

				
	}

	void makeMove(int pos) {
		toggle((JLabel) gamePanel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) gamePanel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) gamePanel.getComponent(pos + 5));
		}
	}

	JLabel getLightAtPosition(int lightPosition) {
		return (JLabel) gamePanel.getComponent(lightPosition);
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.LIGHT_GRAY);

		} else {
			label.setBackground(Color.WHITE);
		}
		gamePanel.repaint();
	}
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	//sign out of github next time or else
	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
}
