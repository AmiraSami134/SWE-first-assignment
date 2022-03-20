
package assignment.pkg1;

import java.util.Enumeration;
import java.util.Vector;

public class CourseRecord {
private Student student; 
private Vector <Assignment> assignments;
CourseRecord() {
assignments=new Vector<Assignment>();
}
public Student getStudent() {
return student;
}
public void setStudent(Student s) { 
student = s;
}
public void addAssignment(Assignment a) { 
assignments.addElement(a);
}
public Enumeration getAssignments() { 
return assignments.elements();
}
public double average() throws NotYetSetException {
double sum =0.0;
double avg= 0.0;
int c=0;
for (Assignment a : assignments) {
if (a.getMark() != -1) {
sum += a.getMark();
c++;
} else {
throw new NotYetSetException( 
"Mark is not yet set");
}
}

avg =sum/c;
return avg;
}

public boolean canTakeFinalExam(){
   if(assignments.size() > 3){
         return true;
   }else{ 
        return false;
   }       
}
}
