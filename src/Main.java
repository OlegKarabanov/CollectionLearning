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

        catslist.remove(1);  //удаление элемента по индексу

        Cat cat = catslist.get(0);
        System.out.println(cat);

        System.out.println(catslist.lastIndexOf(cat));

        catslist.add(2,cat);
        catslist.set(2, new Cat("Меня сюда вставили"));

        //catslist.removeAll(catslist); // удаление всех котов
        catslist.removeAll(Arrays.asList(cat, catslist.get(3))); // удаление 3 индекса

        System.out.println(catslist.toString());

        System.out.println(catslist.size());


    }
}