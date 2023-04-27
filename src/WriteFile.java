import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteFile {
    public static void  writeTofile(List<Student>students){
        File file=new File("data/student.csv");
        try {
            FileOutputStream outputStream=new FileOutputStream(file);
            ObjectOutputStream oss=new ObjectOutputStream(outputStream);
            oss.writeObject(students);
            outputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
