package com.example.recyclerviewbexample;

public class Contact_Structure {
    int img;
    String ctNR , ctNM;
    public Contact_Structure(int image, String name, String number){  // fetching image ,number,name of contact to display;
        this.img = image;
        this.ctNR = number;
        this.ctNM = name;
    }
}
