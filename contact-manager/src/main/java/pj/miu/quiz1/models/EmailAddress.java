package pj.miu.quiz1.models;

public class EmailAddress {
    public int Id;
    private String Email;
    private String Label;

    public EmailAddress(String email, String label) {
        Email = email;
        Label = label;
    }

    public UserInformation user;

    @Override
    public String toString(){
        return String.format("{Email: %s, Label: $s}", Email, Label);
    }

}
