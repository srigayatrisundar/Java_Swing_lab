import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class safeC 
{
	private JPanel panel;
	private JButton FtC, FtK, CtF, CtK, KtC, KtF;
	private JTextField text;
	private JLabel label;
	
	public safeC()
	{
		panel = new JPanel();
		FtC = new JButton("F to C");
		FtK = new JButton("F to K");
		CtF = new JButton("C to F");
		CtK = new JButton("C to K");
		KtC = new JButton("K to C");
		KtF = new JButton("K to F");
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("Enter temperature");
		
		//Load the listener
		FtC.addActionListener(FtCListener());
		FtK.addActionListener(FtKListener());
		CtF.addActionListener(CtFListener());
		CtK.addActionListener(CtKListener());
		KtC.addActionListener(KtCListener());
		KtF.addActionListener(KtFListener());
		
		
		//load the panel
		panel.add(text);
		panel.add(FtC);
		panel.add(FtK);
		panel.add(CtK);
		panel.add(CtF);
		panel.add(KtC);
		panel.add(KtF);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener FtCListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				if(input.equals(""))
				{
					label.setText("Enter a value");
					panel.add(label);
				}
				else
				{
					try
					{
						double tempInF = Double.parseDouble(input);//convert String to double
						double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
						String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
													       //only display 2 places past decimal
						label.setText(newText);
						//System.out.println(newText);
					}
					catch(NumberFormatException nfe)
					{
						label.setText("Not an integer");
						panel.add(label);
					}
				}
			}
		};
		return listener;
	}	
	private ActionListener FtKListener()
		{
			ActionListener listener = new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String input = text.getText();
					if(input.equals("")){
						label.setText("Enter a value");
						panel.add(label);
					}
					else
					{
						try
						{
							double tempInF = Double.parseDouble(input);//convert String to double
							double tempInK = (tempInF+459.67)*(5.0/9.0); //convert F to C
							String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
														       //only display 2 places past decimal
							label.setText(newText);
							//System.out.println(newText);
						}
						catch(NumberFormatException nfe)
						{
							label.setText("Not an integer");
							panel.add(label);
						}
					}
				}
			};
			return listener;
		}	
	private ActionListener CtFListener()
			{
				ActionListener listener = new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{	String input = text.getText();
					if(input.equals("")){
						label.setText("Enter a value");
						panel.add(label);
					}
					else{
						try{
						double tempInC = Double.parseDouble(input);//convert String to double
						double tempInF = (tempInC*(9.0/5.0))+ 32.0; //convert F to C
						String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
													       //only display 2 places past decimal
						label.setText(newText);
						//System.out.println(newText);
						}
						catch(NumberFormatException nfe){
							label.setText("Not an integer");
							panel.add(label);
						}
					}
					}
				};
				return listener;
			}	
	private ActionListener CtKListener()
				{
					ActionListener listener = new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							String input = text.getText();
							if(input.equals("")){
								label.setText("Enter a value");
								panel.add(label);
							}
							else{
								try{
							double tempInC = Double.parseDouble(input);//convert String to double
							double tempInK = tempInC + 273.15; //convert F to C
							String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
														       //only display 2 places past decimal
							label.setText(newText);
							//System.out.println(newText);
								}
								catch(NumberFormatException nfe){
									label.setText("Not an integer");
									panel.add(label);
								}
							}
						}
					};
					return listener;
				}	
	private ActionListener KtCListener()
					{
						ActionListener listener = new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								String input = text.getText();	
								if(input.equals("")){
									label.setText("Enter a value");
									panel.add(label);
								}
								else{
									try{
								double tempInK = Double.parseDouble(input);//convert String to double
								double tempInC = tempInK- 273.15; //convert F to C
								String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
															       //only display 2 places past decimal
								label.setText(newText);
								//System.out.println(newText);
									}
									catch(NumberFormatException nfe){
										label.setText("Not an integer");
										panel.add(label);
									}
								}
							}
						};
						return listener;
					}	
	private ActionListener KtFListener()
						{
							ActionListener listener = new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
									String input = text.getText();
									if(input.equals("")){
										label.setText("Enter a value");
										panel.add(label);
									}
									else{
										try{
									double tempInK = Double.parseDouble(input);//convert String to double
									double tempInF = (tempInK * (9.0/5.0) -459.67); //convert F to C
									String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
																       //only display 2 places past decimal
									label.setText(newText);
									//System.out.println(newText);
										}
										catch(NumberFormatException nfe){
											label.setText("Not an integer");
											panel.add(label);
										}
									}
								}
							};
							return listener;
						}
	
}