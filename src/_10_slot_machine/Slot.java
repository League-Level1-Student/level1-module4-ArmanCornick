package _10_slot_machine;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot implements ActionListener {
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null){
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	JFrame frame;
	JPanel panel;
	JButton button = new JButton("Roll");
	JLabel cherry1;
	JLabel cherry2;
	JLabel cherry3;
	JLabel orange1;
	JLabel orange2;
	JLabel orange3;
	JLabel seven1;
	JLabel seven2;
	JLabel seven3;
	JLabel slot1;
	JLabel slot2;
	JLabel slot3;
	public Slot() throws MalformedURLException {
		frame = new JFrame();
		panel = new JPanel();
		slot1 = new JLabel();
		slot2 = new JLabel();
		slot3 = new JLabel();
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);

		frame.setVisible(true);
		cherry1 = createLabelImage("cherry.jpeg");
		cherry2 = createLabelImage("cherry.jpeg");
		cherry3 = createLabelImage("cherry.jpeg");
		orange1 = createLabelImage("orange.jpeg");
		orange2 = createLabelImage("orange.jpeg");
		orange3 = createLabelImage("orange.jpeg");
		seven1 = createLabelImage("seven.jpeg");
		seven2 = createLabelImage("seven.jpeg");
		seven3 = createLabelImage("seven.jpeg");
		rollImage(slot1);
		rollImage(slot2);
		rollImage(slot3);
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		frame.pack();
	}
	
	public void rollImage(JLabel z) {
		Random r = new Random();
		int o = 0;
		int c = 0;
		int s = 0;
		panel.remove(z);
		int x = r.nextInt(100);
		System.out.println(x);
		frame.pack();
			if(x<33) {
				if(o==0) {
				panel.add(orange1);
				} else if (o==1) {
					panel.add(orange2);
				} else if (o==2) {
					panel.add(orange3);
				}
			o+=1;
			} else if(32<x && x<91) {
				if(c==0) {
				panel.add(orange1);
				} else if (c==1) {
					panel.add(orange2);
				} else if (c==2) {
					panel.add(orange3);
				}
			c+=1;
			} else if(x>90) {
				if(s==0) {
				panel.add(orange1);
				} else if (s==1) {
					panel.add(orange2);
				} else if (s==2) {
					panel.add(orange3);
				}
			s+=1;
			}
		}
	
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		rollImage(slot1);
		rollImage(slot2);
		rollImage(slot3);
		panel.updateUI();
		frame.pack();
	}
}

