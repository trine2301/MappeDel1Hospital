public abstract class Doctor extends Employee {
    public Doctor (String firstName, String lastName, String personalNumber) {
        super(firstName, lastName, personalNumber);
    }

    public void setDiagnosis (Patient patient, String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }

}

