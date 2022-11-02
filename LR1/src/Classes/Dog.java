package Classes;
import Interfaces.*;

public class Dog extends Animal implements Biteable, Shoutable, Runable, Jumpable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void bite() {
        System.out.println("Dog " + name + " bite");
    }

    @Override
    public void jump() {
        System.out.println("Dog " + name + " jump");
    }

    @Override
    public void run() {
        System.out.println("Dog " + name + " run");
    }

    @Override
    public void shout() {
        System.out.println("Dog " + name + " shout");
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        return super.hashCode() * 29;
    }

}
