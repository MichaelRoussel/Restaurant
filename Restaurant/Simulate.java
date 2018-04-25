
/**
 * Write a description of class Simulate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class Simulate
{
    public static void main(String[] args){
        
        MenuItem burger = new MenuItem("Burger", 8.99);
        MenuItem pizza = new MenuItem("Pizza", 11.99);
        MenuItem cheesesticks = new MenuItem("Cheesesticks", 5.99);
        MenuItem spaghetti = new MenuItem("Spaghetti", 8.99);
        MenuItem fettuccini = new MenuItem("Fettuccini", 8.99);
        MenuItem tacos = new MenuItem("Tacos", 7.99);
        MenuItem salad = new MenuItem("Salad", 6.99);
        MenuItem steak = new MenuItem("Steak", 13.99);
        MenuItem nachos = new MenuItem("Nachos", 8.49);
        MenuItem salmon = new MenuItem("Salmon", 10.99);
        
        MenuItem gatorade = new MenuItem("Gatorade", 3.99);
        MenuItem pepsi = new MenuItem("Pepsi", 2.99);
        MenuItem coke = new MenuItem("Coke", 2.99);
        MenuItem icedTea = new MenuItem("Iced tea", 2.99);
        MenuItem juice = new MenuItem("Juice", 2.99);
        MenuItem sprite = new MenuItem("Sprite", 2.99);
        MenuItem fanta = new MenuItem("Fanta", 2.99);
        
        MenuItem chocolateCake = new MenuItem("Chocolate Cake", 5.99);
        MenuItem iceCream = new MenuItem("Ice Cream", 3.99);
        MenuItem cheesecake = new MenuItem("Cheesecake", 5.99);
        MenuItem brownie = new MenuItem("Brownie", 3.99);
        MenuItem pie = new MenuItem("Pie", 4.99);
        MenuItem cookie = new MenuItem("Cookie", 2.99);
        
        ArrayList<MenuItem> entreeMenu = new ArrayList<MenuItem>();
        ArrayList<MenuItem> dessertMenu = new ArrayList<MenuItem>();
        ArrayList<MenuItem> drinkMenu = new ArrayList<MenuItem>();
        
        entreeMenu.add(burger);
        entreeMenu.add(pizza);
        entreeMenu.add(cheesesticks);
        entreeMenu.add(spaghetti);
        entreeMenu.add(fettuccini);
        entreeMenu.add(tacos);
        entreeMenu.add(salad);
        entreeMenu.add(steak);
        entreeMenu.add(nachos);
        entreeMenu.add(salmon);
        
        drinkMenu.add(gatorade);
        drinkMenu.add(pepsi);
        drinkMenu.add(coke);
        drinkMenu.add(icedTea);
        drinkMenu.add(juice);
        drinkMenu.add(sprite);
        drinkMenu.add(fanta);
        
        dessertMenu.add(chocolateCake);
        dessertMenu.add(iceCream);
        dessertMenu.add(cheesecake);
        dessertMenu.add(brownie);
        dessertMenu.add(pie);
        dessertMenu.add(cookie);
        
    }
}
