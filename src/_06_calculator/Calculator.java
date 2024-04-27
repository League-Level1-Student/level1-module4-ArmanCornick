package _06_calculator;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	int add(int x, int y) {
		return(x+y);
	}
	int subtract(int x, int y) {
		return(x-y);
	}
	int multiply(int x, int y) {
		return(x*y);
	}
	int divide(int x, int y) {
		return(x/y);
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton divide = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JTextField x = new JTextField();
	JTextField y = new JTextField();

	void start() {
		frame.add(panel);
		panel.add(add);
		panel.add(subtract);
		panel.add(divide);
		panel.add(multiply);
		panel.add(x);
		panel.add(y);
		frame.pack();
		frame.setVisible(true);
	}



}
