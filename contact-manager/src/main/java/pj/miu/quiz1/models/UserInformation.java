package pj.miu.quiz1.models;

import java.util.ArrayList;
import java.util.List;

public class UserInformation {
    public int Id;
    public String firstName;
    public String lastName;
    public String company;
    public List<JobTitles> jobTitle = new ArrayList<>();

    public List<PhoneNumber> phoneNumbers = new ArrayList<>();
    public List<EmailAddress> emailAddresses = new ArrayList<>();

    public UserInformation(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    @Override
    public String toString(){
        return String.format("{firstName: %s, lastName: %s, company: %s, jobTitles: %s, phoneNumbers: %s, emailAddresses: %s}", firstName, lastName, company, jobTitle.toString(), phoneNumbers.toString(), emailAddresses.toString());
    }
}
