import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculatorwindow implements ActionListener 
{
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	JPanel panel;
	JLabel lastInput;
	
	Font myFont = new Font("Arial", Font.BOLD,30);
	
	double num1=0, num2=0,result=0;
	char operator;
	
	Calculatorwindow()
	{
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 600);
		frame.setLayout(null);
		frame.setResizable(false);
					
		textfield = new JTextField();
		textfield.setBounds(50, 50, 300, 50);
		textfield.setFont(myFont);
		textfield.setHorizontalAlignment(SwingConstants.RIGHT);
		textfield.disable();
		
		lastInput = new JLabel("test");
		lastInput.setBounds(50,0,300,50);
		lastInput.setFont(myFont);
		lastInput.setHorizontalAlignment(SwingConstants.RIGHT);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		divButton = new JButton("/");
		mulButton = new JButton("*");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("<--");
		clrButton = new JButton("C");
		negButton = new JButton("(-)");
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = divButton;
		functionButtons[3] = mulButton;		
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
		
		for(int i = 0; i<9;i++) 
		{
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		for(int i = 0; i<10;i++) 
		{
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		negButton.setBounds(50,450,80,50);
		delButton.setBounds(160,450,80,50);
		clrButton.setBounds(270,450,80,50);
		
		panel = new JPanel();
		panel.setBounds(50, 120, 300, 300);
		panel.setLayout(new GridLayout(4,4,10,10));
		
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		
		panel.add(divButton);
		panel.add(numberButtons[0]);
		panel.add(decButton);
		panel.add(equButton);
		
		frame.add(panel);
		frame.add(negButton);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textfield);
		frame.add(lastInput);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new Calculatorwindow();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<10;i++)
		{
			if(e.getSource() == numberButtons[i]) 
			{
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==decButton) 
		{
			textfield.setText(textfield.getText().concat("."));
		}
		if(e.getSource()==addButton) 
		{
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
			String last =Double.toString(num1);
			lastInput.setText(last+"+");
			
		}
		if(e.getSource()==subButton) 
		{
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
			String last =Double.toString(num1);
			lastInput.setText(last+"-");
		}
		if(e.getSource()==mulButton) 
		{
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
			String last =Double.toString(num1);
			lastInput.setText(last+"*");
		}
		if(e.getSource()==divButton) 
		{
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
			String last =Double.toString(num1);
			lastInput.setText(last+"/");
		}
		if(e.getSource()==equButton) 
		{
			num2=Double.parseDouble(textfield.getText());
			
			switch(operator) 
			{
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}
			textfield.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clrButton) 
		{
			textfield.setText("");
		}
		if(e.getSource()==delButton) 
		{
			String string = textfield.getText();
			textfield.setText("");
			for(int i=0;i<string.length()-1;i++)
			{
				textfield.setText(textfield.getText()+string.charAt(i));
			}
		}
		if(e.getSource()==negButton) 
		{
			double temp = Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));
		}
	}
}
