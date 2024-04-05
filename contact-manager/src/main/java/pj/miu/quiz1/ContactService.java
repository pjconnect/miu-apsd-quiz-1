package pj.miu.quiz1;

import pj.miu.quiz1.models.EmailAddress;
import pj.miu.quiz1.models.JobTitles;
import pj.miu.quiz1.models.PhoneNumber;
import pj.miu.quiz1.models.UserInformation;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    List<UserInformation> userInformation = new ArrayList<>();

    public int addContact(String firstName, String lastName,  String company){
        var newUser = new UserInformation(firstName, lastName, company);
        userInformation.add(newUser);
        //TODO give permanent ID for each users
        return userInformation.size() - 1;
    }

    public void addUserJob(String jobTitle, int arrayId){
        userInformation.get(arrayId).jobTitle.add(new JobTitles(jobTitle));

    }


    public void addPhone(String phone, String label, int arrayId) {
        userInformation.get(arrayId).phoneNumbers.add(new PhoneNumber(phone, label));
    }

    public void addEmail(String mail, String label, int arrayId) {
        userInformation.get(arrayId).emailAddresses.add(new EmailAddress(mail, label));
    }

    public List<UserInformation> getUserInformation() {
        return userInformation;
    }
}
