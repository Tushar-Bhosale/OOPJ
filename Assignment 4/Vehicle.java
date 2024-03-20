package assignment4;

public class Vehicle {
	
	public void vehic(String name, int price) 
	{
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
	}
	public void vehic(String color, String tyre) 
	{
		System.out.println("Color: " + color);
		System.out.println("Tyre: " + tyre );
	}
	public static void main(String[] args)
	{
		Vehicle veh = new Vehicle();
		veh.vehic("Audi", 2500000);
		veh.vehic("Black", "MRF");
		
				
	}
}