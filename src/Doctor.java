public class Doctor extends StaffMember {
    private String licenseNumber;
    private String specialization;
    private int consultationPerWeek;

    public Doctor(String id, String name, String surname, String dob, String contactNo,
                  String licenseNumber, String specialization, int consultationsPerWeek) {
        super(id, name, surname, dob, contactNo);
        this.licenseNumber = licenseNumber;
        this.specialization = specialization;
        this.consultationPerWeek = consultationsPerWeek;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getConsultationPerWeek() {
        return consultationPerWeek;
    }

    public void setConsultationPerWeek(int consultationPerWeek) {
        this.consultationPerWeek = consultationPerWeek;
    }

    @Override
    public String toString() {
        return "Doctor License: "+ licenseNumber + "Speciality: " + specialization + "Consultation per Week: " + consultationPerWeek;
    }

    public String getRole(){
        return "Doctor";
    }
}
