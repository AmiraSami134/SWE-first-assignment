
package assignment.pkg1;
import java.util.*;

 
class NotYetSetException extends Exception
{
public NotYetSetException(String s) { 
super(s);
}}
public class Assignment1 {
 
     public static void main(String[] args) {
        
        Course swe = new Course();
        swe.setTitle("SWE");
        Course java = new Course();
        java.setTitle("Java");
        Course os = new Course();
        os.setTitle("OS");
        Course bio = new Course();
        bio.setTitle("Bio");
        Student s1 = new Student();
        s1.setName("ahmed");
        Student s2 = new Student();
        s2.setName("ola");
        Student s3 = new Student();
        s3.setName("ali");
        Student s4 = new Student();
        s4.setName("nada");
        Student s5 = new Student();
        s5.setName("ahlam");
        Student s6 = new Student();
        s6.setName("mohamed");
        Student s7 = new Student();
        s7.setName("amr");
        Student s8 = new Student();
        s8.setName("omar");
        Student s9 = new Student();
        s9.setName("amira");
        Student s10 = new Student();
        s10.setName("mona");
        CourseRecord cr1 = new CourseRecord();
        cr1.setStudent(s1);
        CourseRecord cr2 = new CourseRecord();
        cr2.setStudent(s2);
        CourseRecord cr3 = new CourseRecord();
        cr3.setStudent(s3);
        CourseRecord cr4 = new CourseRecord();
        cr4.setStudent(s4);
        CourseRecord cr5 = new CourseRecord();
        cr5.setStudent(s5);
        CourseRecord cr6 = new CourseRecord();
        cr6.setStudent(s6);
        CourseRecord cr7 = new CourseRecord();
        cr7.setStudent(s7);
        CourseRecord cr8 = new CourseRecord();
        cr8.setStudent(s8);
        CourseRecord cr9 = new CourseRecord();
        cr9.setStudent(s9);
        CourseRecord cr10 = new CourseRecord();
        cr10.setStudent(s10);
        
        Assignment ahmed_1 = new Assignment();
        Assignment ahmed_2 = new Assignment();
        Assignment ahmed_3 = new Assignment();
        Assignment ahmed_4 = new Assignment();
        Assignment ola_1 = new Assignment();
        Assignment ola_2 = new Assignment();
        Assignment ola_3 = new Assignment();
        Assignment ola_4 = new Assignment();
        Assignment ali_1 = new Assignment();
        Assignment ali_2 = new Assignment();
        Assignment ali_3 = new Assignment();
        Assignment ali_4 = new Assignment();
        Assignment nada_1 = new Assignment();
        Assignment nada_2 = new Assignment();
        Assignment nada_3 = new Assignment();
        Assignment nada_4 = new Assignment();
        Assignment ahlam_1 = new Assignment();
        Assignment ahlam_2 = new Assignment();
        Assignment ahlam_3 = new Assignment();
        Assignment ahlam_4 = new Assignment();
        Assignment mohamed_1 = new Assignment();
        Assignment mohamed_2 = new Assignment();
        Assignment mohamed_3 = new Assignment();
        Assignment mohamed_4 = new Assignment();
        Assignment amr_1 = new Assignment();
        Assignment amr_2 = new Assignment();
        Assignment amr_3 = new Assignment();
        Assignment amr_4 = new Assignment();
        Assignment omar_1 = new Assignment();
        Assignment omar_2 = new Assignment();
        Assignment omar_3 = new Assignment();
        Assignment omar_4 = new Assignment();
        Assignment amira_1 = new Assignment();
        Assignment amira_2 = new Assignment();
        Assignment amira_3 = new Assignment();
        Assignment amira_4 = new Assignment();
        Assignment mona_1 = new Assignment();
        Assignment mona_2 = new Assignment();
        Assignment mona_3 = new Assignment();
        Assignment mona_4 = new Assignment();
        ahmed_1.setMark(89);
        ahmed_2.setMark(75);
        ahmed_3.setMark(93);
        ahmed_4.setMark(87);
        ali_1.setMark(93);
        ali_2.setMark(86);
        ali_3.setMark(82);
        ali_4.setMark(75);
        nada_1.setMark(85);
        nada_2.setMark(98);
        nada_3.setMark(86);
        nada_4.setMark(69);
        ahlam_1.setMark(90);
        ahlam_2.setMark(81);
        ahlam_3.setMark(79);
        ahlam_4.setMark(84);
        mohamed_1.setMark(98);
        mohamed_2.setMark(78);
        mohamed_3.setMark(80);
        mohamed_4.setMark(73);
        amr_1.setMark(55);
        amr_2.setMark(87);
        amr_3.setMark(59);
        amr_4.setMark(79);
        omar_1.setMark(85);
        omar_2.setMark(88);
        omar_3.setMark(87);
        omar_4.setMark(72);
        amira_1.setMark(95);
        amira_2.setMark(96);
        amira_3.setMark(98);
        amira_4.setMark(93);
        mona_1.setMark(96);
        mona_2.setMark(93);
        mona_3.setMark(89);
        mona_4.setMark(79);
        cr1.addAssignment(ahmed_1);
        cr1.addAssignment(ahmed_2);
        cr1.addAssignment(ahmed_3);
        cr1.addAssignment(ahmed_4);
        cr2.addAssignment(ola_1);
        cr2.addAssignment(ola_2);
        cr2.addAssignment(ola_3);
        cr2.addAssignment(ola_4);
        cr3.addAssignment(ali_1);
        cr3.addAssignment(ali_2);
        cr3.addAssignment(ali_3);
        cr3.addAssignment(ali_4);
        cr4.addAssignment(nada_1);
        cr4.addAssignment(nada_2);
        cr4.addAssignment(nada_3);
        cr4.addAssignment(nada_4);
        cr5.addAssignment(ahlam_1);
        cr5.addAssignment(ahlam_2);
        cr5.addAssignment(ahlam_3);
        cr5.addAssignment(ahlam_4);
        cr6.addAssignment(mohamed_1);
        cr6.addAssignment(mohamed_2);
        cr6.addAssignment(mohamed_3);
        cr6.addAssignment(mohamed_4);
        cr7.addAssignment(amr_1);
        cr7.addAssignment(amr_2);
        cr7.addAssignment(amr_3);
        cr7.addAssignment(amr_4);
        cr8.addAssignment(omar_1);
        cr8.addAssignment(omar_2);
        cr8.addAssignment(omar_3);
        cr8.addAssignment(omar_4);
        cr9.addAssignment(amira_1);
        cr9.addAssignment(amira_2);
        cr9.addAssignment(amira_3);
        cr9.addAssignment(amira_4);
        cr10.addAssignment(mona_1);
        cr10.addAssignment(mona_2);
        cr10.addAssignment(mona_3);
        cr10.addAssignment(mona_4);
        swe.addCourseRecord(cr1);
//        swe.addCourseRecord(cr2);
        swe.addCourseRecord(cr3);
//        swe.addCourseRecord(cr4);
        swe.addCourseRecord(cr5);
//        swe.addCourseRecord(cr6);
        swe.addCourseRecord(cr7);
//        swe.addCourseRecord(cr8);
        swe.addCourseRecord(cr9);
//        swe.addCourseRecord(cr10);
        swe.printBestStudent();
        swe.printCourseStudents();
        swe.printFinalExamStudents();
//        java.addCourseRecord(cr1);
        java.addCourseRecord(cr2);
//        java.addCourseRecord(cr3);
        java.addCourseRecord(cr4);
//        java.addCourseRecord(cr5);
        java.addCourseRecord(cr6);
//        java.addCourseRecord(cr7);
        java.addCourseRecord(cr8);
//        java.addCourseRecord(cr9);
        java.addCourseRecord(cr10);
        java.printBestStudent();
        java.printCourseStudents();
        java.printFinalExamStudents();
        os.addCourseRecord(cr1);
        os.addCourseRecord(cr2);
//        os.addCourseRecord(cr3);
        os.addCourseRecord(cr4);
        os.addCourseRecord(cr5);
//        os.addCourseRecord(cr6);
        os.addCourseRecord(cr7);
        os.addCourseRecord(cr8);
//        os.addCourseRecord(cr9);
        os.addCourseRecord(cr10);
        os.printBestStudent();
        os.printCourseStudents();
        os.printFinalExamStudents();
//        bio.addCourseRecord(cr1);
        bio.addCourseRecord(cr2);
        bio.addCourseRecord(cr3);
//        bio.addCourseRecord(cr4);
        bio.addCourseRecord(cr5);
        bio.addCourseRecord(cr6);
//        bio.addCourseRecord(cr7);
        bio.addCourseRecord(cr8);
        bio.addCourseRecord(cr9);
//        bio.addCourseRecord(cr10);
        bio.printBestStudent();
        bio.printCourseStudents();
        bio.printFinalExamStudents();
        
       }
    }
