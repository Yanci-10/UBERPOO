class main{

    public static void main(String[]
    args) {
        System.out.println
        ("Inicializando...");
        System.out.printl("car...");
        Car car = new Car("AMQ123", new 
        Account ("andres loiza", "ADN1235", "andresl@hotmail.com", "12345"));
         car.passenger = 4;
         car.printDatarCar();

         System.out.println("Uberx...");
         UberX uberx = new Uberx
         ("MKL185", new Account("Maria loyola", "jkl12365", "marial@hotmail.com", "125478"), "Toyota", "Corola");
    }
}