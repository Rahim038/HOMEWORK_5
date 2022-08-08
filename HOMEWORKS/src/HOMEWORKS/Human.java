package HOMEWORKS;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    Pet pet = new Pet("dog","Rock");
    Human mother;
    Human father;
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
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet(){
        if(pet.tricklevel > 50)
        System.out.println("I have a " + pet.species + ", he is " + pet.age
                +" years old" + ", he is " + "very sly");
        else
            System.out.println("I have a " + pet.species + ", he is " + pet.age
                +" years old" + ", he is " + " almost not sly");
    }

    public String toString(){
        return  "Human{name = " + this.name + ", surname = " + this.surname + ", year = " + this.year + ", iq = "
                + this.iq + ", mother's name = " + this.mother.name + ", mother's surname = " +
                this.mother.surname +
                ", father's name = " + this.father.name  + ", father's surname = " +
                this.father.surname + ", pet = " +
                this.pet + "{nickname = " + pet.nickname + ", age = " + pet.age + ", trickLevel = " +
                pet.tricklevel + ", habits = " + pet.habits + "}}";
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Family getFamily(){
        return getFamily();
    }

}