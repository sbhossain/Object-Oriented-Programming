/*
    SENG6110 Trimester 1 2020
    Suggested start for Assignment 2
    
    Written by Dr William Chivers
    Modified by: Sayeed Bin Hossain (ID:3340471)
*/

import java.util.*;
import java.io.*;

public class Interface {

    // Declare variables to be used by any method
    public static Scanner console = new Scanner(System.in);

    public static Family[] family;           // the array to hold the Family objects

    private static int MAX_FAMILIES = 5;  // the max number of animals in a family
    private static int next_free_index = 0;  // track the logical size of the Family array


    // main() method
    public static void main(String[] args) {
        display_menu();
    }


    // Display the menu, read input and call appropriate method
    public static void display_menu() {

        int choice = 0;

        while (choice != 99) {

            System.out.println(); // print blank line
            System.out.println("-----------------------------------------------------");
            System.out.println("Make a choice: ");
            System.out.println(" 1. Add a Family");
            System.out.println(" 2. Add an Animal object to one of the Family objects");
            System.out.println(" 3. Delete a Family.");
            System.out.println(" 4. Delete an Animal");
            System.out.println(" 5. List of all objects");
            System.out.println(" 6. List of animals that belong a family");
            System.out.println(" 7. List animals living on the same continent");
            System.out.println(" 8. List animals with the same diet");
            System.out.println(" 9. Import family and animal information from a file");
            System.out.println("10. Write family and animal information to file");
            System.out.println("11. List of all Family");

            System.out.println("99. Exit");
            System.out.println("-----------------------------------------------------");
            System.out.println(); // print blank line

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (Exception e) {
                System.out.println("Please enter a valid input!");
            }

            switch (choice) {
                case 1:
                    // Option 01: Add a Family
                    add_a_Family();
                    break;
                case 2:
                    // Option 02: Add an Animal object to one of the Family objects
                    add_an_Animal();
                    break;
                case 3:
                    // Option 03: Delete a Family
                    delete_a_Family();
                    break;
                case 4:
                    // Option 04: Delete an Animal
                    delete_an_Animal();
                    break;
                case 5:
                    // Option 05: List of all objects
                    list_all_objects();
                    break;
                case 6:
                    // Option 06: List of animals that belong a family
                    list_animals_in_a_family();
                    break;
                case 7:
                    // Option 07: List animals living on the same continent
                    list_animals_on_same_continent();
                    break;
                case 8:
                    // Option 08: List animals with the same diet
                    list_animals_with_same_diet();
                    break;
                case 9:
                    // Option 09: Import family and animal information from a file
                    import_from_file();
                    break;
                case 10:
                    // Option 10: Write family and animal information to file
                    write_to_file();
                    break;
                case 11:
                    // Option 10: Write family and animal information to file
                    list_all_family();
                    break;
                case 99:
                    // Option 99: Exit 
                    System.exit(0);
                default:
                    // The user input an unexpected choice
                    System.out.println("Incorrect input, please try again: ");
            }
        } // end while loop
    } // end display_menu() method


    // Option 01: Add a Family
    public static void add_a_Family() {

        try {
            System.out.println("Enter Family Name");
            String familyName = console.nextLine();
            familyName = familyName.toLowerCase();
            familyName = capitalize(familyName);

            if (!familyNameAlreadyExists(familyName)) {
                System.out.println("Enter Common Name");
                String commonName = console.nextLine();
                commonName = commonName.toLowerCase();
                commonName = capitalize(commonName);

                System.out.println("Enter Diet");
                String diet = console.nextLine();
                diet = diet.toLowerCase();
                diet = capitalize(diet);

                if (next_free_index < MAX_FAMILIES) {
                    if (family == null) {
                        family = new Family[MAX_FAMILIES];
                    }
                    family[next_free_index] = new Family(familyName, commonName, diet);
                    next_free_index++;
                    System.out.println("Family: " + familyName + " Successfully Added");
                } else {
                    System.out.println("Maximum Family Reached!");
                }
            } else {
                System.out.println("Family Already Exists!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Option 02: Add an Animal object to one of the Family objects
    public static void add_an_Animal() {
        try {
            System.out.println("Enter Family Name");
            String familyName = console.nextLine();
            familyName = familyName.toLowerCase();
            familyName = capitalize(familyName);

            if (familyNameAlreadyExists(familyName)) {
                System.out.println("Enter Animal Name");
                String animalName = console.nextLine();
                animalName = animalName.toLowerCase();
                animalName = capitalize(animalName);

                int index = getFamilyNameLocation(familyName);

                if (!animalNameAlreadyExists(animalName, index)) {
                    System.out.println("Enter Continent");
                    String continent = console.nextLine();
                    continent = continent.toLowerCase();
                    continent = capitalize(continent);

                    System.out.println("Enter Habitat");
                    String habitat = console.nextLine();
                    habitat = habitat.toLowerCase();
                    habitat = capitalize(habitat);

                    family[index].addAnimal(animalName, continent, habitat);

                } else {
                    System.out.println("Animal Already Exists!");
                }
            } else {
                System.out.println("Animal Family Doesn't Exists!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // Option 03: Delete a Family
    public static void delete_a_Family() {
        System.out.println("Delete a Family ...");

        try {
            System.out.println("Enter Family Name");
            String familyName = console.nextLine();
            familyName = familyName.toLowerCase();
            familyName = capitalize(familyName);

            if (familyNameAlreadyExists(familyName)) {
                int index = getFamilyNameLocation(familyName);
                for (int i = index + 1; i < next_free_index; i++) {
                    family[i - 1] = family[i];
                }
                family[next_free_index - 1] = null;
                next_free_index--;
                System.out.println("Family: " + familyName + " Deleted Successfully!");
            } else {
                System.out.println("Family Doesn't Exists!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // Option 04: Delete an Animal

    public static void delete_an_Animal() {
        System.out.println("Delete an Animal ...");
        try {
            System.out.println("Enter Animal Name");
            String animalName = console.nextLine();
            animalName = animalName.toLowerCase();
            animalName = capitalize(animalName);

            if (next_free_index == 0) {
                System.out.println("No Animal exist");
            } else {
                int indexI = -1;
                int indexj = -1;
                for (int i = 0; i < next_free_index; i++) {
                    Animal a[] = family[i].getAnimal();
                    for (int j = 0; j < family[i].getNext_free_index(); j++) {
                        if (a[j].getName().equals(animalName)) {
                            indexI = i;
                            indexj = j;
                            a[j] = null;
                            family[i].setNext_free_index(family[i].getNext_free_index() - 1);
                            System.out.println("Animal: " + animalName + " deleted Successfully!");
                            break;
                        }
                    }
                }

                if (indexI != -1 && indexj != -1) {
                    Animal a[] = family[indexI].getAnimal();
                    for (int j = indexj + 1; j < family[indexI].getNext_free_index(); j++) {
                        a[j - 1] = a[j];
                    }
                } else {
                    System.out.println("Animal Doesn't Exist");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // Option 05: List of all objects
    public static void list_all_objects() {
        System.out.println("List of all objects:");
        try{
            if (next_free_index == 0) {
                System.out.println("No family objects exist");
            } else {
                sortFamily();
                sortFamily();
                for (int i = 0; i < next_free_index; i++) {
                    Animal a[] = family[i].getAnimal();
                    int animalIndex = family[i].getNext_free_index();
                    if (animalIndex!=0 && family[i].getAnimal()!=null){
                        for (int j = 0; j < animalIndex; j++) {
                            if (a[j]!=null){
                                System.out.println("FAMILY "+ family[i].getScName()+" "+family[i].getCoName()+" "+family[i].getDiet());
                                System.out.println("ANIMAL "+ family[i].getScName()+" "+a[j].getName()+" "+a[j].getContinent()+" "+a[j].getHabitat());
                            }
                        }
                    }
                    else{
                        System.out.println("FAMILY "+ family[i].getScName()+" "+family[i].getCoName()+" "+family[i].getDiet());
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }


    // Option 06: List of animals that belong a family
    public static void list_animals_in_a_family() {

        try {
            System.out.println("Enter Family Name");
            String familyName = console.nextLine();
            familyName = familyName.toLowerCase();
            familyName = capitalize(familyName);

            if (familyNameAlreadyExists(familyName)) {
                sortFamily();
                sortAnimal();
                int index = getFamilyNameLocation(familyName);
                if (family[index].getNext_free_index() != 0) {
                    Animal a[] = family[index].getAnimal();
                    for (int i = 0; i < family[index].getNext_free_index(); i++) {
                        System.out.println("ANIMAL "+ family[index].getScName()+" "+a[i].getName()+" "+a[i].getContinent()+" "+a[i].getHabitat());
                    }
                } else {
                    System.out.println("No animals contained in this family.");
                }
            } else {
                System.out.println("Family Name Doesn't Exists");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // Option 07: List animals living on the same continent
    public static void list_animals_on_same_continent() {
        try {
            System.out.println("Enter Continent");
            String continent = console.nextLine();
            continent = continent.toLowerCase();
            continent = capitalize(continent);
            int animalCount = 0;

            if (next_free_index > 0) {
                for (int i = 0; i < next_free_index; i++) {
                    Animal a[] = family[i].getAnimal();
                    if (family[i].getNext_free_index() > 0) {
                        for (int j = 0; j < family[i].getNext_free_index(); j++) {
                            if (a[j].getContinent().equals(continent)) {
                                System.out.println("ANIMAL "+ family[i].getScName()+" "+a[j].getName()+" "+a[j].getContinent());
                                animalCount++;
                            }
                        }
                    }
                }

                if (animalCount <= 0) {
                    System.out.println("There are no animals in the database living on the specified continent.");
                }
            } else {
                System.out.println("No Family in the database");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }


    // Option 08: List animals with the same diet
    public static void list_animals_with_same_diet() {
        try {
            System.out.println("Enter Animal Name");
            String animalName = console.nextLine();
            animalName = animalName.toLowerCase();
            animalName = capitalize(animalName);
            String animalDiet = "";
            boolean animalNameExists = false;

            for (int i = 0; i < next_free_index; i++) {
                Animal a[] = family[i].getAnimal();
                for (int j = 0; j < family[i].getNext_free_index(); j++) {
                    if (a[j].getName().equals(animalName)) {
                        animalDiet = family[i].getDiet();
                        animalNameExists = true;
                        break;
                    }
                }
            }

            if (animalNameExists) {
                boolean animalWithSameDietExists = false;

                for (int i = 0; i < next_free_index; i++) {
                    Animal a[] = family[i].getAnimal();
                    if (family[i].getDiet().equals(animalDiet)) {
                        animalWithSameDietExists = true;
                        for (int j = 0; j < family[i].getNext_free_index(); j++) {
                            System.out.println("ANIMAL "+ family[i].getScName()+" "+a[j].getName()+" "+a[j].getContinent()+" "+family[i].getDiet());

                        }
                    }
                }
                if (animalWithSameDietExists == false) {
                    System.out.println("Animal with same diet doesn't exists");
                }
            }
            else {
                System.out.println("Animal Doesn't Exists");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }


    // Option 09: Import family and animal information from a file
    public static void import_from_file() {
        Scanner inputStream;
        String fileName = "";

        try {
            System.out.println("Enter File Name With Extension (eg. input.txt)");
            fileName = console.nextLine();

            inputStream = new Scanner(new File(fileName));

//            Assumption: All pre-existing data are deleted and replaced by the data imported from files
            family = null;
            next_free_index = 0;

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    word = word.toLowerCase();
                    word = capitalize(word);
                    if (word.equals("Family")) {
                        addFamilyFromFile(line);
                        break;
                    }
                    else if (word.equals("Animal")){
                        addAnimalFromFile(line);
                        break;
                    }
                    else {
                        System.out.println("Invalid Input");
                        break;
                    }
                }
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("Error Opening the file: " + fileName);
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void addFamilyFromFile(String line) {
        StringTokenizer st = new StringTokenizer(line);
        String familyArray[] = new String[4];
        int i = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            word = word.toLowerCase();
            word = capitalize(word);
            familyArray[i] = word;
            i++;
        }

        if (next_free_index < MAX_FAMILIES) {
            if (family == null) {
                family = new Family[MAX_FAMILIES];
            }
            family[next_free_index] = new Family(familyArray[1], familyArray[2], familyArray[3]);
            next_free_index++;
            System.out.println("Family: " + familyArray[1] + " Successfully Added");
        } else {
            System.out.println("Maximum Family Reached!");
        }
    }

    public static void addAnimalFromFile(String line) {
        StringTokenizer st = new StringTokenizer(line);
        String animalNameArray[] = new String[5];
        int i = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            word = word.toLowerCase();
            word = capitalize(word);
            animalNameArray[i] = word;
            i++;
        }

        int index = getFamilyNameLocation(animalNameArray[1]);

        if (index != -1){
            family[index].addAnimal(animalNameArray[2], animalNameArray[3], animalNameArray[4]);
        }
        else {
            System.out.println("Family Doesn't Exists!");
        }

    }

    // Option 10: Write family and animal information to file
    public static void write_to_file() {
        try{
            System.out.println("Enter File Name with Extension (Eg. output.txt)");
            String fileName = console.nextLine();
            PrintWriter outputStream = new PrintWriter(fileName);
            if (next_free_index == 0) {
                System.out.println("No family objects exist");
            } else {
                for (int i = 0; i < next_free_index; i++) {
                    Animal a[] = family[i].getAnimal();
                    String s = ("FAMILY "+family[i].getScName()+" "+family[i].getCoName()+" "+family[i].getDiet());
                    outputStream.println (s);
                    int animalIndex = family[i].getNext_free_index();
                    if (animalIndex!=0 && family[i].getAnimal()!=null){
                        for (int j = 0; j < animalIndex; j++) {
                            if (a[j]!=null){
                                s = "ANIMAL "+family[i].getScName()+" "+a[j].getName()+" "+a[j].getContinent()+" "+a[j].getHabitat();
                                outputStream.println (s);
                            }
                        }
                    }
                }
                System.out.println("File have been created");
            }
            outputStream.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

//    This method checks whether a family name already exists in the family array or not
    public static boolean familyNameAlreadyExists(String familyName) {
        boolean nameAlreadyExists = false;
        if (next_free_index != 0) {
            for (int i = 0; i < next_free_index; i++) {
                if (family[i].getScName().equals(familyName)) {
                    nameAlreadyExists = true;
                    break;
                }
            }
        }
        return nameAlreadyExists;
    }

//    this method finds the location of the family that is given as parameter in the family array
    public static int getFamilyNameLocation(String familyName) {
        int index = -1;
        if (next_free_index != 0) {
            for (int i = 0; i < next_free_index; i++) {
                if (family[i].getScName().equals(familyName)) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }


//    this method checks whether or not a animal already exists in the animal array of a particular family
    public static boolean animalNameAlreadyExists(String animalName, int index) {
        boolean nameAlreadyExists = false;
        Animal[] a = family[index].getAnimal();
        for (int i = 0; i < family[index].getNext_free_index(); i++) {
            if (a[i].getName().equals(animalName)) {
                nameAlreadyExists = true;
                break;
            }
        }

        return nameAlreadyExists;
    }

    // This method converts the first letter of a string into Upper case
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void list_all_family(){
        sortFamily();
        for (int i=0; i<next_free_index; i++){
            System.out.println(family[i].getScName());
        }
    }

//    this method sorts the family array based on the scientific name
    public static void sortFamily(){
        for (int i=0; i<next_free_index; i++){
            for (int j=i+1; j<next_free_index; j++){
                if (family[i].getScName().compareTo(family[j].getScName())>0){
                    Family temp = family[i];
                    family[i] = family[j];
                    family[j] = temp;
                }
            }
        }
    }

//    this method sorts the animal array based on the animal name;
    public static void sortAnimal(){
        sortFamily();
        for (int i=0; i<next_free_index; i++){
            Animal a[] = family[i].getAnimal();
            for (int j=0; j<family[i].getNext_free_index(); j++){
                for (int k=j+1; k<family[i].getNext_free_index(); k++){
                    if (a[j].getName().compareTo(a[k].getName())>0){
                        Animal temp = a[j];
                        a[j] = a[k];
                        a[k] = temp;
                    }
                }
            }
        }
    }
}



