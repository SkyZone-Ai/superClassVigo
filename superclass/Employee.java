
package superclass;


public class Employee extends Person {
    
//    float salary =5000f;
//    String name ="Hayato";
//    int age =16;
//
//    Employee(String hayato, int i, float f) {
//        
//    }
//    
//    public void showInfo(){
//        
//        System.out.println("Name : " + super.name);
//        System.out.println("Age : " + super.age);
//        System.out.println("Salary: $" + salary);
//    }
    public Employee(){
        
        super();
        
        System.out.println("Eksekusi konstruktor Employee");    
    }
    public void info(){
        super.showMessage();
    }
}
