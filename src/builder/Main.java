package builder;

public class Main {
    public static void main(String[] args) {
        Animal animal = new AnimalBuilderIMPL().setName("Cat").setAge(5).build();
        animal.print();
    }
}

