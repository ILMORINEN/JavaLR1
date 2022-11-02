import Classes.Dog;
import Classes.Puppy;

public class Program {
    public static void main(String[] args) {
        Puppy puppy1 = new Puppy("Billy");
        Puppy puppy2 = new Puppy("Billy");
        System.out.println(puppy1.equals(puppy2));
        System.out.println(puppy1.hashCode());
        System.out.println(puppy2.hashCode());
        System.out.println(puppy1.toString());
        System.out.println(puppy2.toString());
        System.out.println(puppy1.getName());
        puppy1.run();
        puppy1.shout();
        puppy1.bite();
        puppy1.jump();
    }
}
