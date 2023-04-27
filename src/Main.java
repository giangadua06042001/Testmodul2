import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ManagerStudent managerStudent=new ManagerStudent();
        Input input=new Input();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("""
                    ____Chuong trinh quan li sinh vien_____
                    chon chuc nang theo so de tiep tuc
                    1.Xem danh sach sinh vien
                    2.them moi
                    3.cap nhat
                    4.Xoa
                    5.Sap xep
                    6.Doc tu file
                    7.Ghi vao file
                    8.Thoat
                    Chon chuc nang:
                    
                    """);
            int choice= managerStudent.getValid(1,8);
            switch (choice){
                case 1:
                    System.out.println("Danh sach sinh vien");
                    managerStudent.showList();
                    System.out.println("""
                            Ban muon them moi khong 
                            a.Them danh sach sinh vien 
                            b.Huy
                            """);
                    String choi=scanner.nextLine();
                    switch (choi) {
                        case "a":
                            managerStudent.add(input.addStudent());
                            System.out.println("Them thanh cong sinh vien");
                            break;
                        case "b":
                            System.out.println("huy lenh thanh cong!");
                            break;
                    }break;
                case 2 :
                    System.out.println("Them nhan vien ");
                    managerStudent.add(input.addStudent());
                    System.out.println("them nhan vien thanh cong");
                    break;

                case 3:
                    System.out.println("Sua lai nhan vien");
                    System.out.println("nhap ma id ban  muon sua");
                    String id= scanner.nextLine();
                    System.out.println("nhap lai ma sinh vien");
                    String id1=scanner.nextLine();
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
                    managerStudent.update(id,new Student(id1,name,age,sex,address,scores));
                    break;
                case 4:
                    System.out.println("nhap ma sinh vien ban muon xoa");
                    String id3=scanner.nextLine();
                    System.out.println("""
                            Ban xac nhap xoa khong? lua chon
                            a.Xac nhap 
                            b.huy lenh thanh cong
                            
                            """);
                    String in=scanner.nextLine();
                    if(in.equals("a")){
                        managerStudent.delete(id3);
                        System.out.println("Ban da xoa sinh vien nay thanh cong");
                    }
                    else if(in.equals("b")){
                        System.out.println("ban da huy thanh cong");
                    }
                    break;
                case 5:
                    System.out.println("""
                            _____Sap xep sinh vien theo diem trung binh___
                            a.Sap xep diem trung binh tang dan
                            b.Sap xep diem trung binh giam dan
                            c.thoai
                            """);
                    String is=scanner.nextLine();
                    if(is.equals("a")){
                        managerStudent.sortMax();
                    }
                    else if(is.equals("b")){
                        managerStudent.sortMin();
                    }
                    else if(is.equals("c")){
                        System.out.println("quay lai menu chinh");
                    }
                    break;
                case 6:
                    managerStudent.read();

                case 7:
                    managerStudent.writeFile();



            }

        }while (true);

    }
}