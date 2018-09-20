package anothermodel;

public class PhotoshopDesc
{
	private String target;
	private int length;
	private int width;
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
	 * @param target The thing to be photoshopped
	 * @param lenght The length of the final image, in pixels
	 * @param width The width of the final image, in pixels
	 * @param request A description of the changes to be made
	 * @param face Whether or not the target is someone's face
	 */
	
	
	public PhotoshopDesc(String target, int length, int width, String request)
	{
		this.target = target;
		this.length = length;
		this.width = width;
		this.request = request;
		//this.face = face;
				
	}
	
	
	
	
	//    Welcome to getter village
	
	public String getTarget()
	{
		return target;
	}
	
	public int getLenght()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public String request()
	{
		return request;
	}
	
	
	
	
	
	//    Now entering the setterscape
	
	public void setTarget(String target)
	{
		this.target = target;
	}
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setRequest(String request)
	{
		this.request = request;
	}
	
	
}
