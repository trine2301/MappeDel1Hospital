
public class Patient extends Person implements Diagnosable {
    private String diagnosis;

    public Patient(String firstName, String lastName, String personalNumber) {
        super(firstName, lastName, personalNumber);

    }

    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
