package pj.miu.quiz1.models;

public class PhoneNumber {
    public int Id;
    public String phoneNumber;
    public String label;

    public UserInformation user;

    public PhoneNumber(String phoneNumber, String label) {
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    @Override
    public String toString(){
        return String.format("{PhoneNumber: %s, label: %s}", phoneNumber, label);
    }
}
