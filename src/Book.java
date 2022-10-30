public class Book {
    private Author author;

    private  String name;
    private int year;


    public Book(  Author author, int year, String name){

        this.author = author;
        this.year=year;
        this.name = name;

    }
    public  Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }

    public String getName(){
        return this.name;
    }
    public  void setYear( int year){
        this.year = year;
    }
    @Override
    public String toString(){
        return author.toString() + " - " + year + " - " + name;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
       Book c2 = (Book) other;
        return  name.equals(c2.name);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

}
