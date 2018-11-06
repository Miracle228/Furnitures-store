import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Double;

public class Main2 {

    public static void main(String args[]){

        ArrayList<Items> items = new ArrayList<>();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try{
            Scanner input = new Scanner(new File("\\Furnitures-store\\src\\input.txt"));

            while(input.hasNextLine()){
                String line;
                Items items1 = new Items();

                line = input.nextLine();

                try{
                    Scanner data = new Scanner(line);
                    if(data.hasNext()){
                        String name = data.next().trim();
                        items1.setBrand(name);
                    }

                    if(data.hasNext()){
                        ItemType itemType = new ItemType();
                        itemType.setTypeName(data.next().trim());
                        items1.setItemType(itemType);
                    }

                    if(data.hasNext()){
                        LocalDate releaseDate = LocalDate.parse(data.next(), f);
                        items1.setReleaseDay(releaseDate);
                    }

                    if(data.hasNextInt()){
                        int price = data.nextInt();
                        items1.setPrice(price);
                    }

                    if(data.hasNext()){
                        String madeIn = data.next().trim();
                        items1.setMadeIn(madeIn);
                    }

                    if(data.hasNext()){
                        double weight = Double.parseDouble(data.next());
                        items1.setWeight(weight);
                    }
                    if(data.hasNext()){
                        double length = Double.parseDouble(data.next());
                        items1.setLenght(length);
                    }
                    if(data.hasNext()){
                        double width = Double.parseDouble(data.next());
                        items1.setWidth(width);
                    }

                    if(data.hasNext()){
                        String signs = data.next();
                        for(int i = 0; i < signs.split(",").length; i++){
                            items1.addSpecialSign(signs.split(",")[i]);
                        }
                    }

                }catch(Exception e){
                    System.out.println(e);
                }

                items.add(items1);

            }

        }catch(IOException e){
            System.out.println(e);
        }

        for(int i = 0; i < items.size(); i++) {
            System.out.println("#================================");
            System.out.println(items.get(i));
        }

        try{
            File file = new File("output.txt");
            PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));

            for(int i = 0; i < items.size(); i++) {
                pw.append("\n" + items.get(i).getBrand());
            }

            pw.close();

        }catch(Exception e){

        }

    }
}