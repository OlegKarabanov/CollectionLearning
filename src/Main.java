import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Cat [] cats = new Cat[4];
        cats[0] =new Cat("Tomas");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филип Маркович");
        cats[3] = new Cat("Котяра");

        //cats[1] = null;
        System.out.println(Arrays.toString(cats));

        ArrayList<Cat> catslist = new ArrayList<>();
        for(Cat cat : cats){
            catslist.add(cat);
        }

        catslist.add( new Cat("Бегемот2"));

        System.out.println(catslist.toString());




    }
}