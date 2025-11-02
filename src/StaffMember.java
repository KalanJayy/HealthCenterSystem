public abstract class StaffMember {
    private String staffId;
    private String staffName;
    private String surname;
    private String dob;
    private String contactNo;

    public StaffMember(String staffId, String staffName, String surname, String dob, String contactNo) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.surname = surname;
        this.dob = dob;
        this.contactNo = contactNo;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "ID: "  + staffId + ", Name: " + staffName + ", Surname: " + surname;
    }

    public abstract String getRole();
}
