class Person implements Payable, Comparable<Person> {
    private static int idCount = 1;
    private int id;
    private String name;
    private String surname;
    public Person() {
        this.id = idCount++;
    }
    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }
    public int getId() {
        return id;
    }
    public String getFullName() {
        return name + " " + surname;
    }
    public void setFullName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String dispInfo() {
        return id + ". " + getFullName();
    }
    public String getPosition() {
        return "Student";
    }
    public double calcPayment() {
        return 0.00;
    }
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.calcPayment(), other.calcPayment());
    }
}