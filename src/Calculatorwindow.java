import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculatorwindow implements ActionListeners {
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton, equButton, delButton, clrButton;
	JPanel panel;
	
	Font myFont = new Font("Arial", Font.BOLD,30);
	
	double num1=0, num2=0,result=0;
	char operator;
	
	
	
	Calculatorwindow()
	{
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		
		textfield = new JTextField();
		textfield.setBounds(50, 35, 300, 50);
		textfield.setFont(myFont);
		textfield.disable();
		
		frame.add(textfield);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		Calculatorwindow calc = new Calculatorwindow();
	}
	
	public void actionPerformed(ActionEvent e)
	{
	}
	

}
