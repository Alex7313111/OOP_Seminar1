package less1.practice.impl;

import java.util.ArrayList;
import java.util.List;

import less1.practice.Product;
import less1.practice.VendingMachine;

public class HotDrinkVM extends VendingMachine {

    protected List<HotDrink> drinks;

 public HotDrinkVM (List<HotDrink> drinks){
     this.drinks = drinks;
 }
    public HotDrinkVM() {
        this.drinks = new ArrayList<>();
    }

    @Override
    public HotDrink getProduct(String name, float volume, int temperature) {
        for (HotDrink drinkers : drinks) {
            if (drinkers.getName().equals(name)){
                if (drinkers.getVolume()==volume){
                    if (drinkers.getTemp()==temperature) {
                        drinks.remove(drinkers);
                        return drinkers;

                        }
                    }
                }


        }

        System.out.println("No such product: " + name);
        return null;
 }





}
