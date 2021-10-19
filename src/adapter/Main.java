package adapter;

/**
 * This is the Client
 * <p>
 * Example: Use a USB cable to charge phone in a car (normally works via computer, but
 * we'd like to use it in the car)
 * <p>
 * The common patterns are:
 * 1 - Adapter - making 2 interfaces that are not compatible compatible (aka wrapper object)
 * 2 - Decorator - adds behavior without changing the  underlying object
 * 3 - Facade - taking a complex set of interactions and creating a facade instead
 * 4 - Proxy - placing an object between the client and the real object
 * <p>
 * The intention of the adapter pattern is NOT to add new behavior.  It is simply to
 * re-wire the request. Altering behavior is something else (decorator).
 */
public class Main {
  public static void main(String[] args) {
    // USB charger (the common way to charge) via computer
    UsbCharger myComputerCharger = new ComputerCharger(); // where I plug USB compatible gadgets in computer
    myComputerCharger.charge();

    // cigarette lighter in my Ferrari (the new way to charge)
    CigaretteLighterCharger myCigaretteLighter = new FerrariCharger(); // <-- adaptee
    // where I plug cigarette compatible gadgets in car

    // ordered a phone charger for my car (from Amazon) <-- adapter
    UsbCharger myCarCharger = new UsbToCigaretteLighterAdapter(myCigaretteLighter);

    myCarCharger.charge(); // <-- This is the API that we are used to (as line 22 above)
  }
}

