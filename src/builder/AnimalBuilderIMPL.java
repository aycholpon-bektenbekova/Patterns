package builder;

class AnimalBuilderIMPL implements AnimalBuilder{
      Animal animal = new Animal();

    @Override
    public AnimalBuilder setName(String name) {
        animal.name = name;
        return this;
    }

    @Override
    public AnimalBuilder setColor(String color) {
        animal.color = color;
        return this;
    }

    @Override
    public AnimalBuilder setAge(int age) {
        animal.age = age;
        return this;
    }

    @Override
    public AnimalBuilder setSound(String sound) {
        animal.sound = sound;
        return this;
    }

    @Override
    public Animal build() {
        return animal;
    }
}

