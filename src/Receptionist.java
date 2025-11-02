public class Receptionist extends StaffMember{
    private String deskNumber;
    private int housePerWeek;

    public Receptionist(String id, String name, String surname, String dob, String contactNo, String deskNumber, int housePerWeek) {
        super(id, name, surname, dob, contactNo);
        this.deskNumber = deskNumber;
        this.housePerWeek = housePerWeek;
    }

    public String getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(String deskNumber) {
        this.deskNumber = deskNumber;
    }

    public int getHousePerWeek() {
        return housePerWeek;
    }

    public void setHousePerWeek(int housePerWeek) {
        this.housePerWeek = housePerWeek;
    }

    @Override
    public String toString() {
        return "Receptionist: "+ super.toString() + "Desk Number: " + deskNumber + "\nHousePerWeek: " + housePerWeek;
    }

    public String getRole(){
        return "Receptionist";
    }
}
