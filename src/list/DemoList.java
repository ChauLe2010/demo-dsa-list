package list;

import demo_mylist.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<Person> persons=new ArrayList();
        persons.add(new Person(1,"The Anh"));
        persons.add(new Person(2,"Tuan"));

//        ListIterator<Person> iterator1=persons.listIterator();
       // iterator1.


        Iterator<Person> iterator=persons.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        for(int i=0;i<persons.size();i++){
//            System.out.println(persons.get(i));
//        }
    }
}
