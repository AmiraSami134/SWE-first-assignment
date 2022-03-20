
package assignment.pkg1;

import java.util.Enumeration;
import java.util.Vector;

public class Course {
private String title;
private Vector <CourseRecord> courseRecords;
Course(){
    courseRecords=new Vector <CourseRecord>();
} 
public String getTitle(){
    return title;
} 
public void setTitle( String t){
    title=t;
}
public void addCourseRecord(CourseRecord cr){ 
courseRecords.addElement(cr);
}
public Enumeration getCourseRecords(){ 
return courseRecords.elements();
}
public void printCourseStudents(){
System.out.println("The students of the course: ");
for (CourseRecord cr : courseRecords ) { 
System.out.println(cr.getStudent().getName());
}}
public void printBestStudent(){
double max = -1;
Student bestStudent = null;
for (CourseRecord cr : courseRecords ) { 
    try {
        double average =cr.average();
        if (average> max){
            max = average;
            bestStudent =cr.getStudent();
        }
    }catch (NotYetSetException ex){
}
}
System.out.println("the best student is: " + bestStudent.getName() +" with GPA: " + max);
}
public void printFinalExamStudents(){
  System.out.println("The students of the exams are: ");
  for ( CourseRecord cr :courseRecords) {
     if (cr.canTakeFinalExam()) {
        System.out.println(cr.getStudent().getName());
 }
}
}}
