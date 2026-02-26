package c.com;
interface student1{
    void show();
}
class Child implements student1 {
    String name;
    int age;
    Child(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.print(name+age);
    }

}

public class pr1 {
    public static void main(String[] args) {
        Child s = new Child("ABC", 25);
        s.show();
    }
}
