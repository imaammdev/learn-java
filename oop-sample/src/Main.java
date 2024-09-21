import com.oop.basic.Animal;
import com.oop.inheritance.Cat;
import com.oop.inheritance.Pig;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("cat");
        cat.setColour("white");
        cat.setSound("meow");

        Animal pig = new Animal("pig");
        pig.setColour("pink");
        pig.setSound("oink");

        System.out.println(cat.getSound());

        System.out.println(pig.getSound());

        Cat shiro = new Cat("shiro");
        System.out.println(shiro.getSound());
        shiro.move();

        Pig peppa = new Pig("peppa");
        System.out.println(peppa.getSound());
        peppa.move();


    }
}