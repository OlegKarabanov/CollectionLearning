import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Cat [] cats = new Cat[4];
        cats[0] =new Cat("Tomas");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филип Маркович");
        cats[3] = new Cat("Котяра");

        //cats[1] = null;
        System.out.println(Arrays.toString(cats));


        //ArraysList
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


        //LinkedList
        String str1 = new String("Hello world");
        String str2 = new String("My name is Oleg");
        String str3 = new String("I love Java");

        LinkedList<String> olegBio = new LinkedList<>();
        olegBio.add(str1);
        olegBio.add(str2);
        olegBio.add(str3);
        System.out.println(olegBio);

        olegBio.remove(1);
        System.out.println(olegBio);


        //Linked List on practice
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari Spider");
        Car bugatti = new Car("Veyron");
        Car mercedes = new Car("Mercedes Benz");

        cars.addAll( Arrays.asList(ferrari,bugatti,mercedes));
        System.out.println(cars);

        cars.addFirst(new Car("Ford gt300"));
        cars.addLast(new Car("Fiat"));
        System.out.println(cars);

        System.out.println(cars.pollFirst());
        System.out.println(cars);


        //ArrayList vs LinkedList

        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < 5000000; i++){
            list.add(new Integer(i));
        }

        long start = System.currentTimeMillis();
        for(int i = 0; i < 100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Время работы для LinkedList в (миллисекундах) " +
                (System.currentTimeMillis() - start));


        list = new ArrayList<>();
        for(int i = 0; i < 5000000; i++){
            list.add(new Integer(i));
        }

        start = System.currentTimeMillis();
        for(int i = 0; i < 100; i++){
            list.add(2000000, Integer.MAX_VALUE);
        }

        System.out.println("Время работы для ArrayList в (миллисекундах) " +
                (System.currentTimeMillis() - start));

        }

}

