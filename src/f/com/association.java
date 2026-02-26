package f.com;

class Teacher{
    String name;
    Teacher(String name){
        this.name=name;
    }
}
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    void learn(Teacher t){
        System.out.print(name+" learns from "+t.name);
    }
}
public class association{
    public static void main(String[] args){
        Teacher t=new Teacher("TEACH");
        Student s=new Student("Sam");
        s.learn(t);
    }
}
