public class Guitar {
    private String make;
    private String model;
    public int price;

    public Guitar(String make, String model, int price){
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getPrice(){
        return this.price;
    }
}
