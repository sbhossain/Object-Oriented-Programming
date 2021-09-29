/*
Name:               Sayeed Bin Hossain
Student number:     3340471
Course:             SENG6110
Assignment:         1
Date:               19/03/2020
*/

import javax.swing.*;

public class Marsupial {
    private String family;
    private String name;
    private String scientific_name;
    private String state;
    private int length;
    private int weight;
    private String status;



    public Marsupial() {
        family = "";
        name = "";
        scientific_name = "";
        state = "";
        length = 0;
        weight = 0;
        status = "";
    }

    public Marsupial(String family, String name, String scientific_name, String state, int length, int weight, String status) {
        this.family = family;
        this.name = name;
        this.scientific_name = scientific_name;
        this.state = state;
        this.length = length;
        this.weight = weight;
        this.status = status;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientific_name() {
        return scientific_name;
    }

    public void setScientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public void display(){
////        without GUI
////        System.out.printf("%-20s %-20s %-25s %-10s %-10d %-10d %-2s",  family, name, scientific_name, state, length, weight, status);
//////        System.out.println();
//
////        with GUI
//        JOptionPane.showMessageDialog(null, String.format("%-20s %-20s %-25s %-10s %-10d %-10d %-2s",  family, name, scientific_name, state, length, weight, status));
//
//
//    }
}


