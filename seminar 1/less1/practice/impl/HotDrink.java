package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class HotDrink extends BottleOfWater {
    int temp;
     public HotDrink(String name, double price, LocalDate releaseDate,boolean spark, String pack, float volume, int temp){
         super(name, price, releaseDate, spark, pack, volume);
         this.temp = temp;
     }




    public String getName() {
        return super.getName();
    }


    public double getPrice() {
        return super.getPrice();
    }

    public int getTemp() {
        return temp;
    }
}
