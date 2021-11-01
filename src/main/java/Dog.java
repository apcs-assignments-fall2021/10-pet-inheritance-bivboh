public class Dog extends Pet {

    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String a, int b, String c){
        super(a, b);
        breed = c;
    }
    public Dog(){
        super("Max", 1);
        breed = "golden retriever";
    }
    

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Woof!");
    }


    // toString method
    public String toString() {
        String str = "Name: " + getName() + ", Age: " + getAge() + "Breed: " + breed;
        return str;
    }


    // Getter
    public String getName() {
        return getName();
    }

    public int getAge() {
        return getAge();
    }

    public String getBreed() {return this.breed;}

    // Setter


    public void setBreed(String breed) {
        // Don't allow blank names
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }

}