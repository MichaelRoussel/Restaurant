
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Employee
{
    // instance variables - replace the example below with your own
    private final int idNum;
    private String firstName;
    private String lastName;
    private String role;
    Scanner in = new Scanner(System.in);
    
    public Employee(int idNum, String role){
        this(idNum, "","", role);
    }
    
    public Employee(int idNum, String firstName, String lastName, String role){
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
    
    public void setName(){
        System.out.println("Please enter your first then last name: ");
        firstName = in.next();
        lastName = in.next();
        System.out.println("Your name is now " + firstName + lastName);
    }
    
    public String getRole(){
        return role;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
    
    public int getID(){
        return idNum;
    }
}

    
