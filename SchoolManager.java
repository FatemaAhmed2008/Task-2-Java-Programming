

import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {

    // Student class
    static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Teacher class
    static class Teacher {
        private String name;

        public Teacher(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // SchoolClass class
    static class SchoolClass {
        private String className;
        private Teacher teacher;
        private List<Student> students;

        public SchoolClass(String className, Teacher teacher, List<Student> students) {
            this.className = className;
            this.teacher = teacher;
            this.students = students;
        }

        public String getClassName() {
            return className;
        }

        public Teacher getTeacher() {
            return teacher;
        }

        public List<Student> getStudents() {
            return students;
        }

        public void printClassInfo() {
            System.out.println("Class name: " + className);
            System.out.println("Teacher: " + teacher.getName());
            System.out.println("Number of students: " + students.size());
            System.out.println();
        }
    }

    // School class
    static class School {
        private List<Student> students;
        private List<Teacher> teachers;
        private List<SchoolClass> classes;

        public School() {
            students = new ArrayList<>();
            teachers = new ArrayList<>();
            classes = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void removeStudent(Student student) {
            students.remove(student);
        }

        public void addTeacher(Teacher teacher) {
            teachers.add(teacher);
        }

        public void removeTeacher(Teacher teacher) {
            teachers.remove(teacher);
        }

        public void addClass(SchoolClass schoolClass) {
            classes.add(schoolClass);
        }

        public void removeClass(SchoolClass schoolClass) {
            classes.remove(schoolClass);
        }

        public void printSchoolInfo() {
            System.out.println("School information:");
            System.out.println("Number of students: " + students.size());
            System.out.println("Number of teachers: " + teachers.size());
            System.out.println("Number of classes: " + classes.size());
            System.out.println();
        }

        public void printAllClassDetails() {
            for (SchoolClass c : classes) {
                c.printClassInfo();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        School school = new School();

        // Add students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Cathy");
        Student s4 = new Student("David");

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        school.addStudent(s4);

        // Add teachers
        Teacher t1 = new Teacher("Jens Amalia");
        Teacher t2 = new Teacher("Elise Giiwedin");
        Teacher t3 = new Teacher("Angelika Lotta");

        school.addTeacher(t1);
        school.addTeacher(t2);
        school.addTeacher(t3);

        // Create and add classes
        List<Student> mathStudents = new ArrayList<>(List.of(s1, s2, s3, s4));
        List<Student> englishStudents = new ArrayList<>(List.of(s1, s2, s3));
        List<Student> scienceStudents = new ArrayList<>(List.of(s1, s2, s3, s4));

        SchoolClass mathClass = new SchoolClass("Mathematics", t1, mathStudents);
        SchoolClass englishClass = new SchoolClass("English", t2, englishStudents);
        SchoolClass scienceClass = new SchoolClass("Science", t3, scienceStudents);

        school.addClass(mathClass);
        school.addClass(englishClass);
        school.addClass(scienceClass);

        // Print initial info
        school.printSchoolInfo();
        school.printAllClassDetails();

        // Remove one student, one teacher, one class
        school.removeStudent(s4);
        school.removeTeacher(t3);
        school.removeClass(scienceClass);

        // Print updated info
        System.out.println("School information after removing one student, teacher and Class:");
        school.printSchoolInfo();
        school.printAllClassDetails();
    }
}

