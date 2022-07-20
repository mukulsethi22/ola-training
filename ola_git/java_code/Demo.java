//CamelCase --> Classes,interfaces
//camelCase --> variables, functions


class Student{
    private int id;
    private String name;
    int age;

    public void setAge(int value){
        if(value>=0 && value<=200){
            this.age = value;
        }else{
            throw new InvalidValueException("invalid age")
        }
    }
    public void setId(int value){
        this.id = value;
    }

    public int getId(){
        return this.id;
    }

    public void show(){
        System.out.println(this.id +":"+ this.name);
    }
}


public class Demo{

    public static void main(String[] args){
        Student obj = new Student();
        obj.id = 101;
        obj.name = "Alex";
        obj.show();
    }
}