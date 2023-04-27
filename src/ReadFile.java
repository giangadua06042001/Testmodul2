import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
     public List<ManagerStudent> readFile(){
         List<ManagerStudent>managerStudents=new ArrayList<>();
         try{
             File file=new File("data/student.csv");
             FileInputStream inputStream=new FileInputStream(file);
             if((inputStream.available()!=0)){
                 ObjectInputStream oss=new ObjectInputStream(inputStream);
                 managerStudents=(List<ManagerStudent>) oss.readObject();
             }
         }catch (Exception e){
             e.printStackTrace();
         }
     return managerStudents;
     }
}
