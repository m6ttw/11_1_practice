public class GuitarShop {
    private String name;
    private int till;
    private String stock [];

    public GuitarShop(String name, int till){
        this.name = name;
        this.till = till;
        this.stock = new String[]{};
    }

    public String getName() {
        return this.name;
    }

    public int getTill() {
        return this.till;
    }

    public String[] getStock(){
        return this.stock;
    }
}
