/*
Name:               Sayeed Bin Hossain
Student number:     3340471
Course:             SENG6110
Assignment:         1
Date:               19/03/2020
*/

import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;

public class Interface
{

//    Created 9 objects of Marsupial class. This is the database.
    private static Marsupial potoroo1 = new Marsupial("Potoroo","Gilbert's potoroo","Potorous gilbertii","WA",290, 965,"CR");
    private static Marsupial potoroo2 = new Marsupial("Potoroo","Woylie","Bettongia penicillata","Many",380, 1300,"CR");
    private static Marsupial potoroo3 = new Marsupial("Potoroo","Boodie","Bettongia lesueur","WA",400, 1500,"NT");
    private static Marsupial dasyurid1 = new Marsupial("Dasyurid","Tiger quoll","Dasyurus maculatus","Many",900, 3500,"NT");
    private static Marsupial dasyurid2 = new Marsupial("Dasyurid","Eastern quoll","Dasyurus viverrinus","TAS",600, 1100,"EN");
    private static Marsupial dasyurid3 = new Marsupial("Dasyurid","Dibbler","Parantechinus apicalis","WA",160, 120,"EN");
    private static Marsupial macropod1 = new Marsupial("Macropod","Banded hare-wallaby","Lagostrophus fasciatus","WA",800, 1700,"EN");
    private static Marsupial macropod2 = new Marsupial("Macropod","Red kangaroo","Macropus rufus","Many",2700, 80000,"NT");
    private static Marsupial macropod3 = new Marsupial("Macropod","Tasmanian pademelon","Thylogale billardierii","TAS",1200, 12000,"NT");

    private JPanel pane;
    static Scanner console = new Scanner(System.in);
    int inputNum = 0;

//    public void run() {
//        // Display a menu and read input values until -1 entered:
//        while(inputNum != -1) {
//
//            System.out.println("Select an option and press ENTER:");
//            System.out.println("1. List Database"); // Task-1
//            System.out.println("2. Delete third macropod animal"); //Task-2
//            System.out.println("3. Add the third macropod "); //Task-3
//            System.out.println("4. Change the value of the status of the second potoroo"); //Task-4
//            System.out.println("5. Mean Length of all"); //Task-5
//            System.out.println("6. Mean Length and Weight of Dasyurids"); //Task-6
//            System.out.println("7. List Name, State, Length By Family"); //Task-7
//            System.out.println("8. List Name, Length of Marsupials over a given length"); //Task-8
//            System.out.println("9. Display macropod from macropod class"); //Task-9
//            System.out.println("-1. Exit");
//            inputNum = Integer.parseInt(console.nextLine());
//
//            switch(inputNum) {
//                case  1: displayDatabase(); break;
//                case  2:
//                    deleteData();
//                    break;
//                case  3:
//                    if (macropod3 == null) {
//                    enterData();
//                    }
//                    else{
//                        System.out.println("No Space in the database. Please Delete First");
//                    } break;
//                case 4:
//                    if (potoroo2!=null) {
//                        potoroo2 = changeStatus(potoroo2);
//                    }break;
//                case 5:
//                    meanLengthWeight(); break;
//                case 6:
//                    meanLengthWeightDasyurids();
//                    break;
//                case 7:
//                    listNameStateLength();
//                    break;
//                case 8:
//                    listNameLength();
//                    break;
//                case 9:
//                    addDisplayMacropod();
//                    break;
//                case -1: break;
//            }  // end of switch(inputNum)
//
//        } // end of    while(inputNum != -1)
//
//    }  // end of run() method

//    method that show the main application
    public void run() {
        while (true) {
            String input;
            System.out.println(1 + 5 % 3 );
            input = JOptionPane.showInputDialog("1 = Show Database."
                    + "\n 2 = Delete third macropod animal."
                    + "\n 3 = Add the third macropod"
                    + "\n 4 = Change the value of the status of the second potoroo."
                    + "\n 5 = Mean Length and Weight of all."
                    + "\n 6 = Mean Length and Weight of Dasyurids."
                    + "\n 7 = List Name, State, Length By Family."
                    + "\n 8 = List Name, Length of Marsupials over a given length."
                    + "\n 9 = Display macropod from macropod class."
                    + "\n -1 = exit."
                    + "\n Please choose an option from above.");
            inputNum = Integer.parseInt(input);
            switch (inputNum) {
                case 1:
                    displayDatabase();
                    break;
                case 2:
                    deleteData();
                    break;
                case 3:
                    if (macropod3 == null) {
                        enterData();
                    } else {
                        String message ="No Space in the database. Please Delete First";
                        JOptionPane.showMessageDialog(null, message);
                    }
                    break;
                case 4:
                    if (potoroo2 != null) {
                        potoroo2 = changeStatus(potoroo2);
                    }
                    break;
                case 5:
                    meanLengthWeight();
                    break;
                case 6:
                    meanLengthWeightDasyurids();
                    break;
                case 7:
                    listNameStateLength();
                    break;
                case 8:
                    listNameLength();
                    break;
                case 9:
                    addDisplayMacropod();
                    break;
                case -1:
                    System.exit(0);
                    break;
            }
        }
    }



    // create an instance of this class and use a main() method to execute the code in the run() method
    // you can leave this as it is
    public static void main(String[] args) {

        Interface intFace = new Interface();
        intFace.run();

    }

//    this method displays the overall database
    public void displayDatabase(){
//        with GUI implemented
        JOptionPane.showMessageDialog(null, getDatabase(), "Database : ",
                JOptionPane.INFORMATION_MESSAGE);


//        without GUI - console I/O
//        System.out.printf("%-20s %-20s %-25s %-10s %-10s %-10s %-2s",  "family", "name", "scientific_name", "state", "length", "weight", "status");
//        System.out.println();
//
//        if(potoroo1 != null){
//            potoroo1.display();
//        }
//        if(potoroo2 != null){
//            potoroo2.display();
//        }
//        if(potoroo3 != null){
//            potoroo3.display();
//        }
//        if(dasyurid1 != null){
//            dasyurid1.display();
//        }
//        if(dasyurid2 != null){
//            dasyurid2.display();
//        }
//        if(dasyurid3 != null){
//            dasyurid3.display();
//        }
//        if(macropod1 != null){
//            macropod1.display();
//        }
//        if(macropod2 != null){
//            macropod2.display();
//        }
//        if(macropod3 != null){
//            macropod3.display();
//        }
//        System.out.println();

    }

//    this method is used to delete record (specific row) of macropod3
    public void deleteData(){
        macropod3 = null;
//        System.out.println("Record Has been Successfully Deleted");
//        System.out.println();

        String message ="Record Has been Successfully Deleted";
        JOptionPane.showMessageDialog(null, message);
    }

//    this method is used to enter new data into the database in place of macropod3
    public void enterData(){

//        Using GUI
        String family = JOptionPane.showInputDialog("Enter Family");
        String name = JOptionPane.showInputDialog("Enter Name");
        String scientific_name = JOptionPane.showInputDialog("Enter Scientific Name");
        String state = JOptionPane.showInputDialog("Enter State");
        String lengthStr = JOptionPane.showInputDialog("Enter Length");
        int length = Integer.parseInt(lengthStr);
        String weightStr = JOptionPane.showInputDialog("Enter Weight");
        int weight = Integer.parseInt(weightStr);
        String status = JOptionPane.showInputDialog("Enter Status");

//        without GUI
//        System.out.println("Enter Family:");
//        String family = console.nextLine();
//
//        System.out.println("Enter Name:");
//        String name = console.nextLine();
//
//        System.out.println("Enter Scientific Name:");
//        String scientific_name = console.nextLine();
//
//        System.out.println("Enter State:");
//        String state = console.nextLine();
//
//        System.out.println("Enter Length(mm):");
//        int length = Integer.parseInt(console.nextLine());
//
//        System.out.println("Enter Weight(g):");
//        int weight = Integer.parseInt(console.nextLine());
//
//        System.out.println("Enter Status:");
//        String status = console.nextLine();

        macropod3 = new Marsupial(family, name, scientific_name, state, length, weight, status);

        String message ="New Record Added Successfully!";
        JOptionPane.showMessageDialog(null, message);

        JOptionPane.showMessageDialog(null, displayRow(macropod3), "New Record : ",
                JOptionPane.INFORMATION_MESSAGE);

//        without GUI
//        System.out.println();
//        System.out.println("New Record Added Successfully!");
//        System.out.println();
//        displayRow(macropod3);
//        System.out.println();
    }

//      Display single row - without GUI
//    public void displayRow(Marsupial m1){
//        System.out.printf("%-20s %-20s %-25s %-10s %-10s %-10s %-2s",  "family", "name", "scientific_name", "state", "length", "weight", "status");
//        System.out.println();
//        System.out.printf("%-20s %-20s %-25s %-10s %-10s %-10s %-2s",  m1.getFamily(), m1.getName(), m1.getScientific_name(), m1.getState(), m1.getLength(), m1.getWeight(), m1.getStatus());
//        System.out.println();
//        System.out.println();
//    }

//    this method is used to change the status of a particular object
    public Marsupial changeStatus(Marsupial m1){

//        With GUI
        String s = JOptionPane.showInputDialog("Please enter new Value of Status:");
        m1.setStatus(s);
        String message = "Value Changed to "+ s+" Successfully!";
        JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, displayRow(m1), "Changed Record : ",
                JOptionPane.INFORMATION_MESSAGE);

//        Without GUI
//        System.out.println("Please enter new Value of Status:");
//        String s = console.nextLine();
//        m1.setStatus(s);
//        System.out.println();
//        System.out.println("Value Changed to "+ s+" Successfully!");
//        System.out.println();
//        displayRow(m1);

        return m1;
    }

//    this method calculate the mean length and weight of all the marsupials
    public void meanLengthWeight(){
        double totalLength = 0;
        double totalWeight = 0;
        int count = 0;

        if(potoroo1 != null){
            totalLength = totalLength + potoroo1.getLength();
            totalWeight = totalWeight + potoroo1.getWeight();
            count++;
        }
        if(potoroo2 != null){
            totalLength = totalLength + potoroo2.getLength();
            totalWeight = totalWeight + potoroo2.getWeight();
            count++;
        }
        if(potoroo3 != null){
            totalLength = totalLength + potoroo3.getLength();
            totalWeight = totalWeight + potoroo3.getWeight();
            count++;
        }
        if(dasyurid1 != null){
            totalLength = totalLength + dasyurid1.getLength();
            totalWeight = totalWeight + dasyurid1.getWeight();
            count++;
        }
        if(dasyurid2 != null){
            totalLength = totalLength + dasyurid2.getLength();
            totalWeight = totalWeight + dasyurid2.getWeight();
            count++;
        }
        if(dasyurid3 != null){
            totalLength = totalLength + dasyurid3.getLength();
            totalWeight = totalWeight + dasyurid3.getWeight();
            count++;
        }
        if(macropod1 != null){
            totalLength = totalLength + macropod1.getLength();
            totalWeight = totalWeight + macropod1.getWeight();
            count++;
        }
        if(macropod2 != null){
            totalLength = totalLength + macropod2.getLength();
            totalWeight = totalWeight + macropod2.getWeight();
            count++;
        }
        if(macropod3 != null){
            totalLength = totalLength + macropod3.getLength();
            totalWeight = totalWeight + macropod3.getWeight();
            count++;
        }

        double meanLength = totalLength/count;
        double final_meanLength = Math.round(meanLength * 100.0) / 100.0;
        double meanWeight = totalWeight/count;
        double final_meanWeight = Math.round(meanWeight* 100.0) / 100.0;

//        with GUI
        JOptionPane.showMessageDialog(null, displayMeanLengthWeightAll(final_meanLength, final_meanLength, "all"), "Mean Length & Weight: ",
                JOptionPane.INFORMATION_MESSAGE);


//        without GUI
//        System.out.println();
//        System.out.println("Mean Length of All: "+ final_meanLength + "mm");
//        System.out.println("Mean Weight of All: "+ final_meanWeight + "g");
//        System.out.println();
    }

//    this method calculate the mean length and weight of all dasyurids
    public void meanLengthWeightDasyurids(){
        double totalLength = 0;
        double totalWeight = 0;
        int count = 0;

        if(potoroo1 != null && potoroo1.getFamily()=="Dasyurid"){
            totalLength = totalLength + potoroo1.getLength();
            totalWeight = totalWeight + potoroo1.getWeight();
            count++;
        }
        if(potoroo2 != null && potoroo2.getFamily()=="Dasyurid"){
            totalLength = totalLength + potoroo2.getLength();
            totalWeight = totalWeight + potoroo2.getWeight();
            count++;
        }
        if(potoroo3 != null && potoroo3.getFamily()=="Dasyurid"){
            totalLength = totalLength + potoroo3.getLength();
            totalWeight = totalWeight + potoroo3.getWeight();
            count++;
        }
        if(dasyurid1 != null && dasyurid1.getFamily()=="Dasyurid"){
            totalLength = totalLength + dasyurid1.getLength();
            totalWeight = totalWeight + dasyurid1.getWeight();
            count++;
        }
        if(dasyurid2 != null && dasyurid2.getFamily()=="Dasyurid"){
            totalLength = totalLength + dasyurid2.getLength();
            totalWeight = totalWeight + dasyurid2.getWeight();
            count++;
        }
        if(dasyurid3 != null && dasyurid3.getFamily()=="Dasyurid"){
            totalLength = totalLength + dasyurid3.getLength();
            totalWeight = totalWeight + dasyurid3.getWeight();
            count++;
        }
        if(macropod1 != null && macropod1.getFamily()=="Dasyurid"){
            totalLength = totalLength + macropod1.getLength();
            totalWeight = totalWeight + macropod1.getWeight();
            count++;
        }
        if(macropod2 != null && macropod2.getFamily()=="Dasyurid"){
            totalLength = totalLength + macropod2.getLength();
            totalWeight = totalWeight + macropod2.getWeight();
            count++;
        }
        if(macropod3 != null && macropod3.getFamily()=="Dasyurid"){
            totalLength = totalLength + macropod3.getLength();
            totalWeight = totalWeight + macropod3.getWeight();
            count++;
        }

        double meanLength = totalLength/count;
        double final_meanLength = Math.round(meanLength * 100.0) / 100.0;
        double meanWeight = totalWeight/count;
        double final_meanWeight = Math.round(meanWeight* 100.0) / 100.0;

//        with GUI
        JOptionPane.showMessageDialog(null, displayMeanLengthWeightAll(final_meanLength, final_meanLength, "Dasyurid"), "Mean Length & Weight: ",
                JOptionPane.INFORMATION_MESSAGE);

//        without GUI
//        System.out.println();
//        System.out.println("Mean Length of Dasyurid: "+ final_meanLength + "mm");
//        System.out.println("Mean Weight of Dasyurid: "+ final_meanWeight + "g");
//        System.out.println();

    }

//    this method lists the name, state, length of the  family given by the user
    public void listNameStateLength(){

//        with GUI
        String fNameInput = JOptionPane.showInputDialog("Enter Family name:");

//        without GUI
//        System.out.println("Enter Family name:");
//        String fNameInput = console.nextLine();

        fNameInput = fNameInput.toLowerCase();
        String fName = "";
        boolean invalidInput = false;

        if (fNameInput.equals("potoroo")){
            fName = "Potoroo";
        }
        else if (fNameInput.equals("dasyurid")){
            fName = "Dasyurid";
        }
        else if (fNameInput.equals("macropod")){
            fName = "Macropod";
        }
        else {
            invalidInput = true;
        }

        if (!invalidInput){
            JOptionPane.showMessageDialog(null, displaylistNameStateLength(fName), "List with the given family  ",
                    JOptionPane.INFORMATION_MESSAGE);
        }


//        without GUI
//        if (!invalidInput){
//            System.out.printf("%-20s %-10s %-10s",  "name", "state", "length");
//            System.out.println();
//
//            if(potoroo1 != null && potoroo1.getFamily()== fName){
//                System.out.printf("%-20s %-10s %-10s",  potoroo1.getName(), potoroo1.getState(), potoroo1.getLength());
//                System.out.println();
//            }
//            if(potoroo2 != null && potoroo2.getFamily()== fName){
//                System.out.printf("%-20s %-10s %-10s",  potoroo2.getName(), potoroo2.getState(), potoroo2.getLength());
//                System.out.println();
//            }
//            if(potoroo3 != null && potoroo3.getFamily()==fName){
//                System.out.printf("%-20s %-10s %-10s",  potoroo3.getName(), potoroo3.getState(), potoroo3.getLength());
//                System.out.println();
//            }
//            if(dasyurid1 != null && dasyurid1.getFamily()== fName){
//                System.out.printf("%-20s %-10s %-10s",  dasyurid1.getName(), dasyurid1.getState(), dasyurid1.getLength());
//                System.out.println();
//            }
//            if(dasyurid2 != null && dasyurid2.getFamily()== fName){
//                System.out.printf("%-20s %-10s %-10s",  dasyurid2.getName(), dasyurid2.getState(), dasyurid2.getLength());
//                System.out.println();
//            }
//            if(dasyurid3 != null && dasyurid3.getFamily()== fName){
//                System.out.printf("%-20s %-10s %-10s",  dasyurid3.getName(), dasyurid3.getState(), dasyurid3.getLength());
//                System.out.println();
//            }
//            if(macropod1 != null && macropod1.getFamily()== fName){
//                System.out.printf("%-20s %-10s %-10s",  macropod1.getName(), macropod1.getState(), macropod1.getLength());
//                System.out.println();
//            }
//            if(macropod2 != null && macropod2.getFamily()== fName){
//                System.out.printf("%-20s %-10s %-10s",  macropod2.getName(), macropod2.getState(), macropod2.getLength());
//                System.out.println();
//            }
//            if(macropod3 != null && macropod3.getFamily()== fName){
//                System.out.printf("%-20s %-10s %-10s",  macropod3.getName(), macropod3.getState(), macropod3.getLength());
//                System.out.println();
//            }
//        }
        else{
//            with GUI
            String message = "You have Enter Invalid Input";
            JOptionPane.showMessageDialog(null, message);

//            without GUi
//            System.out.println("You have Enter Invalid Input");
        }
    }

//    this method lists the Name and length of all the masupial whose length are over the length provided by the user
    public void listNameLength(){
//        with GUI
        String lengthStr = JOptionPane.showInputDialog("Enter Length:");
        int length = Integer.parseInt(lengthStr);
        if (length>=0){
            String title = "List of Marsupial Over Length = "+length;
            JOptionPane.showMessageDialog(null, displaylistNameLength(length), title,
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            String message = "You have Enter Invalid Input";
            JOptionPane.showMessageDialog(null, message);
        }


//        without GUI
//        System.out.println("Enter Length:");
//        int length = Integer.parseInt(console.nextLine());
//
//        System.out.printf("%-20s %-10s",  "name", "length");
//        System.out.println();
//
//        if(potoroo1 != null && potoroo1.getLength() > length){
//            System.out.printf("%-20s %-10s",  potoroo1.getName(), potoroo1.getLength());
//            System.out.println();
//        }
//        if(potoroo2 != null && potoroo2.getLength() > length){
//            System.out.printf("%-20s %-10s",  potoroo2.getName(), potoroo2.getLength());
//            System.out.println();
//        }
//        if(potoroo3 != null && potoroo3.getLength() > length){
//            System.out.printf("%-20s %-10s",  potoroo3.getName(), potoroo3.getLength());
//            System.out.println();
//        }
//        if(dasyurid1 != null && dasyurid1.getLength() > length){
//            System.out.printf("%-20s %-10s",  dasyurid1.getName(), dasyurid1.getLength());
//            System.out.println();
//        }
//        if(dasyurid2 != null && dasyurid2.getLength() > length){
//            System.out.printf("%-20s %-10s",  dasyurid2.getName(), dasyurid2.getLength());
//            System.out.println();
//        }
//        if(dasyurid3 != null && dasyurid3.getLength() > length){
//            System.out.printf("%-20s %-10s",  dasyurid3.getName(), dasyurid3.getLength());
//            System.out.println();
//        }
//        if(macropod1 != null && macropod1.getLength() > length){
//            System.out.printf("%-20s %-10s",  macropod1.getName(), macropod1.getLength());
//            System.out.println();
//        }
//        if(macropod2 != null && macropod2.getLength() > length){
//            System.out.printf("%-20s %-10s",  macropod2.getName(), macropod2.getLength());
//            System.out.println();
//        }
//        if(macropod3 != null && macropod3.getLength() > length){
//            System.out.printf("%-20s %-10s",  macropod3.getName(), macropod3.getLength());
//            System.out.println();
//        }
    }

//    this method displays the attributes of the macropods created in the macropod class
    public void addDisplayMacropod(){
        Macropod m = new Macropod();
        m.displayMacropod();
    }

//    this method helps to display the list of Name and length using GUI
    private JPanel displaylistNameLength(int length){
        int count = 0;

        if(potoroo1 != null && potoroo1.getLength() > length){
            count++;
        }
        if(potoroo2 != null && potoroo2.getLength() > length){
            count++;
        }
        if(potoroo3 != null && potoroo3.getLength() > length){
            count++;
        }
        if(dasyurid1 != null && dasyurid1.getLength() > length){
            count++;
        }
        if(dasyurid2 != null && dasyurid2.getLength() > length){
            count++;
        }
        if(dasyurid3 != null && dasyurid3.getLength() > length){
            count++;
        }
        if(macropod1 != null && macropod1.getLength() > length){
            count++;
        }
        if(macropod2 != null && macropod2.getLength() > length){
            count++;
        }
        if(macropod3 != null && macropod3.getLength() > length){
            count++;
        }

        if (count!=0){
            JPanel panel = new JPanel(new GridLayout(count+1, 2, 5, 5));

            JLabel Name = getLabel("Name");
            JLabel Length = getLabel("Length");

            panel.add(Name);
            panel.add(Length);

            if(potoroo1 != null && potoroo1.getLength() > length){
                JLabel potoroo1Name = getLabel(potoroo1.getName());
                JLabel potoroo1Length = getLabel(Integer.toString(potoroo1.getLength()));

                panel.add(potoroo1Name);
                panel.add(potoroo1Length);
            }
            if(potoroo2 != null && potoroo2.getLength() > length){
                JLabel potoroo2Name = getLabel(potoroo2.getName());
                JLabel potoroo2Length = getLabel(Integer.toString(potoroo2.getLength()));

                panel.add(potoroo2Name);
                panel.add(potoroo2Length);
            }
            if(potoroo3 != null && potoroo3.getLength() > length){
                JLabel potoroo3Name = getLabel(potoroo3.getName());
                JLabel potoroo3Length = getLabel(Integer.toString(potoroo3.getLength()));

                panel.add(potoroo3Name);
                panel.add(potoroo3Length);
            }
            if(dasyurid1 != null && dasyurid1.getLength() > length){
                JLabel dasyurid1Name = getLabel(dasyurid1.getName());
                JLabel dasyurid1Length = getLabel(Integer.toString(dasyurid1.getLength()));

                panel.add(dasyurid1Name);
                panel.add(dasyurid1Length);
            }
            if(dasyurid2 != null && dasyurid2.getLength() > length){
                JLabel dasyurid2Name = getLabel(dasyurid2.getName());
                JLabel dasyurid2Length = getLabel(Integer.toString(dasyurid2.getLength()));

                panel.add(dasyurid2Name);
                panel.add(dasyurid2Length);
            }
            if(dasyurid3 != null && dasyurid3.getLength() > length){
                JLabel dasyurid3Name = getLabel(dasyurid3.getName());
                JLabel dasyurid3Length = getLabel(Integer.toString(dasyurid3.getLength()));

                panel.add(dasyurid3Name);
                panel.add(dasyurid3Length);
            }
            if(macropod1 != null && macropod1.getLength() > length){
                JLabel macropod1Name = getLabel(macropod1.getName());
                JLabel macropod1Length = getLabel(Integer.toString(macropod1.getLength()));

                panel.add(macropod1Name);
                panel.add(macropod1Length);
            }
            if(macropod2 != null && macropod2.getLength() > length){
                JLabel macropod2Name = getLabel(macropod2.getName());
                JLabel macropod2Length = getLabel(Integer.toString(macropod2.getLength()));

                panel.add(macropod2Name);
                panel.add(macropod2Length);
            }
            if(macropod3 != null && macropod3.getLength() > length){
                JLabel macropod3Name = getLabel(macropod3.getName());
                JLabel macropod3Length = getLabel(Integer.toString(macropod3.getLength()));

                panel.add(macropod3Name);
                panel.add(macropod3Length);
            }
            return panel;
        }
        else{
            JPanel panel = new JPanel(new GridLayout(1, 1, 5, 5));

            JLabel message = getLabel("NO RECORD FOUND");

            panel.add(message);

            return panel;
        }
    }

//    this method displays list of name, state, length using GUI
    private JPanel displaylistNameStateLength(String fName){

        int count = 0;

//        counting the numebr of rows
        if (potoroo1 != null && potoroo1.getFamily() == fName) {
            count++;
        }
        if (potoroo2 != null && potoroo2.getFamily() == fName) {
            count++;
        }
        if (potoroo3 != null && potoroo3.getFamily() == fName) {
            count++;
        }
        if (dasyurid1 != null && dasyurid1.getFamily() == fName) {
           count++;
        }
        if (dasyurid2 != null && dasyurid2.getFamily() == fName) {
            count++;
        }
        if (dasyurid3 != null && dasyurid3.getFamily() == fName) {
            count++;
        }
        if (macropod1 != null && macropod1.getFamily() == fName) {
            count++;
        }
        if (macropod2 != null && macropod2.getFamily() == fName) {
            count++;
        }
        if (macropod3 != null && macropod3.getFamily() == fName) {
            count++;
        }

        JPanel panel = new JPanel(new GridLayout(count+1, 3, 5, 5));

        //        Heading
        JLabel Name = getLabel("Name");
        JLabel State = getLabel("State");
        JLabel Length = getLabel("Length");

        panel.add(Name);
        panel.add(State);
        panel.add(Length);

        if(potoroo1 != null && potoroo1.getFamily()== fName){
            JLabel potoroo1Name = getLabel(potoroo1.getName());
            JLabel potoroo1State = getLabel(potoroo1.getState());
            JLabel potoroo1Length = getLabel(Integer.toString(potoroo1.getLength()));

            panel.add(potoroo1Name);
            panel.add(potoroo1State);
            panel.add(potoroo1Length);
        }
        if(potoroo2 != null && potoroo2.getFamily()== fName){
            JLabel potoroo2Name = getLabel(potoroo2.getName());
            JLabel potoroo2State = getLabel(potoroo2.getState());
            JLabel potoroo2Length = getLabel(Integer.toString(potoroo2.getLength()));

            panel.add(potoroo2Name);
            panel.add(potoroo2State);
            panel.add(potoroo2Length);
        }
        if(potoroo3 != null && potoroo3.getFamily()==fName){
            JLabel potoroo3Name = getLabel(potoroo3.getName());
            JLabel potoroo3State = getLabel(potoroo3.getState());
            JLabel potoroo3Length = getLabel(Integer.toString(potoroo3.getLength()));

            panel.add(potoroo3Name);
            panel.add(potoroo3State);
            panel.add(potoroo3Length);
        }
        if(dasyurid1 != null && dasyurid1.getFamily()== fName){
            JLabel dasyurid1Name = getLabel(dasyurid1.getName());
            JLabel dasyurid1State = getLabel(dasyurid1.getState());
            JLabel dasyurid1Length = getLabel(Integer.toString(dasyurid1.getLength()));

            panel.add(dasyurid1Name);
            panel.add(dasyurid1State);
            panel.add(dasyurid1Length);
        }
        if(dasyurid2 != null && dasyurid2.getFamily()== fName){
            JLabel dasyurid2Name = getLabel(dasyurid2.getName());
            JLabel dasyurid2State = getLabel(dasyurid2.getState());
            JLabel dasyurid2Length = getLabel(Integer.toString(dasyurid2.getLength()));

            panel.add(dasyurid2Name);
            panel.add(dasyurid2State);
            panel.add(dasyurid2Length);
        }
        if(dasyurid3 != null && dasyurid3.getFamily()== fName){
            JLabel dasyurid3Name = getLabel(dasyurid3.getName());
            JLabel dasyurid3State = getLabel(dasyurid3.getState());
            JLabel dasyurid3Length = getLabel(Integer.toString(dasyurid3.getLength()));

            panel.add(dasyurid3Name);
            panel.add(dasyurid3State);
            panel.add(dasyurid3Length);
        }
        if(macropod1 != null && macropod1.getFamily()== fName){
            JLabel macropod1Name = getLabel(macropod1.getName());
            JLabel macropod1State = getLabel(macropod1.getState());
            JLabel macropod1Length = getLabel(Integer.toString(macropod1.getLength()));

            panel.add(macropod1Name);
            panel.add(macropod1State);
            panel.add(macropod1Length);
        }
        if(macropod2 != null && macropod2.getFamily()== fName){
            JLabel macropod2Name = getLabel(macropod2.getName());
            JLabel macropod2State = getLabel(macropod2.getState());
            JLabel macropod2Length = getLabel(Integer.toString(macropod2.getLength()));

            panel.add(macropod2Name);
            panel.add(macropod2State);
            panel.add(macropod2Length);
        }
        if(macropod3 != null && macropod3.getFamily()== fName){
            JLabel macropod3Name = getLabel(macropod3.getName());
            JLabel macropod3State = getLabel(macropod3.getState());
            JLabel macropod3Length = getLabel(Integer.toString(macropod3.getLength()));

            panel.add(macropod3Name);
            panel.add(macropod3State);
            panel.add(macropod3Length);
        }

        return panel;

    }

    private JPanel displayMeanLengthWeightAll(double meanLength, double meanWeight, String ofWhom){
        JPanel panel = new JPanel(new GridLayout(2, 1, 5, 5));
        JLabel message1 = getLabel("Mean Length of " + ofWhom +" : "+ meanLength +" mm");
        JLabel message2 = getLabel("Mean Weight of " + ofWhom +" : "+ meanWeight +" g");

        panel.add(message1);
        panel.add(message2);

        return panel;
    }

    private JPanel displayRow(Marsupial m1){
        JPanel panel = new JPanel(new GridLayout(2, 7, 5, 5));
        JLabel Family = getLabel("Family");
        JLabel Name = getLabel("Name");
        JLabel Scientific_name = getLabel("Scientific Name");
        JLabel State = getLabel("State");
        JLabel Length = getLabel("Length");
        JLabel Weight = getLabel("Weight");
        JLabel Status = getLabel("Status");

        JLabel m1Family = getLabel(m1.getFamily());
        JLabel m1Name = getLabel(m1.getName());
        JLabel m11Scientificname = getLabel(m1.getScientific_name());
        JLabel m1State = getLabel(m1.getState());
        JLabel m1Length = getLabel(Integer.toString(m1.getLength()));
        JLabel m1Weight = getLabel(Integer.toString(m1.getWeight()));
        JLabel m1Status = getLabel(m1.getStatus());

        panel.add(Family);
        panel.add(Name);
        panel.add(Scientific_name);
        panel.add(State);
        panel.add(Length);
        panel.add(Weight);
        panel.add(Status);

        panel.add(m1Family);
        panel.add(m1Name);
        panel.add(m11Scientificname);
        panel.add(m1State);
        panel.add(m1Length);
        panel.add(m1Weight);
        panel.add(m1Status);

        return panel;
    }

    private JPanel getDatabase() {

        if(macropod3 != null){
            JPanel panel = new JPanel(new GridLayout(10, 7, 5, 5));
            JLabel Family = getLabel("Family");
            JLabel Name = getLabel("Name");
            JLabel Scientific_name = getLabel("Scientific Name");
            JLabel State = getLabel("State");
            JLabel Length = getLabel("Length");
            JLabel Weight = getLabel("Weight");
            JLabel Status = getLabel("Status");

            //POTOROOO
            JLabel potoroo1Family = getLabel(potoroo1.getFamily());
            JLabel potoroo1Name = getLabel(potoroo1.getName());
            JLabel potoroo1Scientificname = getLabel(potoroo1.getScientific_name());
            JLabel potoroo1State = getLabel(potoroo1.getState());
            JLabel potoroo1Length = getLabel(Integer.toString(potoroo1.getLength()));
            JLabel potoroo1Weight = getLabel(Integer.toString(potoroo1.getWeight()));
            JLabel potoroo1Status = getLabel(potoroo1.getStatus());

            JLabel potoroo2Family = getLabel(potoroo2.getFamily());
            JLabel potoroo2Name = getLabel(potoroo2.getName());
            JLabel potoroo2Scientificname = getLabel(potoroo2.getScientific_name());
            JLabel potoroo2State = getLabel(potoroo2.getState());
            JLabel potoroo2Length = getLabel(Integer.toString(potoroo2.getLength()));
            JLabel potoroo2Weight = getLabel(Integer.toString(potoroo2.getWeight()));
            JLabel potoroo2Status = getLabel(potoroo2.getStatus());

            JLabel potoroo3Family = getLabel(potoroo3.getFamily());
            JLabel potoroo3Name = getLabel(potoroo3.getName());
            JLabel potoroo3Scientificname = getLabel(potoroo3.getScientific_name());
            JLabel potoroo3State = getLabel(potoroo3.getState());
            JLabel potoroo3Length = getLabel(Integer.toString(potoroo3.getLength()));
            JLabel potoroo3Weight = getLabel(Integer.toString(potoroo3.getWeight()));
            JLabel potoroo3Status = getLabel(potoroo3.getStatus());

            //DASYURID
            JLabel dasyurid1Family = getLabel(dasyurid1.getFamily());
            JLabel dasyurid1Name = getLabel(dasyurid1.getName());
            JLabel dasyurid1Scientificname = getLabel(dasyurid1.getScientific_name());
            JLabel dasyurid1State = getLabel(dasyurid1.getState());
            JLabel dasyurid1Length = getLabel(Integer.toString(dasyurid1.getLength()));
            JLabel dasyurid1Weight = getLabel(Integer.toString(dasyurid1.getWeight()));
            JLabel dasyurid1Status = getLabel(dasyurid1.getStatus());

            JLabel dasyurid2Family = getLabel(dasyurid2.getFamily());
            JLabel dasyurid2Name = getLabel(dasyurid2.getName());
            JLabel dasyurid2Scientificname = getLabel(dasyurid2.getScientific_name());
            JLabel dasyurid2State = getLabel(dasyurid2.getState());
            JLabel dasyurid2Length = getLabel(Integer.toString(dasyurid2.getLength()));
            JLabel dasyurid2Weight = getLabel(Integer.toString(dasyurid2.getWeight()));
            JLabel dasyurid2Status = getLabel(dasyurid2.getStatus());

            JLabel dasyurid3Family = getLabel(dasyurid3.getFamily());
            JLabel dasyurid3Name = getLabel(dasyurid3.getName());
            JLabel dasyurid3Scientificname = getLabel(dasyurid3.getScientific_name());
            JLabel dasyurid3State = getLabel(dasyurid3.getState());
            JLabel dasyurid3Length = getLabel(Integer.toString(dasyurid3.getLength()));
            JLabel dasyurid3Weight = getLabel(Integer.toString(dasyurid3.getWeight()));
            JLabel dasyurid3Status = getLabel(dasyurid3.getStatus());

            //MACROPOD
            JLabel macropod1Family = getLabel(macropod1.getFamily());
            JLabel macropod1Name = getLabel(macropod1.getName());
            JLabel macropod1Scientificname = getLabel(macropod1.getScientific_name());
            JLabel macropod1State = getLabel(macropod1.getState());
            JLabel macropod1Length = getLabel(Integer.toString(macropod1.getLength()));
            JLabel macropod1Weight = getLabel(Integer.toString(macropod1.getWeight()));
            JLabel macropod1Status = getLabel(macropod1.getStatus());

            JLabel macropod2Family = getLabel(macropod2.getFamily());
            JLabel macropod2Name = getLabel(macropod2.getName());
            JLabel macropod2Scientificname = getLabel(macropod2.getScientific_name());
            JLabel macropod2State = getLabel(macropod2.getState());
            JLabel macropod2Length = getLabel(Integer.toString(macropod2.getLength()));
            JLabel macropod2Weight = getLabel(Integer.toString(macropod2.getWeight()));
            JLabel macropod2Status = getLabel(macropod2.getStatus());


            JLabel macropod3Family = getLabel(macropod3.getFamily());
            JLabel macropod3Name = getLabel(macropod3.getName());
            JLabel macropod3Scientificname = getLabel(macropod3.getScientific_name());
            JLabel macropod3State = getLabel(macropod3.getState());
            JLabel macropod3Length = getLabel(Integer.toString(macropod3.getLength()));
            JLabel macropod3Weight = getLabel(Integer.toString(macropod3.getWeight()));
            JLabel macropod3Status = getLabel(macropod3.getStatus());

            //Heading
            panel.add(Family);
            panel.add(Name);
            panel.add(Scientific_name);
            panel.add(State);
            panel.add(Length);
            panel.add(Weight);
            panel.add(Status);

            //POTOROO
            panel.add(potoroo1Family);
            panel.add(potoroo1Name);
            panel.add(potoroo1Scientificname);
            panel.add(potoroo1State);
            panel.add(potoroo1Length);
            panel.add(potoroo1Weight);
            panel.add(potoroo1Status);

            panel.add(potoroo2Family);
            panel.add(potoroo2Name);
            panel.add(potoroo2Scientificname);
            panel.add(potoroo2State);
            panel.add(potoroo2Length);
            panel.add(potoroo2Weight);
            panel.add(potoroo2Status);

            panel.add(potoroo3Family);
            panel.add(potoroo3Name);
            panel.add(potoroo3Scientificname);
            panel.add(potoroo3State);
            panel.add(potoroo3Length);
            panel.add(potoroo3Weight);
            panel.add(potoroo3Status);

            //DASYURID
            panel.add(dasyurid1Family);
            panel.add(dasyurid1Name);
            panel.add(dasyurid1Scientificname);
            panel.add(dasyurid1State);
            panel.add(dasyurid1Length);
            panel.add(dasyurid1Weight);
            panel.add(dasyurid1Status);

            panel.add(dasyurid2Family);
            panel.add(dasyurid2Name);
            panel.add(dasyurid2Scientificname);
            panel.add(dasyurid2State);
            panel.add(dasyurid2Length);
            panel.add(dasyurid2Weight);
            panel.add(dasyurid2Status);

            panel.add(dasyurid3Family);
            panel.add(dasyurid3Name);
            panel.add(dasyurid3Scientificname);
            panel.add(dasyurid3State);
            panel.add(dasyurid3Length);
            panel.add(dasyurid3Weight);
            panel.add(dasyurid3Status);

            //MACROPOD
            panel.add(macropod1Family);
            panel.add(macropod1Name);
            panel.add(macropod1Scientificname);
            panel.add(macropod1State);
            panel.add(macropod1Length);
            panel.add(macropod1Weight);
            panel.add(macropod1Status);

            panel.add(macropod2Family);
            panel.add(macropod2Name);
            panel.add(macropod2Scientificname);
            panel.add(macropod2State);
            panel.add(macropod2Length);
            panel.add(macropod2Weight);
            panel.add(macropod2Status);

            panel.add(macropod3Family);
            panel.add(macropod3Name);
            panel.add(macropod3Scientificname);
            panel.add(macropod3State);
            panel.add(macropod3Length);
            panel.add(macropod3Weight);
            panel.add(macropod3Status);
            return panel;
        }
        else {
            JPanel panel = new JPanel(new GridLayout(9, 7, 5, 5));
            JLabel Family = getLabel("Family");
            JLabel Name = getLabel("Name");
            JLabel Scientific_name = getLabel("Scientific Name");
            JLabel State = getLabel("State");
            JLabel Length = getLabel("Length");
            JLabel Weight = getLabel("Weight");
            JLabel Status = getLabel("Status");

            //POTOROOO
            JLabel potoroo1Family = getLabel(potoroo1.getFamily());
            JLabel potoroo1Name = getLabel(potoroo1.getName());
            JLabel potoroo1Scientificname = getLabel(potoroo1.getScientific_name());
            JLabel potoroo1State = getLabel(potoroo1.getState());
            JLabel potoroo1Length = getLabel(Integer.toString(potoroo1.getLength()));
            JLabel potoroo1Weight = getLabel(Integer.toString(potoroo1.getWeight()));
            JLabel potoroo1Status = getLabel(potoroo1.getStatus());

            JLabel potoroo2Family = getLabel(potoroo2.getFamily());
            JLabel potoroo2Name = getLabel(potoroo2.getName());
            JLabel potoroo2Scientificname = getLabel(potoroo2.getScientific_name());
            JLabel potoroo2State = getLabel(potoroo2.getState());
            JLabel potoroo2Length = getLabel(Integer.toString(potoroo2.getLength()));
            JLabel potoroo2Weight = getLabel(Integer.toString(potoroo2.getWeight()));
            JLabel potoroo2Status = getLabel(potoroo2.getStatus());

            JLabel potoroo3Family = getLabel(potoroo3.getFamily());
            JLabel potoroo3Name = getLabel(potoroo3.getName());
            JLabel potoroo3Scientificname = getLabel(potoroo3.getScientific_name());
            JLabel potoroo3State = getLabel(potoroo3.getState());
            JLabel potoroo3Length = getLabel(Integer.toString(potoroo3.getLength()));
            JLabel potoroo3Weight = getLabel(Integer.toString(potoroo3.getWeight()));
            JLabel potoroo3Status = getLabel(potoroo3.getStatus());

            //DASYURID
            JLabel dasyurid1Family = getLabel(dasyurid1.getFamily());
            JLabel dasyurid1Name = getLabel(dasyurid1.getName());
            JLabel dasyurid1Scientificname = getLabel(dasyurid1.getScientific_name());
            JLabel dasyurid1State = getLabel(dasyurid1.getState());
            JLabel dasyurid1Length = getLabel(Integer.toString(dasyurid1.getLength()));
            JLabel dasyurid1Weight = getLabel(Integer.toString(dasyurid1.getWeight()));
            JLabel dasyurid1Status = getLabel(dasyurid1.getStatus());

            JLabel dasyurid2Family = getLabel(dasyurid2.getFamily());
            JLabel dasyurid2Name = getLabel(dasyurid2.getName());
            JLabel dasyurid2Scientificname = getLabel(dasyurid2.getScientific_name());
            JLabel dasyurid2State = getLabel(dasyurid2.getState());
            JLabel dasyurid2Length = getLabel(Integer.toString(dasyurid2.getLength()));
            JLabel dasyurid2Weight = getLabel(Integer.toString(dasyurid2.getWeight()));
            JLabel dasyurid2Status = getLabel(dasyurid2.getStatus());

            JLabel dasyurid3Family = getLabel(dasyurid3.getFamily());
            JLabel dasyurid3Name = getLabel(dasyurid3.getName());
            JLabel dasyurid3Scientificname = getLabel(dasyurid3.getScientific_name());
            JLabel dasyurid3State = getLabel(dasyurid3.getState());
            JLabel dasyurid3Length = getLabel(Integer.toString(dasyurid3.getLength()));
            JLabel dasyurid3Weight = getLabel(Integer.toString(dasyurid3.getWeight()));
            JLabel dasyurid3Status = getLabel(dasyurid3.getStatus());

            //MACROPOD
            JLabel macropod1Family = getLabel(macropod1.getFamily());
            JLabel macropod1Name = getLabel(macropod1.getName());
            JLabel macropod1Scientificname = getLabel(macropod1.getScientific_name());
            JLabel macropod1State = getLabel(macropod1.getState());
            JLabel macropod1Length = getLabel(Integer.toString(macropod1.getLength()));
            JLabel macropod1Weight = getLabel(Integer.toString(macropod1.getWeight()));
            JLabel macropod1Status = getLabel(macropod1.getStatus());

            JLabel macropod2Family = getLabel(macropod2.getFamily());
            JLabel macropod2Name = getLabel(macropod2.getName());
            JLabel macropod2Scientificname = getLabel(macropod2.getScientific_name());
            JLabel macropod2State = getLabel(macropod2.getState());
            JLabel macropod2Length = getLabel(Integer.toString(macropod2.getLength()));
            JLabel macropod2Weight = getLabel(Integer.toString(macropod2.getWeight()));
            JLabel macropod2Status = getLabel(macropod2.getStatus());

            //Heading
            panel.add(Family);
            panel.add(Name);
            panel.add(Scientific_name);
            panel.add(State);
            panel.add(Length);
            panel.add(Weight);
            panel.add(Status);

            //POTOROO
            panel.add(potoroo1Family);
            panel.add(potoroo1Name);
            panel.add(potoroo1Scientificname);
            panel.add(potoroo1State);
            panel.add(potoroo1Length);
            panel.add(potoroo1Weight);
            panel.add(potoroo1Status);

            panel.add(potoroo2Family);
            panel.add(potoroo2Name);
            panel.add(potoroo2Scientificname);
            panel.add(potoroo2State);
            panel.add(potoroo2Length);
            panel.add(potoroo2Weight);
            panel.add(potoroo2Status);

            panel.add(potoroo3Family);
            panel.add(potoroo3Name);
            panel.add(potoroo3Scientificname);
            panel.add(potoroo3State);
            panel.add(potoroo3Length);
            panel.add(potoroo3Weight);
            panel.add(potoroo3Status);

            //DASYURID
            panel.add(dasyurid1Family);
            panel.add(dasyurid1Name);
            panel.add(dasyurid1Scientificname);
            panel.add(dasyurid1State);
            panel.add(dasyurid1Length);
            panel.add(dasyurid1Weight);
            panel.add(dasyurid1Status);

            panel.add(dasyurid2Family);
            panel.add(dasyurid2Name);
            panel.add(dasyurid2Scientificname);
            panel.add(dasyurid2State);
            panel.add(dasyurid2Length);
            panel.add(dasyurid2Weight);
            panel.add(dasyurid2Status);

            panel.add(dasyurid3Family);
            panel.add(dasyurid3Name);
            panel.add(dasyurid3Scientificname);
            panel.add(dasyurid3State);
            panel.add(dasyurid3Length);
            panel.add(dasyurid3Weight);
            panel.add(dasyurid3Status);

            //MACROPOD
            panel.add(macropod1Family);
            panel.add(macropod1Name);
            panel.add(macropod1Scientificname);
            panel.add(macropod1State);
            panel.add(macropod1Length);
            panel.add(macropod1Weight);
            panel.add(macropod1Status);

            panel.add(macropod2Family);
            panel.add(macropod2Name);
            panel.add(macropod2Scientificname);
            panel.add(macropod2State);
            panel.add(macropod2Length);
            panel.add(macropod2Weight);
            panel.add(macropod2Status);
            return panel;
        }
    }

    private JLabel getLabel(String title) {
        return new JLabel(title);
    }

}

