package HOMEWORKS;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human children[];
    private Pet pet;
    private Family family;


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child){
        child.setFamily(this);
        Human[] newChildren = Arrays.copyOf(this.children,this.children.length + 1);
        newChildren[newChildren.length-1] = child;
        this.children=newChildren;
    }

    public boolean deleteChild(int index) {
        if (index > this.children.length - 1) return false;
        Human[] newChildren = new Human[this.children.length - 1];
        int counter = 0;
        for (int i = 0; i < this.children.length; i++) {
            if (i != index) {
                newChildren[counter++] = this.children[i];
            }
        }
        this.children[index].setFamily(null);
        this.children = newChildren;
        return true;
    }

    public int countFamily(){
        return this.children.length + (mother != null ? 1 : 0) + (father != null ? 1 : 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family1 = (Family) o;
        return mother.equals(family1.mother) && father.equals(family1.father) && Arrays.equals(children, family1.children) && pet.equals(family1.pet) && family.equals(family1.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet, family);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                ", family=" + family +
                '}';
    }
}