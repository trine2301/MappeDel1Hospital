public class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String firstName, String lastName, String personalNumber) {
        super(firstName, lastName, personalNumber);
    }

    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
