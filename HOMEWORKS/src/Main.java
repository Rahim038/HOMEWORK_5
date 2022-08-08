import HOMEWORKS.Human;
import HOMEWORKS.Family;
import HOMEWORKS.Pet;

public class Main {
    public static void main(String[] args) {


        Human father = new Human("Alexandr", "Karleone" );
        Human mother = new Human("Ann", "Karleone");

        Pet pet1 = new Pet();
        pet1.species = "dog";
        pet1.nickname = "Charax";
        pet1.age = 5;
        pet1.tricklevel = 75;
        pet1.habits = new String[] {"eat","drink","swim"};
        Human child = new Human("Michel","Karleone",1996,88,
                new String[][]{{"Monday", "go to school"}, {"Tuesday", "swim"}});


        pet1.eat();
        pet1.respond();
        pet1.foul();
        System.out.println(pet1.toString() + "\n");



        Human child1 = new Human("Lorem", "Lorem", 2003, 99, new String[][]{{"monday", "study"}});
        Human child2 = new Human("Lorem", "Lorem", 2004, 120, new String[][]{{"monday", "study"}});
        Family family = new Family(mother,father);
        family.addChild(child1);
        System.out.println(child1);
        family.addChild(child2);
       /*family.deleteChild(2);*/
        System.out.println(family.countFamily());
        System.out.println(family);







    }
}