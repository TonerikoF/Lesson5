package Lesson5;

public class Employee {
    String fullName;
    String rang;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String fullName, String rang, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.rang = rang;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getRang() {
        return rang;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public void data(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Ivanov Lev", "Engineer", "iviLev@mailbox.com", "892312313", 27000, 24);
        persArray[2] = new Employee("Zhdanov Vlad", "Engineer", "zdivan@mailbox.com", "892312528", 30000, 27);
        persArray[3] = new Employee("Ivin Nik", "Engineer", "Vinik@mailbox.com", "885712312", 50000, 32);
        persArray[4] = new Employee("Konovalov Denis", "Engineer", "Konon@mailbox.com", "8925232312", 40000, 20);

        for (Employee employee : persArray)
            if (employee.getAge() >= 40)
                System.out.println(employee);
    }
}
