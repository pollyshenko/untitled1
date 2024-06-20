package ch04;

public class GoodDogTest {
    public static void main (String[] args){
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        GoodDog three = new GoodDog();
        three.setSize(25);

        System.out.println("one " + one.getSize());
        one.bark();
        System.out.println("two " + two.getSize());
        two.bark();
        System.out.println("three " + three.getSize());
        three.bark();


    }
}
