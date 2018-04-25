
/**
 * Write a description of class MenuItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;


public class MenuItem
{
    private String itemType;
    private double price;
    Scanner in = new Scanner(System.in);
    
    
    public MenuItem(String itemType, double price){
        this.itemType = itemType;
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(){
        System.out.println("Please enter the new price: ");
        try{
            price = in.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a decimal number.");
            System.out.println(in.next() + " was not a valid input.");
        }
    }
    
    public String getType(){
        return itemType;
    }
}
