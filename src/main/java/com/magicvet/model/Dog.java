package main.java.com.magicvet.model;

import java.util.Objects;

public class Dog extends Pet{

    public static final String XS = "xs";
    public static final String S = "s";
    public static final String M = "m";
    public static final String L = "l";
    public static final String XL = "xl";

    public String size;

    public Dog(){
    }
    public Dog(String size){
        this.size = size;
    }

    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(size, dog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
