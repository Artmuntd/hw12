import java.util.Objects;
public class Author {
    private String name;
    private String surname;


    public Author(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    @Override
   public String toString(){
        return name + ", " + surname;
   }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return (name + ", " + surname).equals(c2.name + ", " + c2.surname);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,  surname);
    }

}