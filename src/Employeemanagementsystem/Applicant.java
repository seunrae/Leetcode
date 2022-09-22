package Employeemanagementsystem;

import java.util.Date;

public class Applicant extends Person {
    private Integer applicantId;
    private String applicationDate;
    private String experience;

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Applicant() {
    }

    public Applicant(Integer id, String firstName, String lastName, String email, String dateOfBirth, Integer applicantId, String applicationDate, String experience) {
        super(id, firstName, lastName, email, dateOfBirth);
        this.applicantId = applicantId;
        this.applicationDate = applicationDate;
        this.experience = experience;
    }
}
