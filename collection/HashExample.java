package collection;

import java.util.HashMap;
import java.util.Hashtable;

public class HashExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm =new HashMap<>();
        hm.put(null, "Manik");
        hm.put(7, null);
        hm.put(2, "");
        hm.put(5, "sandeep");
        hm.put(9, "himanshu");
        System.out.println("HashMap :"+hm);

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(4, "Mansi");
        ht.put(7, "aloya");
        ht.put(5, "Shanaya");
        System.out.println("HashTable :"+ht);

    }
}
