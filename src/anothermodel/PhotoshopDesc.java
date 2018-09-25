package anothermodel;

import javax.swing.JOptionPane;

public class PhotoshopDesc
{
	private int height;
	private int width;
	//private String target;
	private boolean serious;
	private String seriousRequest;
	private String request; 
	//private boolean face;
	
	
	
	
	
	
	/**
	 * Default constructor for a PhotosopDesc
	 * Initializes all values to valid but not really useful values
	 * Used for later customization.
	 */
	
	
	
	public PhotoshopDesc()
	{
	
		
	}
	
	/**
	 * Initializes PhotoshopDesc but with actual info
	 * @param height The height of the final image, in pixels
	 * @param width The width of the final image, in pixels
	 * @param request A description of the changes to be made
	 */
	
	
	public PhotoshopDesc(int width, int height, boolean serious, String seriousRequest, String request)
	{	
		this.width = width;
		this.height = height;
		this.serious = serious;
		this.seriousRequest = seriousRequest;
		this.request = request;
	}
	
	
	
	
	//    Welcome to getter village
	

	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}	
	
	public boolean getSerious()
	{
		return serious;
	}
	
	public String getSeriousRequest()
	{
		return seriousRequest;
	}
	
	public String getRequest()
	{
		return request;
	}
	
	
	
	
	
	
	//    Now entering the setterscape
	
	public void setWidth(int width)
	{
		this.width = width;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}
	
	
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
