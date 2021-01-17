public class Dealership {

    public static void main(String[] args){

        Vehicle vehicle1 = new Vehicle("Honda", "Accord", 15000);
        Vehicle vehicle2 = new Vehicle("BMW", "M3", 20000);
        Vehicle vehicle3 = new Vehicle("BMW", "M3", 20000);

        Employee employee1 = new Employee();

        Customer customer1 = new Customer("Tom", "St.Queens 1", 25000);

        customer1.purchaseCar(vehicle1, employee1, false);

        boolean value = vehicle2.equals(vehicle3);
        System.out.println(value);

    }
}
