public class Dog extends Animal{
    protected static int dogCount = 0;
    public int limitationSwim = 10;
    public int limitationRun = 500;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= limitationRun) {
            System.out.println(name + " пробежал(а) " + distance + "м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + "м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= limitationSwim) {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
