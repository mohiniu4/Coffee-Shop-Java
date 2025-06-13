
abstract class BeverageDecorator extends Beverage {

	protected Beverage BeverageDecorator;
	
	public BeverageDecorator (Beverage beverage) {
		this.BeverageDecorator = beverage; 
	}
	
}
