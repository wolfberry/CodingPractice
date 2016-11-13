import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by HelenLi on 10/15/16.
 * This program shows how to use Collections.binarySearch for Objects
 * First, need to implement custom comparator by implementing Comparator interface;
 * override compare method.
 * make it a private static final function
 */
public class Student {
    public String name;
    public float gpa;

    Student(String name, float gpa){
        this.name = name;
        this.gpa = gpa;
    }

    //override comparator
    private static final Comparator<Student> comGPA = new Comparator<Student>(){
        @Override
        public int compare(Student a, Student b){
            if(a.gpa!= b.gpa){
                return Float.compare(a.gpa, b.gpa);
            }

            return a.name.compareTo(b.name);
        }
    };


    public static boolean searchStudent(List<Student> students, Student target, Comparator<Student> comGPA){
        return Collections.binarySearch(students, target,comGPA)>=0;
    }



}


