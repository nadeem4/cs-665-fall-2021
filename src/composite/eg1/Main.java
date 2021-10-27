package composite.eg1;

public class Main {

  public static void main(String[] args) {
    Car car1 = new Honda();
    Car edsCar = new Lambo();
    Car car3 = new Ferrari();

    MyCar containerOfCars = new MyCar();

    containerOfCars.add(car1);
    containerOfCars.add(edsCar);
    containerOfCars.add(car3);

    containerOfCars.print();

    edsCar.print();

  }

}
