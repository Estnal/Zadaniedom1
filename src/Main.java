public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tofik ", 4 , true);
        Dog dog2 = new Dog("Bruno ", 7 , true );

        dog1.showInfo();
        dog2.showInfo();

        Cat cat1 = new Cat();
        cat1.name = "Salem ";
        cat1.age = 2;
        cat1.barks = false;

        cat1.showInfo();
    }
}
