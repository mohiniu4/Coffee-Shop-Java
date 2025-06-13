
public class ChocolateSyrup extends BeverageDecorator{
	public ChocolateSyrup(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return BeverageDecorator.getDescription() + " extra Chocolate";
	}
	
	public double getPrice() {
		return BeverageDecorator.getPrice() + 1.00;
	}
}
