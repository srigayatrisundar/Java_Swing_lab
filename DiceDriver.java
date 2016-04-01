import javax.swing.JFrame;


public class DiceDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Dice");
		Dice demo = new Dice();
		
		frame.getContentPane().add(demo.getContent());
		frame.pack();
		frame.setVisible(true);
		frame.setSize(100, 100);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}