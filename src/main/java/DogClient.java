public class DogClient {
    public static void main(String[] args) {
        Dog toffee = new Dog("Toffee", 1, "goldendoodle");
        Dog doggie = new Dog();
        toffee.makeNoise();
        doggie.makeNoise();
        toffee.toString();
        doggie.toString();
        toffee.getName();
        toffee.getAge();
        toffee.getBreed();
        doggie.getName();
        doggie.getAge();
        doggie.getBreed();
        toffee.setName("Toffee M");
        toffee.setAge(2);
        toffee.setBreed("medium goldendoodle");
        doggie.setName("bill");
        doggie.setAge(4);
        doggie.setBreed("german shepherd");
        toffee.toString();
        doggie.toString();
        toffee.getName();
        toffee.getAge();
        toffee.getBreed();
        doggie.getName();
        doggie.getAge();
        doggie.getBreed();
    }
}