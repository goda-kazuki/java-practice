public class Empolyee extends Person {
    private String company;

    public Empolyee(int age, String name, String company) {
        super(age, name);
        this.company = company;
    }

    public void printCompany() {
        System.out.println(company);
    }

}
