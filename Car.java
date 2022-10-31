import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("supra")) {
        this.model = model;
        } else {
            this.model = "Unknown";//Updating the model using a method instead of trying to access it directly
        }
    }

    public String getModel() {
        return this.model; //this will return what the current set model is
    }


}
