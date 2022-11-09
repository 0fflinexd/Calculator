import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickerGame implements ActionListener 
{
	int counter = 0;
	private JLabel lastInput;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JButton resbutton;
	private JButton bigButton;
	private JButton biggestButton;
	private JButton medButton;
	
	private JButton subButton;
	
	public ClickerGame() 
	{ 
		frame = new JFrame();
		subButton = new JButton("-1,337");
		resbutton = new JButton("RESET");
		button = new JButton("+1");
		medButton = new JButton("+10");
		bigButton = new JButton("+100");
		biggestButton = new JButton("+1,000");
		
		resbutton.addActionListener(this);
		button.addActionListener(this);
		medButton.addActionListener(this);
		bigButton.addActionListener(this);
		biggestButton.addActionListener(this);
		subButton.addActionListener(this);
		label = new JLabel("Number of clicks: 0");
		lastInput = new JLabel("test");
		label.setBounds(450, 150, 450, 500);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder());
		panel.add(lastInput);
		panel.add(label);
		panel.add(resbutton);
		panel.add(button);
		panel.add(medButton);
		panel.add(bigButton);
		panel.add(biggestButton);
		panel.add(subButton);
		panel.setLayout(new GridLayout(5,2,5,5));
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Clicker Game");
		frame.pack();
		frame.setVisible(true);
		frame.setSize(350, 300);	
		frame.setResizable(false);
		}

	public static void main(String[] args) 
	{
		new ClickerGame();

	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{
		counter++;
		label.setText("Number of clicks: " + counter);
		}
		else if(e.getSource() == medButton)
		{
			counter = counter+10;
			label.setText("NUmber of clicks: "+ counter);
		}
		
		else if(e.getSource() == resbutton)
		{
			counter = 0;
			label.setText("Number of clicks: 0");
		}
		else if(e.getSource() == bigButton)
		{
			counter = counter+100;
			label.setText("Number of clicks: "+ counter);
		}
		else if (e.getSource() == biggestButton)
		{
			counter = counter+1000;
			label.setText("Number of clicks: "+ counter);
		}
		else if (e.getSource() == subButton)
		{
			counter = counter-1337;
			label.setText("Number of clicks: "+ counter);
		}
	}
	
}
