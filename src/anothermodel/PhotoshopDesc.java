package anothermodel;

import javax.swing.JOptionPane;
import java.util.ArrayList;



public class PhotoshopDesc
{
	private int height;
	private int width;
	private boolean serious;
	private String seriousRequest;
	private String request; 

	
	
	
	
	/**
	 * Default constructor for a PhotosopDesc
	 * Initializes all values to valid but not really useful values.
	 * Used for later customization.
	 */
	public PhotoshopDesc()
	{
	
		
	}
	
	
	/*	
	public ArrayList<butts> = new ArrayList <butts>();
	{
		
	}
 	*/	
	
	
	/**
	 * Initializes PhotoshopDesc, but with actual info.
	 * @param height The height of the final image, in pixels.
	 * @param width The width of the final image, in pixels.
	 * @param serious Whether or not the request is serious.
	 * @param request A description of the changes to be made.
	 */
	public PhotoshopDesc(int width, int height, boolean serious, String seriousRequest, String request)
	{	
		this.width = width;
		this.height = height;
		this.serious = serious;
		this.seriousRequest = seriousRequest;
		this.request = request;
	}
	
	
	
	public String toString()
	{
		String desc = "Here is your request ";
		if(serious == false)
		{
			desc += " Your request was 'Non-serious' ";
			desc += " Request: '" + request + "' ";
			desc += " Width: " + width;
			desc += " Height: " + height;
		}
		if(serious == true)
		{
			desc += " Your request was 'Serious' ";
			desc += " Request: '" + seriousRequest + "'";
			desc += " Width: " + width;
			desc += " Height: " + height;
		}
		return desc;
	}
	
	
	//    Welcome to getter village
	
	/**
	 * @return The width of the image.
	 */
	public int getWidth()
	{
		return width;
	}
	
	/**
	 * 
	 * @return The height of the image.
	 */
	public int getHeight()
	{
		return height;
	}	
	
	/**
	 * 
	 * @return Whether the request is serious or not.
	 */
	public boolean getSerious()
	{
		return serious;
	}
	
	/**
	 * 
	 * @return The serious variant of the request.
	 */
	public String getSeriousRequest()
	{
		return seriousRequest;
	}
	
	/**
	 * 
	 * @return The request itself.
	 */
	public String getRequest()
	{
		return request;
	}
	
	
	
	
	
	
	//    Now entering the setterscape
	
	/**
	 * 
	 * @param width The width of the image.
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}

	/**
	 * 
	 * @param height The height of the image.
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	/**
	 * 
	 * @param request The request itself.
	 */
	public void setRequest(String request)
	{
		this.request = request;
	}
	
	public void setSerious(boolean serious)
	{
		this.serious = serious;
	}
	
	public void setSeriousRequest(String seriousRequest)
	{
		this.seriousRequest = seriousRequest;
	}
	
}
