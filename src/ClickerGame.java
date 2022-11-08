import java.awt.BorderLayout;
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
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JButton resbutton;
	
	public ClickerGame() 
	{ 
		frame = new JFrame();
		
		button = new JButton("CLICK HERE");
		resbutton = new JButton("RESET");
		button.addActionListener(this);
		label = new JLabel("Number of clicks: 0");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		panel.add(button);
		panel.add(label);
		panel.add(resbutton);
		panel.setLayout(new GridLayout(3,1,50,50));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Clicker Game");
		frame.pack();
		frame.setVisible(true);
		
		
		
	}

	public static void main(String[] args) 
	{
		new ClickerGame();

	}
	public void actionPerformed(ActionEvent e) 
	{
		counter++;
		label.setText("Number of clicks: " + counter);
		
	}
	public void actionPreformed(ActionEvent a)
	{
		if(a.getSource()==resbutton) 
		{
			resbutton.setText("Number of clicks: "+  -counter);
		}
	}
	

}
