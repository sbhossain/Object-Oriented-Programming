/*
    SENG6110 Trimester 1 2020
    Suggested start for Assignment 2
    
    Written by Dr William Chivers
    Modified by: Sayeed Bin Hossain (ID:3340471)
*/

import java.util.*;

public class Family
{

    static Scanner console = new Scanner(System.in);
    
    private String familyName;           // the scientific name of the family
    private String commonName;           // the common name of the family
    private String diet;                 // the diet type
    
    private Animal[] animal;             // an array of Animal objects contained in this Family object
    
    private static int MAX_ANIMALS     = 3;  // the max number of animals in a family.
    private int next_free_index = 0;  // track the logical size of the Animal array
    
    // constructor with parameters
    Family(String coName, String scName, String dt) {
        familyName = coName;
        commonName = scName;
        diet       = dt;
    }
    
    public void addAnimal(String animalName, String continent, String habitat) {

        if(animal==null){
            animal = new Animal[MAX_ANIMALS];
        }

        if (next_free_index < MAX_ANIMALS){
            animal[next_free_index] = new Animal(animalName, continent, habitat);
            next_free_index++;

            System.out.println("Animal "+animalName+ " Added Successfully");
        }

        else {
            System.out.println("Maximum Animal Reached!");
        }

    }
    
    // getter methods
    public String getScName(){
        return familyName;
    }
    public String getCoName(){
        return commonName;
    }
    public String getDiet(){
        return diet;
    }
    public Animal[] getAnimal() {
        return animal;
    }
    public int getNext_free_index() {
        return next_free_index;
    }

    public  void setNext_free_index(int next_free_index) {
        this.next_free_index = next_free_index;
    }

    // toString - use this for printing
    public String toString() {
        String familyInfo = "Family_Name: " + getScName() + ", Common_Name: " + getCoName() + ", Diet: " + getDiet();
        return familyInfo;
    }   

}



