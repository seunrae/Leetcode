package Employeemanagementsystem;


import java.util.Date;

public class Employee extends Person{
    private Integer employeeId;
    private Date employeeDate;
    private Double salary;

    public Employee(Integer id, String firstName, String lastName, String email, String dateOfBirth, Integer employeeId, Date employeeDate, Double salary) {
        super(id, firstName, lastName, email, dateOfBirth);
        this.employeeId = employeeId;
        this.employeeDate = employeeDate;
        this.salary = salary;
    }
}
