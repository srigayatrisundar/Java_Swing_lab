import java.awt.BorderLayout;

import javax.swing.JFrame;


public class VotingSystemDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Voting System");
		VotingSystem demo = new VotingSystem();
		frame.getContentPane().add(demo.getContent(),BorderLayout.NORTH);
		frame.getContentPane().add(demo.getContentpan2(),BorderLayout.CENTER);
		frame.getContentPane().add(demo.getContentpan3(),BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(700, 300);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}