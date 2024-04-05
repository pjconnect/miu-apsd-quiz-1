package pj.miu.quiz1;

import pj.miu.quiz1.models.UserInformation;

import java.lang.reflect.Array;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        var contactService = new ContactService();
        // seed data
        var user1Id = contactService.addContact("David", "Sanger", "Argo LLC");
        contactService.addUserJob("Sales", user1Id);
        contactService.addUserJob("Manager", user1Id);
        contactService.addPhone("240- 133-0011", "Home", user1Id);
        contactService.addPhone("240-112-0123", "Mobile", user1Id);
        contactService.addEmail("dave.sang@gmail.com", "Home", user1Id);
        contactService.addEmail("dsanger@argos.com", "Work", user1Id);

        var user2Id = contactService.addContact("Carlos", "Jimenez", "Zappos");
        contactService.addUserJob("Director", user2Id);

        var user3Id = contactService.addContact("Ali", "Gafar", "BMI Services");
        contactService.addUserJob("HR", user3Id);
        contactService.addUserJob("Manager", user3Id);
        contactService.addPhone("412-116-9988", "Work", user3Id);
        contactService.addEmail("ali@bmi.com", "Work", user1Id);

        var sortedArr = contactService.getUserInformation().stream()
                .sorted(Comparator.comparing(t -> t.lastName))
                .toArray()
                ;

        for(var c : sortedArr){
            System.out.println(c);
        }



    }
}