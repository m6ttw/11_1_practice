public class Guitar {
    private String make;
    private String model;
    private double price;

    public Guitar(String make, String model, double price){
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake(){
        return this.make;
    }

}
