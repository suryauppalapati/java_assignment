class Encapsulation{
    private String courseName;
    private String coursePrice;

    public String getcourseName(){
        return courseName;
    }

    public String getcoursePrice(){
        return coursePrice;
    }

    public void setcoursePrice(String newValue){
        coursePrice = newValue;
    }

    public void setcourseName(String newValue){
        courseName = newValue;
    }

}
public class Question2 {
    public static void main(String args[]){
        Encapsulation enc = new Encapsulation();
        enc.setcourseName("Java for beginners");
        enc.setcoursePrice("Rs.2499/-");
        System.out.println("Course Name = " + enc.getcourseName());
        System.out.println("Corse Price = " + enc.getcoursePrice());
    } 
}