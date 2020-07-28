public class Empolyee extends Person {
    private int empolyeeID;

    public Empolyee(int age, String name, int eid) {
        super(age, name);
        empolyeeID = eid;
    }

    public void setEmpolyeeID(int eid) {
        empolyeeID = eid;
    }


    public int getEmpolyeeID() {
        return empolyeeID;
    }

}
