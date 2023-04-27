import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ManagerStudent implements Serializable {
    private List<Student> students;

    public ManagerStudent(List<Student> students) {
        this.students = students;
    }

    public ManagerStudent() {
        this.students=new ArrayList<>();
        ReadFile readFile=new ReadFile();
        readFile.readFile();

    }
    public void read(){
        ReadFile readFile=new ReadFile();
        readFile.readFile();
    }
    public void writeFile(){
        WriteFile.writeTofile(students);
    }

    //ham them sinh vien.
    public void add(Student student) {
        students.add(student);
    }


    //ham hien thi
    public void showList() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //ham sua cap nhat.
    public void update(String id, Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id().equals(id)) {
                students.set(i, student);
            } else {
                System.out.println("Khong tim duoc ma sinh vien voi ma sinh vien tren");
            }
        }
    }

    private int getIndex(String id) {
        int index = -1;
        for (Student student : students) {
            if (student.id().equals(id)) {
                System.out.println(student);
                return students.indexOf(student);
            } else {
                System.out.println("khong tim duoc ma sinh vien voi ma sinh vien nay");
            }
        }
        return index;
    }

    //ham xoa sinh vien theo id
    public void delete(String id) {
        int index = getIndex(id);
        if (index >= 0) {
            students.remove(index);
        }
    }

    //ham sap xep giam
    public List<Student>sortMin(){
        students.sort(new Sort());
        return students;
    }
    //ham sap xep tang
    public List<Student>sortMax(){
        students.sort(new SotrMax());
        return students;
    }
    public int getValid(int min, int max){
        Scanner scanner=new Scanner(System.in);
        int choice;
        while (true){
            if(scanner.hasNext()){
                choice=scanner.nextInt();
                if(choice>=min && choice<=max){
                    scanner.nextLine();
                    return choice;
                }
            }
            System.out.println("Lua chon khong hop le! vui long chon lai");
            scanner.nextLine();
        }
    }

}
