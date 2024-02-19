public class Main {
    public static void main(String[] args) {

        Course maths = new Course("Maths", "MAT101", "MAT");
        Course physical = new Course("Physical", "FZK101", "PYS");
        Course chemical = new Course("Chemical", "KMY101", "CHM");

        Teacher t1 = new Teacher("Toghrul Teacher", "0707707070", "MAT");
        Teacher t2 = new Teacher("Murad Teacher", "0555505050", "PYS");
        Teacher t3 = new Teacher("Ali Teacher", "0996669966", "CHM");

        maths.addTeacher(t1);
        physical.addTeacher(t2);
        chemical.addTeacher(t3);

        Student s1 = new Student("Araz Aliyev", 4, "140144015", maths, physical, chemical);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Feyruz Asadov", 4, "2211133", maths, physical, chemical);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Khara Kharayev", 4, "221121312", maths, physical, chemical);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }
}