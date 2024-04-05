package pj.miu.quiz1.models;

public class JobTitles {
    public String jobTitle;

    public JobTitles(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString(){
        return String.format("{jobTitle: %s}", jobTitle);
    }
}
