public class Main {

    public static void main(String[] args) {

        Car porsche = new Car(); //we've created an object called Porsche based on the template, Car
        Car toyota = new Car();

//        toyota.model = "Supra"; //or:
        toyota.setModel("Supra"); //this is a way of calling a set model for our object and updating it with the value of "Supra"


        System.out.println("Model is " + toyota.getModel());






    }


}
