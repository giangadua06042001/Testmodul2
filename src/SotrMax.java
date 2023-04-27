import java.util.Comparator;

public class SotrMax  implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.scores(),o1.scores());
    }
}
