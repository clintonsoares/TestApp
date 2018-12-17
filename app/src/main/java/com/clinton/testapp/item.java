package com.clinton.testapp;

public class item {

    private String Name;
    private String Details;

    public item(){
    }

    public item(String name, String details) {
        Name = name;
        Details = details;
    }

    //getters and setters


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }
}
