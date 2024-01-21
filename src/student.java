class Student extends Person {
    private double gpa;
    public Student() {
        super();
    }
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
    public String dispInfo() {
        return "Student: " + super.dispInfo();
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double calcPayment() {
        return (gpa > 2.67) ? 36660.00 : 0.00;
    }
}