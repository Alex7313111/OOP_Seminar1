package less1.practice;
import java.util.List;

import less1.practice.impl.*;

import java.time.LocalDate;
import java.util.*;


import static java.util.List.*;

public class ProductMain {

    public static void main(String[] args) {
        Product hot_glassful1 = new HotDrink("tea", 520, LocalDate.of(2024, 8, 2),
         0.35F, 75);
        Product hot_glassful2 = new HotDrink("cofee", 87, LocalDate.of(2024, 3, 4),
                 0.35F, 70);

        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 8));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 11, 25),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();


        VendingMachine vm1 = new HotDrinkVM();

        System.out.println(vm.getProducts());

        List<Product> anotherList = Arrays.asList(bottle1,bottle1,bottle1,bottle2,bottle2,bottle2);
        vm.addProducts(anotherList);

        //vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        vm1.addProducts(new ArrayList<>());

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");


        System.out.println(vm.getProducts());

        HotDrinkVM hd1 = new HotDrinkVM();
        List<Product> anotherListHD = Arrays.asList(hot_glassful1,hot_glassful1,hot_glassful2,
                hot_glassful2,hot_glassful2,hot_glassful2);
        hd1.addProducts(anotherListHD);

        System.out.println(hd1.getProducts());

        System.out.println( hd1.getProduct("tea", 0.35F, 70));
    }
}
