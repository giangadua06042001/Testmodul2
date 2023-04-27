import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    ManagerStudent managerStudent = new ManagerStudent();

    public Student addStudent() throws Exception {
        System.out.println("Nhap ma sinh vien");
        String id = scanner.nextLine();
        System.out.println("Nhap ten sinh vien");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi sinh vien");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh sinh vien");
        String sex = scanner.nextLine();
        System.out.println("nhap dia chi cua sinh vien");
        String address = scanner.nextLine();
        System.out.println("nhap diem trung binh cua sinh vien");
        double scores = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, age, sex, address, scores);
        return student;

    }
}



