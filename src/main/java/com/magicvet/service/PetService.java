package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

public class PetService {
    private static final String DOG_TYPE = "dog";
    private static final String CAT_TYPE = "cat";
    public Pet registerNewPet(){
        Pet pet = null;
        System.out.println("Type (dog / cat ): ");
        String type = Main.SCANNER.nextLine();

        if (DOG_TYPE.equals(type) || CAT_TYPE.equals(type)){
            pet = buildPet(type);
        }
        else{
            System.out.println("Unknown pet type: " + type);;
        }
        return pet;
    }

    private Pet buildPet(String type){
        Pet pet = type.equals(CAT_TYPE) ? new Cat() : new Dog();
        pet.setType(type);
        System.out.println("Age: ");
        pet.setAge(Main.SCANNER.nextLine());
        System.out.println("Name: ");
        pet.setName(Main.SCANNER.nextLine());
        System.out.println("Sex (male / female): ");
        pet.setSex(Main.SCANNER.nextLine());

        if (type.equals(DOG_TYPE)){
            System.out.println("Size (xs / s / m / l / xl): ");
            ((Dog) pet).setSize(Main.SCANNER.nextLine());
        }
        return pet;
    }
}
