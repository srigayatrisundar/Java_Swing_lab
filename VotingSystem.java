import javax.swing.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

public class VotingSystem
{
	private JPanel panel,pan2, pan3;
	private JButton vote;
	private JTextField first;
	private JTextField last;
	private JTextField cand;
	private JLabel lab1,lab2;
	String check;
	String f,l,cad;
	public VotingSystem()
	{
		panel = new JPanel();
		pan2 =  new JPanel();
		pan3 = new JPanel();
		vote = new JButton("Vote");
		first = new JTextField("enter first name", 10);
		last = new JTextField("enter last name", 10);
		cand = new JTextField("Enter candidate number",3);
		lab1 = new JLabel("<html><br>Vote by entering your name and candidate number</html>", SwingConstants.CENTER);
		lab2 = new JLabel("<html><br>Candidate 1, Number: 1<br>Candidate 2, Number: 2<br>Candidate 3, Number: 3<br>Candidate 4, Number:4<br>");
		
		//Load the listener
		vote.addActionListener(votebuttonListener());	
		
		
		//load the panel
		panel.add(first);
		panel.add(last);
		panel.add(cand);
		pan2.add(lab1);
		pan2.add(lab2);
		pan2.add(vote);

	}
	
	public Component getContent()
	{
		return (panel);
	}
	public Component getContentpan2()
	{
		return (pan2);
	}
	public Component getContentpan3()
	{
		return (pan3);
	}
	
	
	private ActionListener votebuttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				try
				{
					String f = first.getText();
					String l = last.getText();
					String cad = cand.getText();
					String fname = l+"_"+f+"_"+"ballot.txt";
					int cn = Integer.parseInt(cad);
					File file = new File(fname);
					if(cn==1||cn==2||cn==3||cn==4)
					{
						if(!file.exists())
						{
							file.createNewFile();
							check= "You voted for candidate "+cn+". File succesfully created.";
							System.out.println(check);
							
						}
						else
						{
							check = "Your file already exists. You cannot vote again. sorry";
							System.out.println(check);
						}
					}
					else
					{
						check= "Please enter a valid candidate number";
						System.out.println(check);
					}
				}
				catch(IOException e1)
				{
					e1.printStackTrace();
				}
				
			}
		};
		return listener;
	}	
}