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
        return (this == obj);
    }
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
}
