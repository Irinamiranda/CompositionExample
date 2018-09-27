package me.afua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your name");
        // Request the name of the parent
        Person theParent = new Person();
        String name = kb.nextLine();
        theParent.setName(name);

//      Adding children here (as many children as the user would like)
        Person childOne = new Person();
        childOne.setName("First Child");
        theParent.addAChild(childOne);

        Person childTwo = new Person();
        childTwo.setName("Second Child");
        theParent.addAChild(childTwo);

        Person childThree = new Person();
        childThree.setName("Third Child");
        theParent.addAChild(childThree);

        Person childFour = new Person();
        childFour.setName("Larissa");
        theParent.addAChild(childFour);

        ArrayList<String> theirNames = new ArrayList<>();
        for (Person eachChild : theParent.getMyChildren()) {

            theirNames.add(eachChild.getName());
            System.out.println(theParent.getName() + "'s child is " + eachChild.getName());
        }

        Collections.sort(theirNames);
        System.out.println("Sorted Names:\n");
        for (String aName : theirNames) {
            System.out.println(aName);
        }

    }


}
