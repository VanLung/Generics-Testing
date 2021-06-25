package Generics;

import java.util.Iterator;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class GenTester {

    public static void main(String[] args) {
////////////////////////////////////////////////
        System.out.println("\n----2 example of generics:");
        System.out.println("\nNo.1: ");
        Gen<String> g1 = new Gen<>();

        g1.set("Apple");
        System.out.print(g1.get());

        Gen<Integer> g2 = new Gen<>();
        g2.set(1234);
        System.out.println(g2.get());

        // g2.set("Banana");	
        //////////////////////////////////////////////////////
        ArrayList list = new ArrayList();
        populateNumbers(list);

        int total = 0;
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            total += ((Integer) (iter.next())).intValue();
        }
        System.out.println("\nNo.2:");
        System.out.println(total);

        //////////////////////////////////////////////////
        System.out.println("\n----2 example of collections:");
        System.out.println("\nNo.1: ");
        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        /////////////////////////////////////////////////
        System.out.println("\nNo.2: ");
        ArrayList<String> Line = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //////////////////////////////////////////////////
        System.out.println("\n----2 example of Algorithms:");
        System.out.println("\nNo.1:");
        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
        //////////////////////////////////////////////////
        System.out.println("\nNo.2");

        // Creating an array list
        ArrayList<Integer> Algo = new ArrayList<>();

        // Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Sorted ArrayList: " + numbers);

        // Using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);
        /////////////////////////////////////////////////////
    }

    private static List<String> createList() {
        List<String> anotherList = new ArrayList<>();
        anotherList.addAll(Arrays.asList("iPhone", "Ubuntu", "Android",
                "Mac OS X"));
        return anotherList;
    }

    private static void populateNumbers(ArrayList list) {
        list.add(new Integer(1));
        list.add(new Integer(2));
    }
}
