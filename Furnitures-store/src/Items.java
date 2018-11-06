import java.time.LocalDate;
import java.util.ArrayList;



public class Items {
    private String brand;
    private ItemType itemType;
    private LocalDate  releaseDay;
    private int price;
    private String madeIn;
    private double weight;
    private double lenght;
    private double width;
    private ArrayList<String> specialSigns = new ArrayList<>();
    public Items( ItemType itemType,LocalDate releaseDay, int price, double weight, double width,double lenght){
        this.itemType=itemType;
        this.releaseDay= releaseDay;
        this.price= price;
        this.weight= weight;
        this.width= width;
        this.lenght= lenght;
    }
    public Items(){}

    public void setBrand(String brand){this.brand=brand;}
    public String getBrand(){return this.brand;}


    public void setMadeIn(String madeIn)
    {this.madeIn=madeIn;}
    public String getMadeIn()
    {return this.madeIn;}


    public ItemType getItemType(){return itemType;}

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getWidht() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public LocalDate getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(LocalDate releaseDay) {
        this.releaseDay = releaseDay;
    }









    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public ArrayList<String> getSpecialSigns() {
        return specialSigns;
    }

    public void addSpecialSign(String specialSign) {

        this.specialSigns.add(specialSign);
    }
    public String toString(){
        String sSigns = "";
        for(String sign : this.specialSigns){
            sSigns = sSigns + sign + ",";
        }

        return "Brand:" + this.brand
                +"\nFurnitures type:" + this.itemType.getTypeName()
                +"\nReleaseDay:" + this.releaseDay
                +"\nPrice:" + this.price +"$"
                +"\nMade In:" + this.madeIn
                +"\nLength" + this.lenght
                +"\nWeight:" + this.weight
                +"\nWidth:" + this.width
                +"\nSpecial signs:" + sSigns;
    }


}
