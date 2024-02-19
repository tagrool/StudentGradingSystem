public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course physical;
    Course chemical;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course physical,Course chemical) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.physical = physical;
        this.chemical = chemical;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int physical, int chemical) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (physical >= 0 && physical <= 100) {
            this.physical.note = physical;
        }

        if (chemical >= 0 && chemical <= 100) {
            this.chemical.note = chemical;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.physical.note == 0 || this.chemical.note == 0) {
            System.out.println("Notes not entered completely");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarage : " + this.avarage);
            if (this.isPass) {
                System.out.println("Passed the CLass. ");
            } else {
                System.out.println("Failed Class.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.physical.note + this.chemical.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Maths Grade : " + this.mat.note);
        System.out.println("Physics Grade : " + this.physical.note);
        System.out.println("Chemist Grade : " + this.chemical.note);
    }

}