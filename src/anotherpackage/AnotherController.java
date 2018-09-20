package anotherpackage;
import anothermodel.PhotoshopDesc;

/**
 * Now you have gui, you're welcome
 */
import javax.swing.JOptionPane;



public class AnotherController
{
	
	private PhotoshopDesc request;
	
	public AnotherController()
	{
		request = new PhotoshopDesc();
	}
	
	
	
	public void start()
	{
		String input = JOptionPane.showInputDialog(null, "What is the width, in pixels, of your image?");
		int inputWidth = 1920;
		if(validInt(input))
		{
			inputWidth = Integer.parseInt(input);
		}
		request.setWidth(inputWidth);
		
		input = JOptionPane.showInputDialog(null, "And what is the height of your image, in pixels?");
		int inputHeight = 1080;
		if(validInt(input))
		{
			inputHeight = Integer.parseInt(input);
		}
		
				
		input = JOptionPane.showInputDialog(null, "Describe the changes you want made.");
		
		
	}
	
	
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
	
	
	

}
