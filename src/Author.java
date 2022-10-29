import java.util.Objects;

public class Author {
    String firstName;
    String lastName;
    private Object id;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void printFulName(){
        System.out.println(firstName+" "+ lastName);
    }
    @Override
    public String toString(){
        return this.lastName + " " + this.firstName;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author author = (Author) obj;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }
    public int hashCode() {
        return java.util.Objects.hash(firstName,lastName);
    }
}
