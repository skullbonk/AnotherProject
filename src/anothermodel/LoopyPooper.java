package anothermodel;

import javax.swing.JOptionPane;

public class LoopyPooper
{

	

	public LoopyPooper()
	{
		//			a   b   c  d   e   f
		int af[] = {3, 12, 23, 8, 19, 27}; // Default values
		
		for(int nums : af)
		{
			System.out.println(nums);
		}
		
		
		
		
		
		
		
		userNums();
		
		
		
		
		
		boolean finished = false;
		/*
		for(int nums = 0; nums < af.length; nums ++)
		{
			System.out.println(af[nums]);
		}
		finished = true;
		*/
		
		
		/*
		int a = 3;
		int b = 12;
		int c = 23;
		int d = 8;
		int e = 19;
		int f = 27;
		*/
		
		finished = true;
	}
	


	
	public void userNums()
	{
		String in = JOptionPane.showInputDialog(null, "a = ?");
		int a = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog(null, "b = ?");
		int b = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog(null, "c = ?");
		int c = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog(null, "d = ?");
		int d = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog(null, "e = ?");
		int e = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog(null, "f = ?");
		int f = Integer.parseInt(in);		
	}
	
}
