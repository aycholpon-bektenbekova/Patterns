package builder;

class Animal {
    String name;
    String color;
    String sound;
    int age;
    public void print() {
        System.out.println(name + " " + age + " " + color + " " + sound);
    }

    public Animal() {
        this.name = name;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public Animal(String name, String sound, int age) {
        this.name = name;
        this.sound = sound;
        this.age = age;
    }

    public Animal(String name, String color, String sound, int age) {
        this.name = name;
        this.color = color;
        this.sound = sound;
        this.age = age;
    }
}

