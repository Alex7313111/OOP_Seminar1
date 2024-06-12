package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class HotDrink extends Product {
    int temp;
    float volume;
     public HotDrink(String name, double price, LocalDate releaseDate, float volume, int temp){
         super(name, price, releaseDate);
         this.volume = volume;
         this.temp = temp;
     }


    public float getVolume() {
        return volume;
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
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                "temp" + temp +
                '}';
    }
}
