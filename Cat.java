class Cat extends Animal {
    private boolean isFull;
    private Bowl bowl; // Индивидуальная миска для каждого кота
    protected static int catCount = 0;
    public int limitationRun = 200;

    // Вложенный класс Миска
    static class Bowl {
        private int foodAmount;

        public Bowl() {
            this.foodAmount = 0; // Начальное количество еды в миске
        }

        public int getFoodAmount() {
            return foodAmount;
        }

        public void addFood(int amount) {
            if (amount > 0) {
                foodAmount += amount;
                System.out.println("В миску добавили " + amount + " единиц еды. Теперь в миске " + foodAmount + " единиц еды.");
            } else {
                System.out.println("Нельзя добавить отрицательное количество еды.");
            }
        }

        public boolean decreaseFood(int amount) {
            if (amount > 0 && foodAmount >= amount) {
                foodAmount -= amount;
                return true;
            }
            return false;
        }
    }

    public Cat(String name) {
        super(name);
        this.isFull = false;
        this.bowl = new Bowl(); // Создание индивидуальной миски для каждого кота
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= limitationRun) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(int foodAmount) {
        if (bowl.decreaseFood(foodAmount)) {
            this.isFull = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не хватает еды в миске.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public int getFoodAmountInBowl() {
        return bowl.getFoodAmount();
    }

    public void addFoodToBowl(int amount) {
        bowl.addFood(amount);
    }

    public static int getCatCount() {
        return catCount;
    }
}