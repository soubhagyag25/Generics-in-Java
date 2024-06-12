import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>(); //defining a new arraylist
        ArrayList<String> str=new ArrayList<>(); //of string type
        //add elements
        array.add(432); //syntax---> object_name.add(value);
        array.add(23);
        array.add(597);
        str.add("Soubhagya Gautam");
        str.add("Aloke Lal Barnwal");
        str.add("Sahil Kumar");
        System.out.println(array);
        System.out.println(str);
        //How to add in Between an ArrayList?
        // Syntax----> object_name.add(index_number,value); Note: Index starts from Zero
        array.add(1,22);
        System.out.println(array);
        str.add(1,"Pooja Udupi");
        System.out.println(str);
        // How to delete an element?
        // We use "remove()"
        //syntax---> object_name.remove(index_number);
        array.remove(1);
        str.remove(3);
        System.out.println(array);
        System.out.println(str);
        //how to count the number of elements in your arraylist?
        // (or) how to know the size of the arraylist?
        // for this, we use a function "size"
        //syntax---> object_name.size();
        int size=array.size();
        System.out.println(size); // output:3
        // print the elements of the arrayList using for loop
        for (int i=0;i<array.size();i++)
        {
            System.out.println(array.get(i));

        }
        // Sorting the elements in an arrayList
        //syntax: Collections.sort(object_name);
        // you have to import java.util.Collections
        // or import all the classes in the util package
        // import java.util.*


        Collections.sort(array);
        System.out.println(array);


    }
}
