package com.company.collection;

import com.company.Animal;

import java.util.*;

public class Example {

    public static void main(String[] args) {
        int x = 7;
        String name = "Abhi";
        String[] arr = {"Abc", "rock"};

        int[] ints = {4,2,3};

        List<Integer> list1 = List.of(3,4,5);
        List<Integer> list = new ArrayList<>();

        List<Object> list2 = new ArrayList();
        list2.add(5);
        list2.add("Raju");
        list2.add(9);
        list2.add("Abhinash");
        System.out.println(list2);




        list.add(4);
//
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(3);

list.add(0,8);
        System.out.println(list);
list.removeAll(Collections.singletonList(3));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));//value at first position
        list.clear();
        System.out.println(list);


        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(12);
        set.add(6);
        set.add(9);

        System.out.println(set);

        //List follow insertion order
        //set foloow sorted order
        //list allow duplicate
        //set doesnot allow duplicate
        //list is index baed
        //set is not index based








        double[] doubles = {2.33, 6.77};
        Animal[] animals={};



    }



}
