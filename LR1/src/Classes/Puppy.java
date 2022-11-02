package Classes;
// На защиту содать добавить классу щенка другое поведение
public class Puppy extends Dog{
    public Puppy(String name) {
        super(name);
    }

    // ЗАДАНИЕ НА ЗАЩИТУ
    @Override
    public void bite()
    {
        System.out.println("Puppy " + name + " bite");
    }
    @Override
    public void jump() {
        System.out.println("Puppy " + name + " jump");
    }

    @Override
    public void run() {
        System.out.println("Puppy " + name + " run");
    }

    @Override
    public void shout() {
        System.out.println("Puppy " + name + " shout");
    }
    // ЗАДАНИЕ НА ЗАЩИТУ
    //fdsfds


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
        return super.hashCode() * 31;
    }
}
