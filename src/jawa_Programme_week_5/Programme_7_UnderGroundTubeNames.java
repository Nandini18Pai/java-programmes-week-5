package jawa_Programme_week_5;

import java.util.ArrayList;

/**
* Write a Java program to test an array list is empty or not. Define array list with underground tube names
 *
 */

public class Programme_7_UnderGroundTubeNames {
    public void isEmpty(){
        ArrayList<String> tubeName = new ArrayList<>();
        tubeName.add("Bakerloo_lines");
        tubeName.add("Central_lines");
        tubeName.add("Circle_lines");
        tubeName.add("District_lines");
        tubeName.add("Hammersmith_and_City_line");
        tubeName.add("Jubilee_lines");
        tubeName.add("Metropolitan_line");
        tubeName.add("Northern_lines");
        tubeName.add("Piccadilly_line");
        tubeName.add("Victoria_line");
        tubeName.add("Waterloo_and_City_line");
        System.out.println("Given Array List : " + tubeName);
        if(tubeName.isEmpty()){
            System.out.println(" Given Array List is Empty !!");
        }else{
            System.out.println("Given Array List is not Empty !! ");
        }
    }
    public static void main (String [] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }
}
