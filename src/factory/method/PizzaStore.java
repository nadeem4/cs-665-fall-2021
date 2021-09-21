package factory.method;

public abstract class PizzaStore {
    abstract Pizza createPizza(String type); // This is the factory method!

    Pizza orderPizza(String type) {
        System.out.println("ordering is the same for all pizza stores...");
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.cook();
        return pizza;
    }
}
