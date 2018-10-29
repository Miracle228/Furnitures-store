import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {

    public static void main(String args[]){

        //# Creating an ArrayList and adding new elements to it
        System.out.println("========= # Creating an ArrayList and adding new elements to it");

        ArrayList<Items> items = new ArrayList<>();

        // Adding new elements to the ArrayList
       Items officeChair = new Items();
       officeChair.setBrand("DS");
       officeChair.setMadeIn("Italy");
       ItemType chair = new ItemType("officeChair");
       officeChair.setItemType(chair);
       LocalDate officeChairReleaseDay = LocalDate.of(2017,1,12);
       officeChair.setReleaseDay(officeChairReleaseDay);
       officeChair.setLenght(23.2);
       officeChair.setWeight(12);
       officeChair.setWidth(3);
       officeChair.addSpecialSign("old");
       officeChair.addSpecialSign("rare");
       System.out.println(officeChair);





       Items mirror = new Items();
        mirror.setBrand("DS");
        mirror.setMadeIn("USA");
        ItemType mirrors = new ItemType("BigMirror");
        mirror.setItemType(chair);
        LocalDate mirrorReleaseDay = LocalDate.of(2017,1,12);
        mirror.setReleaseDay(mirrorReleaseDay);
        mirror.setLenght(23.2);
        mirror.setWeight(4);
        mirror.setWidth(3);
        mirror.addSpecialSign("old");
        mirror.addSpecialSign("rare");
        System.out.println(mirror);




        Items tablelamp = new Items();
        tablelamp.setBrand("DS");
        tablelamp.setMadeIn("USA");
        ItemType lamp = new ItemType("BigMirror");
        tablelamp.setItemType(lamp);
        LocalDate lampReleaseDay = LocalDate.of(2017,1,12);
        tablelamp.setReleaseDay(lampReleaseDay);
        tablelamp.setLenght(23.2);
        tablelamp.setWeight(4);
        tablelamp.setWidth(3);
        tablelamp.addSpecialSign("old");
        tablelamp.addSpecialSign("rare");
        System.out.println(tablelamp);













        items.add(officeChair);
        items.add(mirror);
        items.add(tablelamp);

        //#Accessing elements from an ArrayList
        System.out.println("========= #Accessing elements from an ArrayList");
        System.out.println("First mebel: " + items.get(0));
        System.out.println("Second mebel: " + items.get(1));
        System.out.println("Last mebel: " + items.get(items.size()-1));

        //#Removing elements from an ArrayList
        System.out.println("========= #Removing elements from an ArrayList");
        items.remove(2);
        System.out.println("Mebel size: " + items.size());

        //#Iterating over an ArrayList
        System.out.println("========= #Iterating over an ArrayList");
        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        //#Sort an ArrayList of Objects using custom Comparator
        System.out.println("========= #Sort an ArrayList of Objects using custom Comparator");
        items.sort(new Comparator<Items>() {
            @Override
            public int compare(Items mebel1, Items mebel2) {
                double mebel1Weight = mebel1.getWeight();
                double mebel2Weight = mebel2.getWeight();
                return (int)((mebel1Weight - mebel1Weight)*100);
            }
        });

        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }


    }

}
