package com.company;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
	// write your code here
      //Collection
      //1.  SET(Interface) : Use to store unique value, duplication not possible here
            //1.1 Hashset(Class) : Hashset give elements in random order
            //1.2 LinkedHashSet(Class) : LinkedHashSet insert or give element in order
            //1.3 SortedSet(Class)
            //1.4 TreeSet(Class) : TreeSet give elements in sorted format

      //2.  LIST(Interface) :
            //2.1 ArrayList(Class) : Dynamic, increase by 50%, not thread safe, fast, not preferable for add and
                                    // remove element as it's change the index of each element from the position
                                    // where we add or remove element
            //2.2 Vector(Class) : Dynamic, increase by 100%, thread safe, slow
            //2.3 LinkedList(Class) : LinkedList use where we need to add remove element from list, it's only change the
                                    // index of previous and next element. It's faster than arraylist in case of add
                                    // or remove element

      //3.  QUEUE
            //3.1 PriorityQueue
            //3.2 LinkedList

      //4.  MAP(Interface) : Store value in key value pair
            //4.1 HashMap(Class) : not synchronized, not thread safe, not idle for multi-thread, fast, allow one null key.
            //4.2 HashTable(Class) :synchronized,  thread safe,  idle for multi-thread, slower than hashmap, doesn't
                                   // allow one null key.
            //4.3 LinkedHashMap(Class) : insertion order not fixed in hashmap and hashtable, if we want insertion order
                                        // should be fixed than use LinkedHashMap
            //4.4 TreeHashMap(Class) : If you want your map is in sorted format than use TreeHashMap
    }
}
