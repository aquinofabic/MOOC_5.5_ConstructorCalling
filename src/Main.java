public class Main {
    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "Home improvement section");
        Product tyre = new Product("Tyre",5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}

/*
CALLING CONSTRUCTORS

A constructor can be called from another constructor using this keyword,
which refers to this object in question.


public Person(String name) {  // constructor call MUST BE FIRST
    this(name, 0);
}

public Person(String name, int age) {  // constructor
    this.name = name;
    this.age = age;
}


The first constructor calls the second constructor and sets the age parameter to 0

**NOTE: If a constructor calls another constructor, the constructor call must be the FIRST command in the constructor.

Now we can create new objects as such:


public static void main(String[] args) {
    Person paul = new Person("Paul", 24);
    Person eve = new Person("Eve");
}

________________________________________________________________________________________________________________________

Constructor calling is a better method as opposed to creating new constructors which repeat code, which is what we're
trying to avoid!


public Person(String name) {  // Inefficient!
    this.name = name;
    this.age = age;
}

public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

 */