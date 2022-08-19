
public class Monkey extends RescueAnimal {

    // Instance variable
    private String Monkey;

    // Constructer 
    public Monkey(String name, String breed, String gender, String age, 
    String weight, String acquisitionDate, String acquisitionCountry, 
    String trainingStatus, boolean reserved, String inServiceCountry) {
        setname(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }
    
    // Mutator Method
    public void setBreed(String monkeyBreed) { // Update Typo "dogBreed" to "monkeyBreed"
        breed = monkeyBreed;
    }

}