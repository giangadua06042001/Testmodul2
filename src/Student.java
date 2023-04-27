import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
    private String sex;
    private String address;
    private double scores;

    public Student() {
    }

    public Student(String id, String name, int age, String sex, String address, double scores) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.scores = scores;
    }

    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String sex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double scores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", scores=" + scores +
                '}';
    }

}
