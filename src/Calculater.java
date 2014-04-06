import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;

public class Calculater extends JFrame{
	JButton jbt1 = new JButton("1");
	JButton jbt2 = new JButton("2");
	JButton jbt3 = new JButton("3");
	JButton jbt4 = new JButton("4");
	JButton jbt5 = new JButton("5");
	JButton jbt6 = new JButton("6");
	JButton jbt7 = new JButton("7");
	JButton jbt8 = new JButton("8");
	JButton jbt9 = new JButton("9");
	JButton jbt0 = new JButton("0");
	JButton jbtDot = new JButton(".");
	JButton jbtA = new JButton("+");
	JButton jbtS = new JButton("-");
	JButton jbtM = new JButton("*");
	JButton jbtD = new JButton("/");
	JButton jbtDelete = new JButton("C");
	JTextField jftPutOut = new JTextField(15);
	
	public Calculater(){
		JPanel p1 = new JPanel(new GridLayout(5, 2));
	}
	
	public static void main(String args[]){
		JFrame frame = new Calculater();
		frame.setTitle("Calculater");
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
