public class Student {
    private String name=null;
    private int roll;
    public  Student(){
        System.out.println("Student class object");
    }
    public void data(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    public void printStudent(){
        System.out.println("Student Name: "+this.name+ " Roll Number : "+this.roll);
    }
    
}
