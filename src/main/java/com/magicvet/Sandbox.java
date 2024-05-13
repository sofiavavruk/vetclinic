package main.java.com.magicvet;

import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;
import java.util.Comparator;

public class Sandbox {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.Size.l),
                new Dog(Dog.Size.xs),
                new Dog(Dog.Size.m),
                new Dog(Dog.Size.xl),
                new Dog(Dog.Size.s)
        };
        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getSize().getValue() - o2.getSize().getValue();
            }
        });
        for (Dog dog : dogs){
            System.out.println(dog.getSize());
        }
    }
}
