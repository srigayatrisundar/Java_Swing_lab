import javax.swing.JFrame;


public class safeCDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Temperature Converter");
		safeC demo = new safeC();
		
		frame.getContentPane().add(demo.getContent());
		frame.pack();
		frame.setVisible(true);
		frame.setSize(500, 500);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}