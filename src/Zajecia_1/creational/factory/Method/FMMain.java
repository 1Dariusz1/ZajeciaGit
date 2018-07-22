package Zajecia_1.creational.factory.Method;

public class FMMain {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalNameFactory("Reksio");
        Animal animal = ((AnimalNameFactory) animalFactory).crateAnimal();
//        animal.makeASound();

    }
}
