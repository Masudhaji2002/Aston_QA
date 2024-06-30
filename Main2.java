public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Dog dog1 = new Dog("Snickers");

        Cat[] cats = {
                new Cat("Murzik"),
                new Cat("Barsik"),
                new Cat("Sneshok")
        };

        Cat.Bowl bowl = new Cat.Bowl();

        dog.run(450);
        dog.swim(10);
        dog1.run(600);
        dog1.swim(50);

        System.out.println("Сытость котов до кормления:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isFull() ? "сыт" : "голоден"));
        }

        bowl.addFood(-5);

        for (Cat cat : cats) {
            cat.addFoodToBowl(10);
            cat.eat(10);
        }


        System.out.println("Сытость котов после кормления:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isFull() ? "сыт" : "голоден") + ", в миске " + cat.getFoodAmountInBowl() + " еды");
        }

        System.out.println("Количество созданных животных: " + Animal.getAnimalCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("Количество созданных котов: " + Cat.getCatCount());
    }
}
