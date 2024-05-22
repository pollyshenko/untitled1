package ch01;

public class PhraseOMatic {
    public static void main(String[] args){
        String[] wordList1 = {"круглосуточный","взаимный","шесть","динамичный"};
        String[] wordList2 = {"центральный","общий","распределительный","чистый"};
        String[] wordList3 = {"процесс","талант","образец","подход"};

        int oneLenght = wordList1.length;
        int twoLenght = wordList2.length;
        int threeLenght = wordList3.length;

        System.out.println(oneLenght);
        double a = Math.random();

        int rand1 = (int) (a * oneLenght);
        System.out.println(a);
        System.out.println(rand1);

        int rand2 = (int) (Math.random()* twoLenght);
        int rand3 = (int) (Math.random()* threeLenght);

        String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];

        System.out.println("Все что нам нужно это - " + phrase);
    }
}
