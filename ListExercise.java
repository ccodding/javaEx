package Collection;
import java.util.*;
public class ListExercise {
    List<String> students;

    public ListExercise(){ // 생성자

        this.students = new ArrayList<>();
        this.students.add("김경록");
    }

    public List<String> getStudents(){
        return this.students;
    }
    
}