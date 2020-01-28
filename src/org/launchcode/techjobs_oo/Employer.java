package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer {
    //fields are internal values associated with a particular instance of an Object
    private int id;
    //static keyword means single instance and is shared across all Objects of this class
    private static int nextId = 1;
    private String value;

    //constructors
    //empty constructor does not require parameters
    public Employer() {
        id = nextId;
        nextId++;
    }
    //only used when an Object is created with a String in the constructor
    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        //this checks for both Objects having the same memory location
        if (this == o) return true;
        //checks for data typing
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        //checks for ID to be the same
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
