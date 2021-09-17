package media;

public class Films extends Media{

    public Films(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Film: "+m_name;
    }
}
