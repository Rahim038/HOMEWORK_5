package HOMEWORKS;

import java.util.Arrays;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
//    Pet pet = new Pet("dog","Rock");
//    Human mother;
//    Human father;
    public String schedule[][];
    private Family family;
    public Human(){

    }

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname,int year, int iq, Pet pet, Human mother,
                 Human father, String schedule[][]){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
//        this.pet = pet;
//        this.mother = mother;
//        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

//    public void greetPet(){
//        System.out.println("Hello, " + pet.nickname);
//    }

//    public void describePet(){
//        if(pet.tricklevel > 50)
//        System.out.println("I have a " + pet.species + ", he is " + pet.age
//                +" years old" + ", he is " + "very sly");
//        else
//            System.out.println("I have a " + pet.species + ", he is " + pet.age
//                +" years old" + ", he is " + " almost not sly");
//    }




    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                '}';
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Family getFamily(){
        return family;
    }

}