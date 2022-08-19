import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>(); // Dog Array List
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); // Monkey Array List
    // Instance variables (if needed)

    public static void main(String[] args) {

        initializeDogList();
        initializeMonkeyList();
        /*
        Student note...
        TODO 
        V 1.0 
        1. Loop that display menu 
        2. make loop approve user input
        3. Take appropriate action
        
        V 1.2
        1. input validation
        2. appropriare feedback to the user
        3. Create scanner & pass it to necessary method

        V Beta
        1. Menu option 4, 5, and 6 must connect to printAnimals() method
        */

     // Creates a scanner class object
    Scanner input = new Scanner(System.in);
    char option;
    // Displays the menu in loop until the user enters the exit option
    do
    {
        displayMenu();
        option=input.next().charAt(0);

        // If user input is 1, intakeNewDog method is called
        if(option=='1') {
            intakeNewDog(input);
        }

        // If the option is 2, the intakeNewMonkey method is called
        else if(option=='2') {
            intakeNewMonkey(input);
        }

        // If the option is 3, the reserveAnimal method is called
        else if(option=='3') {
            reserveAnimal(input);
        }

        // If the option is 4, the printAnimals method is called to print dog list
        else if(option=='4') {
            printAnimals();
        }
        
        // If the option is 5, the printAnimals method is called to print monkey list
        else if(option=='5') {
            printAnimals();
        }

        // If the option is 6, the printAnimals method is called to print all available animals
        else if(option=='6') {
            printAnimals();
        }

        // If the option is q, exit message prints and application stops running
        else if(option=='q') {
            System.out.print("You have exited the application.");
            break;
        }

        // Informs user they didn't input correct information.
        else 
        {
            System.out.print("You have entered an invalid input.");
        }
    }
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }
     /*
     Student Note...
        Everything that is listed below is in order.

     ("name", "Breed", "Gender", "Age", "Weight", "acquisition Date", "acquisition Country", 
     "training Status", "reserved [True or False]", "in Service Country")

     */

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Cassie", "Chimpanzee", "female", "1", "45.8", "05-12-2019", "United States", "intake", false, "United States");
        Monkey monkey2 = new Monkey("Jack", "Capuchin", "male", "5", "110.0", "12-12-2018", "United States", "in service", false, "Germany");
        Monkey monkey3 = new Monkey("David", "Squirrel Monkey", "female", "2", "25.7", "12-12-2020", "Japan", "Phase I", true, "United States");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        scanner.nextLine();
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("When was this dog acquired?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Which country was this dog acquired?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is this dog reserved?");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Which country is the dog in service?");
        String inServiceCountry = scanner.nextLine();
        
        Dog dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, 
        acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(dog4);
        System.out.println("Your entry has been added to the dog list.");
    }


        // Complete intakeNewMonkey
	    //Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	    // to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            scanner.nextLine();
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            System.out.println("When was this monkey acquired?");
            String acquisitionDate = scanner.nextLine();
            System.out.println("Which country was this monkey acquired?");
            String acquisitionCountry = scanner.nextLine();
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();
            System.out.println("Is this monkey reserved?");
            boolean reserved = scanner.nextBoolean();
            scanner.nextLine();
            System.out.println("Which country is the monkey in service?");
            String inServiceCountry = scanner.nextLine();
            System.out.println("How long is the monkey's tail?");
            String tailLength = scanner.nextLine();
            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();
            System.out.println("What species is the monkey?");
            String species = scanner.nextLine();
            
            Monkey monkey4 = new Monkey(name, gender, age, weight, acquisitionDate, 
            acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, 
            bodyLength, species);
            monkeyList.add(monkey4);
            System.out.print("Your entry has been added to the monkey list."); 
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            scanner.nextLine();
            System.out.println("Enter animal type: ");
        String animalType = scanner.nextLine();
        if (animalType.equalsIgnoreCase("Monkey")) {
            System.out.println("Enter the monkey's country of acquisiton: ");
            String country = scanner.nextLine();
            for(Monkey obj: monkeyList) {
                if(obj.getAcquisitionLocation().equalsIgnoreCase(country)) {
                    obj.setReserved(true);
                    return;
                }
            }
            System.out.println("The monkey entered is not in the list");
        }
        
        else if (animalType.equalsIgnoreCase("Dog")) {
                System.out.println("Enter the dog's country of acquisition: ");
                String country = scanner.nextLine();
                for(Dog obj: dogList){
                if(obj.getAcquisitionLocation().equalsIgnoreCase(country)){
                    obj.setReserved(true);
                    return;
                }

            }
            System.out.println("The dog entered is not in the list");
            } 
             else {
            System.out.println("This type doesn't currently exist"); // Update from "Type not found"
            }
    
    }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	    // Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	    // Remember that you only have to fully implement ONE of these lists. 
	    // The other lists can have a print statement saying "This option needs to be implemented".
	    // To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            if (option == '4') {
                System.out.println(dogList);
            }
            else if (option == '5') {
                System.out.println(monkeyList);
            }
            else if (option == '6') {
                // Iterates through dogs
                for (int i = 0; i < dogList.size(); i++) {
                    if (dogList(i).getTrainingStatus.equals("in service") && 
            dogList(i).getReserved()==false) {
                        // Prints dogs that are in service and available
                        System.out.println(dogList.get(i));
                    }
                
                }
                // Iterates through monkeys
                for (int i = 0; i < monkeyList.size(); i++) {
                    if (monkeyList(i).getTrainingStatus().equalsIgnoreCase("in service") && 
                monkeyList(i).getReserved()==false) {
                        // Prints monkeys that are in service and available
                        System.out.println(monkeyList.get(i));
                    } 
                }
            }
        }
}

