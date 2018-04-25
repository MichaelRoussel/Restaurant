
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Menu

{
    Scanner in = new Scanner(System.in);   
        
    public void printEntrees(){  
        System.out.println("The entrees are: ");
        for (MenuItem i : entreeMenu){
            System.out.println(i.getType() + " $" + i.getPrice());
        }
    }
    
    public void printDrinks(){
        System.out.println("The drinks are: ");
        for (MenuItem i : drinkMenu){
            System.out.println(i.getType() + " $" + i.getPrice());
        }
    }
    
    public void printDesserts(){
        System.out.println("The desserts are: ");
        for (MenuItem i : dessertMenu){
            System.out.println(i.getType() + " $" + i.getPrice());
        }
    }
}
