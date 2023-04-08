package Java.learning.beginning.opp;

import Java.learning.beginning.app.Animal;
import Java.learning.beginning.app.Cat;
import Java.learning.beginning.app.Dog;
import Java.learning.beginning.app.FileHandler;
import com.sun.source.tree.WhileLoopTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Dog.staticFunction();
        Dog myDog1 = new Dog();
        myDog1.animalSound();
        myDog1.sleep();
        Animal myCat1 = new Cat("Sac ben",5);
        myCat1.animalSound();
        Integer sum1 = myDog1.sum(5,6);
        System.out.println(sum1);
        System.out.println("test branch");
        System.out.println("Thach");
    }

}