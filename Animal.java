abstract public class Animal {
    protected String name;
    protected static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getAnimalCount(){
        return animalCount;
    }
}
