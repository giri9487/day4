package g.com;
abstract class student{
    String name;
    int age;
    student(String name,int age){
        this.name=name;
        this.age=age;


    }
    abstract void show();
}
class child extends student{
    int roll;
    child(String name,int age,int roll){
        super(name,age);
        this.roll=roll;
    }
    void show(){
        System.out.print(name+age+roll);
    }
}
public class abstract1{
    public static void main(String[] args){
        child obj=new child("hunt",12,31);
        obj.show();
    }

}