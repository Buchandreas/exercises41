package Task3;

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal a){
        animals.add(a);
    }

    public void makeAllSounds(){
        for (int i = 0; i < animals.size(); i++){

        }
    }

    public void printNumberOfLegs(){
        for (int i = 0; i < animals.size(); i++){
            printNumberOfLegs(animals.get(0));
        }
    }
}
