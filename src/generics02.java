class Dog<E> {
    E id;
    E name;

    public Dog(E id) {
        this.id = id;
        System.out.println(id);
    }

    public Dog(E name, E id) {
        this.id = id;

        this.name = name;

        System.out.println(this.id);
    }
}
class Cat<V>
{
    V id,name;
    V method(V id,V name)
{
    this.id=id;
    this.name=name;
    return name;
}
}



public class generics02 {
    public static void main(String[] args) {
        Dog<String> obj1=new Dog<>("Subi");
        //System.out.println(obj1.method("342","Rahul"));
        Dog<Integer> obj2=new Dog<>(2,10);
        Cat<Integer> obj=new Cat();
        System.out.println(obj.method(12,13));

        //System.out.println(obj2.method(2,3));
      //  System.out.println(obj2.method2(1,2));
        //Dog<Integer> obj3=new Dog<>(21,34);

        //System.out.println(obj2.getID());
        //System.out.println(obj1.getID());

        // two ways to create object of their wrapper class
        // int to Integer
        /*Integer obj1=Integer.valueOf(12);
        Integer obj3=12; //autoboxing
        int age=obj1; //unboxing
        System.out.println(obj1);
        System.out.println(obj3);
        System.out.println(age);
        Boolean bool=Boolean.valueOf(false);*/
    }
}
