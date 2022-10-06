package Collection;
import java.util.*;
public class ListExercise {
    private List<String> students;

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("김경록");
    }

    public List<String> getStudents(){
        return this.students;
    }

}
