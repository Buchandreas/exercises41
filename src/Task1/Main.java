package Task1;

public class Main {
    public static void main(String args[]){
        Driver driver1 = new Driver("Andreas", 23);
        Car car1 = new Car("Volkswagen", "Polo 1.2 90HK", 2012, "Factory");
        car1.setDriver(driver1.toString());

        System.out.println(car1.toString());
        System.out.println(driver1.toString());

        Car car2 = new Car("Tesla", "Model S P85D", 2015, "Factory");
        car2.setDriver(driver1.toString());

        System.out.println(car2.toString());
        System.out.println(car2.getDriver());
    }
}
