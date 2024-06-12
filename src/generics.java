import java.util.ArrayList;
import java.util.Scanner;
public class generics {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("str1"); // It will also throw an error because the arraylist object 'a' will only store int type of values
        a.add(50);
        a.add(64);
        System.out.println(a);
        //int x=(int)a.get(64); it will throw an error
        String x=(String)a.get(0);
        System.out.println(x);
        int y=(int)a.get(1);
        System.out.println(y);
        Scanner inp=new Scanner(System.in);
        int i=0,j=0;
        while(i!=5)
        {
            System.out.println("Enter an integer type number");
            int num=inp.nextInt();
            a.add(num);
            i++;
        }
        System.out.println(a);
        inp.next();
        while(j!=5)
        {
            System.out.println("Enter a String type value");

            String str=inp.nextLine();
            a.add(str);
            j++;
        }
        System.out.println(a);


    }
}
