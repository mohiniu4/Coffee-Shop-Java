
public class CoffeeShop {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to our CoffeeShop!");
		System.out.println("Currently, we can serve you Americano for 3.00, Cappuccino for 5.00, and an Espresso for 4.00");
		System.out.println("To add the following in your drink it will cost you");
		System.out.println("Carmael - 1.0");
		System.out.println("Milk - 2.0");
		System.out.println("Syrup - 3.0");
		
		// Americano with extra milk
		Beverage drink1 = new Americano();
		
		drink1 = new Milk(drink1);
		
		System.out.println("Desciption: " + drink1.getDescription());
		System.out.println("Cost: " + drink1.getPrice());
		
		// Espresso with caramel and syrup
		Beverage drink2 = new Espresso();
				
		drink2 = new Caramel(drink2);
		drink2 = new Syrup(drink2);

				
		System.out.println("Desciption: " + drink2.getDescription());
		System.out.println("Cost: " + drink2.getPrice());
		
		// Espresso with caramel and syrup
		Beverage drink3 = new Cappuccino();
						
		drink3 = new Milk(drink3);
		drink3 = new Syrup(drink3);
		drink3 = new Caramel(drink3);
						
		System.out.println("Desciption: " + drink3.getDescription());
		System.out.println("Cost: " + drink3.getPrice());
		
		// Espresso
		Beverage drink4 = new Espresso();
		
		System.out.println("Desciption: " + drink4.getDescription());
		System.out.println("Cost: " + drink4.getPrice());	
		
		// Espresso with caramel and syrup
				Beverage drink5 = new Cappuccino();
								
				drink5 = new Milk(drink5);
				drink5 = new Syrup(drink5);
				drink5 = new Caramel(drink5);
				drink5 = new ChocolateSyrup(drink5);
								
				System.out.println("Desciption: " + drink5.getDescription());
				System.out.println("Cost: " + drink5.getPrice());		
	}

}
