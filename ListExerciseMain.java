package Collection;
import java.util.*;

public class ListExerciseMain {
    public static void main(String[] args){

        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getStudents();
        for(String student : listExercise.students){
            System.out.println(student);

        }
        System.out.println(listExercise.getStudents().size());
    }
}
