package ch03;

import ch02.Dog;

public class ArrayInt {
    public static void main(String[] args){

        int[] nums;
        nums = new int[7];

        nums[0] = 4;
        nums[1] = -5;
        nums[2] = 3;
        nums[3] = 30;
        nums[4] = 123;
        nums[5] = -56;
        nums[6] = 0;

        //System.out.println(nums[0]);

        Dog[] pets;
        pets = new Dog[7];

        pets[0] = new Dog();
        pets[6] = new Dog();
        pets[1] = pets[0];

        Dog fido = new Dog();
        fido.name = "Fido";
        fido.bark();
        //fido.chaseCat();

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[0].name = "Fido";
        myDogs[0].bark();


    }
}
