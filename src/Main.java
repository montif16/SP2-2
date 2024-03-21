public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet1 = new FleetOfCars();

        Car car1 = new GasolinCar("AB 123456","Tesla","TotallyNotFake",4,"Gasolin",21);
        Car car2 = new DieselCar("AC 654321","Porche","Something",2,"Diesel",1,true);
        Car car3 = new ElectricCar("TY 098765","Tesla","S",8,75,500);
        fleet1.addCar(car1);
        fleet1.addCar(car2);
        fleet1.addCar(car3);

        System.out.println(fleet1.toString());
        System.out.println("Total fleet fee: "+fleet1.getTotalRegistrationFeeForFleet());

        //System.out.println(car1.getRegistrationFee());
        //System.out.println(car3.getRegistrationFee());

    }
}
