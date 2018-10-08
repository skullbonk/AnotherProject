package anotherpackage;
import java.util.ArrayList;
import anothermodel.PhotoshopDesc;
import anothermodel.LoopyPooper;

/**
 * Now you have gui, you're welcome
 */
import javax.swing.JOptionPane;



public class AnotherController
{
	
	private PhotoshopDesc commission;
	private LoopyPooper loopy;
	
	
	
	public AnotherController()
	{
		loopy = new LoopyPooper();
		commission = new PhotoshopDesc();
	}
	
	
	public void start()
	{
		questions();
	}
	
	
	public void questions()
	{
		
		int inputWidth = 1920;
		String input = JOptionPane.showInputDialog(null, "What is the width, in pixels, of your image?");
		while(!validInt(input))
		{
			input = JOptionPane.showInputDialog(null, "Type some danging numbers.");
		}
		
		inputWidth = Integer.parseInt(input);
		commission.setWidth(inputWidth);
		
		
		
		input = JOptionPane.showInputDialog(null, "And what is the height of your image, in pixels?");
		int inputHeight = 1080;
		while(!validInt(input))
		{
			input = JOptionPane.showInputDialog(null, "Type another goshing number.");
		}
		
		inputHeight = Integer.parseInt(input);
		commission.setHeight(inputHeight);
		
		// Pointless while zone
	
		boolean isSerious = false;
		int answered = 0;
		while(answered == 0)
		{
			input = JOptionPane.showInputDialog(null, "Is this a serious, legitimate shop? Like, where you want to actually touch up an image? If so, type 'true'. If you want a friend's eyebrows removed or something silly like that, type 'false'.");
			answered = 1;	
		}
		isSerious = Boolean.parseBoolean(input);
		commission.setSerious(isSerious);
		
		if(!commission.getSerious())
		{
			String inputRequest = "default";		
			input = JOptionPane.showInputDialog(null, "Describe the changes you'd like to have made.");
			inputRequest = input;
			commission.setRequest(inputRequest);
		}
		
		if(commission.getSerious())
		{
			String inputSeriousRequest = "default";
			input = JOptionPane.showInputDialog(null, "Describe the changes you'd like to have made to your serious image.");
			inputSeriousRequest = input;
			commission.setSeriousRequest(inputSeriousRequest);
		}
		
	
		
		
		
		JOptionPane.showMessageDialog(null, "Excellent, your request is now being processed.");
		
		
		JOptionPane.showMessageDialog(null, toString());
		
		
		
		/*
		int loading = 0;
		boolean complete = false;
		
		while(!complete)
		{
			JOptionPane.showMessageDialog(null, "Loading: " + loading + "%");
			loading += 1;
			if(loading == 100)
			{
				complete = true;
			}
		}
		*/

		JOptionPane.showMessageDialog(null, "Processing is complete. Have a [adjective] day.");

			
		
	}
	
	// This is a thing that almost makes sense, but definitely won't do anything other than break stuff. So it's commented out.
	
	/*
	public void array()
	{
		ArrayList<Requests> myRequests = new ArrayList<Requests>();
		
		Bun sampleBun = new Bun();
		Bun otherBun = new ();
		
		myBuns.add(sampleBun);
		myBuns.add(sampleBun);
		myBuns.add(otherBun);
		
		// Standard forward loop
		for (int index = 0; index < myBuns.size(); index += 1) 
		{
			
		}
		
		// Standard backward loop
		for (int index = myBuns.size() - 1; index >= 0; index -= 1)
		{
			
		}
		
		for (Bun latest : PhotoshopDesc.getRequest());
		{
			JOptionPane.showMessageDialog(null, "This bun is named " + ());
		}
		
		
	}
	*/


	
		public boolean validInt(String input)
		{
			boolean isValid = false;
			
			try
			{
				Integer.parseInt(input);
				isValid = true;
			}
			catch (NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "You fricked it up dingus. Try typing in a number. A whole number. And don't type it out, smart boy.");
			}
			
			return isValid;
		}
		
		public boolean validDouble(String mightBeDouble)
		{
			boolean isValid = false;
			
			try
			{
				Double.parseDouble(mightBeDouble);
				isValid = true;
			}
			catch (NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "Type in a dang decimal you dorito");
			}
			
			return isValid;
		}
	//}
}
