public class Main1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Park park = new Park();

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@example.com", "892312313", 40000, 35);
        employees[2] = new Employee("Sidorov Ruslan", "Analyst", "sidorov@example.com", "892312314", 35000, 28);
        employees[3] = new Employee("Kuznetsov Lev", "Designer", "kuznetsov@example.com", "892312315", 45000, 32);
        employees[4] = new Employee("Smirnov Maxim", "Developer", "smirnov@example.com", "892312316", 50000, 40);

        Park.Attraction attraction1 = park.new Attraction("Американские горки", "10:00 - 18:00", 350);
        Park.Attraction attraction2 = park.new Attraction("Колесо обозрения", "11:00 - 20:00", 150);
        Park.Attraction attraction3 = park.new Attraction("Дом с привидениями", "12:00 - 22:00", 500);



        // Выводим информацию о каждом сотруднике
        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }

        // Вывод информации об аттракционах
        attraction1.printInfo();
        System.out.println();
        attraction2.printInfo();
        System.out.println();
        attraction3.printInfo();

    }
}
