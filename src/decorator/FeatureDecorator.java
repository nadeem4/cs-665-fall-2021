package decorator;

public abstract class FeatureDecorator extends Car {
	Car car; // HAS-A

	public abstract String getDescription();
	public abstract double getCost();

}
