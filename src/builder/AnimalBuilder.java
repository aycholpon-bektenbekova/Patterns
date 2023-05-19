package builder;

interface AnimalBuilder {
AnimalBuilder setName(String name);
AnimalBuilder setColor(String color);
AnimalBuilder setAge(int age);
AnimalBuilder setSound(String sound);
Animal build();
}

