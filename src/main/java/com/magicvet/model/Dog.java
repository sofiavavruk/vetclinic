package main.java.com.magicvet.model;

import java.util.Objects;

public class Dog extends Pet{
    public Size size;

    public Dog(){
    }
    public Dog(Size size){
        this.size = size;
    }

    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){
        return size;
    }

    public enum Size{
        xs(1),
        s(2),
        m(3),
        l(4),
        xl(5),
        unknown(0);
        private final int value;
        Size(int value){
            this.value = value;
        }
        public static Size fromString(String value){
            for(Size size : values()){
                if(size.toString().equals(value)){
                    return size;
                }
            }
            System.out.println("Unable to parse value '" + value +
                    "'. Using default value: " + unknown);
            return unknown;
        }

        public int getValue() {
            return value;
        }
    }

    @Override
    public String toString() {
        return "Pet {"
                + "type = " + getType()
                + ", sex = " + getSex()
                + ", age = " + getAge()
                + ", name = " + getName()
                + ", size = " + getSize()
                + ", ownerName = " + getOwnerName()
                + ", registrationDate = " + getRegistrationDate().format(FORMATTER)
                + "}";
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
