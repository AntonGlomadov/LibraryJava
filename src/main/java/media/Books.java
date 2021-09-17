package media;

public class Books extends Media{

    public Books(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Book:"+m_name;
    }
}
