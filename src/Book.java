public class Book {
    String name;
    Author Author;
    int yearPublic;
    private Object id;

    public Book(String name,Author Author,int yearPublic){
        this.name = name;
        this.Author = Author;
        this.yearPublic = yearPublic;
    }

    public String getName() {
        return name;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public Author getAuthor() {
        return Author;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Название"+this.name + " Автор "+ Author.toString() + " год публикации "+ yearPublic;
    }
    public boolean equals(Object obj) {
        return (this == obj);
    }
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
}
