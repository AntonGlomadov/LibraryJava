package media;

public class Newspapers extends Media{
    public Newspapers(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Newspaper:"+m_name;
    }
}
