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

public class Macropod {

    static Scanner console = new Scanner(System.in);

    private Marsupial m1;
    private Marsupial m2;
    private Marsupial m3;

    public Macropod(){
        addMacropod1();
        m2 = new Marsupial("Macropod","Red kangaroo","Macropus rufus","Many",2700, 80000,"NT");
        m3 = new Marsupial("Macropod","Tasmanian pademelon","Thylogale billardierii","TAS",1200, 12000,"NT");
    }

    public void addMacropod1() {

//        With GUI
        String message = "Enter the details of Macropod 1";
        JOptionPane.showMessageDialog(null, message);
        String family = JOptionPane.showInputDialog("Enter Family:");
        String name = JOptionPane.showInputDialog("Enter Name:");
        String scientific_name = JOptionPane.showInputDialog("Enter Scientific Name:");
        String state = JOptionPane.showInputDialog("Enter State:");
        String lengthStr = JOptionPane.showInputDialog("Enter Length:");
        int length = Integer.parseInt(lengthStr);
        String weightStr = JOptionPane.showInputDialog("Enter Weight:");
        int weight = Integer.parseInt(weightStr);
        String status = JOptionPane.showInputDialog("Enter Status:");

//        Without GUI
//        System.out.println("Enter the details of Macropod 1");
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

        m1 = new Marsupial(family, name, scientific_name, state, length, weight, status);

    }

//    displays the attributes
    public void displayMacropod() {

//        With GUI
        JOptionPane.showMessageDialog(null, displayMacrodList(), "List of Macropod from Macropod class ",
                JOptionPane.INFORMATION_MESSAGE);

//        without GUI
//        System.out.printf("%-20s %-20s %-25s %-10s %-10s %-10s %-2s",  "family", "name", "scientific_name", "state", "length", "weight", "status");
//        System.out.println();
//        System.out.printf("%-20s %-20s %-25s %-10s %-10s %-10s %-2s",  m1.getFamily(), m1.getName(), m1.getScientific_name(), m1.getState(), m1.getLength(), m1.getWeight(), m1.getStatus());
//        System.out.println();
//        System.out.printf("%-20s %-20s %-25s %-10s %-10s %-10s %-2s",  m2.getFamily(), m2.getName(), m2.getScientific_name(), m2.getState(), m2.getLength(), m2.getWeight(), m2.getStatus());
//        System.out.println();
//        System.out.printf("%-20s %-20s %-25s %-10s %-10s %-10s %-2s",  m3.getFamily(), m3.getName(), m3.getScientific_name(), m3.getState(), m3.getLength(), m3.getWeight(), m3.getStatus());
//        System.out.println();
//        System.out.println();
    }

    private JPanel displayMacrodList(){
        JPanel panel = new JPanel(new GridLayout(4, 7, 5, 5));

        JLabel Family = getLabel("Family");
        JLabel Name = getLabel("Name");
        JLabel Scientific_name = getLabel("Scientific Name");
        JLabel State = getLabel("State");
        JLabel Length = getLabel("Length");
        JLabel Weight = getLabel("Weight");
        JLabel Status = getLabel("Status");

        JLabel m1Family = getLabel(m1.getFamily());
        JLabel m1Name = getLabel(m1.getName());
        JLabel m1Scientificname = getLabel(m1.getScientific_name());
        JLabel m1State = getLabel(m1.getState());
        JLabel m1Length = getLabel(Integer.toString(m1.getLength()));
        JLabel m1Weight = getLabel(Integer.toString(m1.getWeight()));
        JLabel m1Status = getLabel(m1.getStatus());

        JLabel m2Family = getLabel(m2.getFamily());
        JLabel m2Name = getLabel(m2.getName());
        JLabel m2Scientificname = getLabel(m2.getScientific_name());
        JLabel m2State = getLabel(m2.getState());
        JLabel m2Length = getLabel(Integer.toString(m2.getLength()));
        JLabel m2Weight = getLabel(Integer.toString(m2.getWeight()));
        JLabel m2Status = getLabel(m2.getStatus());

        JLabel m3Family = getLabel(m3.getFamily());
        JLabel m3Name = getLabel(m3.getName());
        JLabel m3Scientificname = getLabel(m3.getScientific_name());
        JLabel m3State = getLabel(m3.getState());
        JLabel m3Length = getLabel(Integer.toString(m3.getLength()));
        JLabel m3Weight = getLabel(Integer.toString(m3.getWeight()));
        JLabel m3Status = getLabel(m3.getStatus());

        //Heading
        panel.add(Family);
        panel.add(Name);
        panel.add(Scientific_name);
        panel.add(State);
        panel.add(Length);
        panel.add(Weight);
        panel.add(Status);

        //m1
        panel.add(m1Family);
        panel.add(m1Name);
        panel.add(m1Scientificname);
        panel.add(m1State);
        panel.add(m1Length);
        panel.add(m1Weight);
        panel.add(m1Status);

        //m2
        panel.add(m2Family);
        panel.add(m2Name);
        panel.add(m2Scientificname);
        panel.add(m2State);
        panel.add(m2Length);
        panel.add(m2Weight);
        panel.add(m2Status);

        //m3
        panel.add(m3Family);
        panel.add(m3Name);
        panel.add(m3Scientificname);
        panel.add(m3State);
        panel.add(m3Length);
        panel.add(m3Weight);
        panel.add(m3Status);

        return panel;
    }

    private JLabel getLabel(String title) {
        return new JLabel(title);
    }
}



