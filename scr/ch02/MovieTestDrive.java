package ch02;

public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "Как выиграть лотерею";
        one.genre = "Мелодрамма";
        one.rating = 7;

        one.playIt();
    }


}
