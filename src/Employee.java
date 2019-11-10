public class Employee {

    String firstName;
    String lastName;
    double monthlySalary;
    boolean isStudent;
    boolean isParent;


    double annualSalary() {
        return monthlySalary * 12;
    }

    String fullName() {
        return firstName + " " + lastName;
    }

    //int numberOfVacationDays(); //28 if student +20 days if parent +5 days
    int numberOfVacationDays() {
        if (isParent) {
            return 28 + 5;
        } else if (isStudent) {
            return 28 + 20;
        } else {
            return 28;
        }
    }

    public Employee(String firstName, String lastName, double monthlySalary, boolean isStudent, boolean isParent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        this.isStudent = isStudent;
        this.isParent = isParent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setParent(boolean parent) {
        isParent = parent;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                ", isStudent=" + isStudent +
                ", isParent=" + isParent +
                '}';
    }
}
