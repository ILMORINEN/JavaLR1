package Classes;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("");
    }

    @Override
    public String toString()
    {
        return this.name;
    }

    @Override
    public boolean equals(Object obj)
    {
        Animal animal = (Animal) obj;
        return this.name == animal.getName();
    }

    @Override
    public int hashCode()
    {
        return name.hashCode();
    }
}
