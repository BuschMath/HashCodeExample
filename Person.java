
/* In this example, the Person class overrides the hashCode()
    method to generate a hash code value based on the object's 
    name and age attributes. The formula used here is a common 
    one that helps to distribute hash codes evenly.*/

public class Person {
    private String name;
    private int age;

    // constructor and getters/setters omitted for brevity

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
