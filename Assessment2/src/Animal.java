/*
    SENG6110 Trimester 1 2020
    Suggested start for Assignment 2
    
    Written by Dr William Chivers
    Modified by: Sayeed Bin Hossain (ID:3340471)
*/

public class Animal
{
    private String animalName;   // the name of the animal
    private String continent;    // the continent where the animal is found
    private String habitat;      // the habitat type
    
  
    // constructor with parameters
    Animal(String name, String contin, String hab) {
        animalName = name;
        continent  = contin;
        habitat    = hab;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // getter methods
    public String getName(){
        return animalName;
    }
    public String getContinent(){
        return continent;
    }
    public String getHabitat(){
        return habitat;
    }
    
    // toString - use this for printing
    public String toString() {
        String animalInfo = "Animal_Name: " + getName() + ", Continent: " + getContinent() + ", Habitat: " + getHabitat();
        return animalInfo;
    }

}
