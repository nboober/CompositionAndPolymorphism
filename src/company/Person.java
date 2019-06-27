package company;

public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        job.setRole("Developer");
        this.education = new Education();
    }

    public long getSalary() {
        return job.getSalary();
    }

    public String toString(){
        return job.toString() + "\n" + education.toString();
    }
}
