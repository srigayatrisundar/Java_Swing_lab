import javax.swing.*;

import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

public class Dice
{
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public Dice()
	{
		panel = new JPanel();
		button = new JButton("ROLL");
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel();
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(text);
		panel.add(button);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				int sides = Integer.parseInt(input);//convert String to double
				Random rand = new Random();
				int ans= rand.nextInt(sides)+1;
				/*String newText = "The dice rolled: " + String.format("%.d",ans);//convert double to String and
											       //only display 2 places past decimal
											        
				label.setText(newText);*/
				label.setText("The die rolled: " + ans);
				panel.add(label);
			}
		};
		
		return listener;
	}	

	
}