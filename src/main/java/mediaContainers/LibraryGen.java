package mediaContainers;
import java.util.ArrayList;
import java.util.List;
import media.Media;
import media.Media;

public class LibraryGen<T extends Media> {
    private final List<T> mediasList = new ArrayList<>();

    /**
     * Добавляет элемент в библиотеку
     * @param media
     */
    public void add(T media){
        mediasList.add(media);
    }
    /**
     * Удаляет элемент из библиотеку на i позицией
     * @param i - номер элемента в библиотеки
     */
    public void removeByIndex(int  i) throws Exception {
        if (i<0||i>mediasList.size()) {
            throw new Exception("Out of range");
        }
        mediasList.remove(i);
    }
    /**
     * Удаляет элемент из библиотеку под соответствующим названием
     * @param name - название элемента в библиотеке
     */
    public void removeByName(String name){
        mediasList.removeIf(file ->file.getName().equals(name));
    }
    /**
     * Возвращает элемент из библиотеку с i позицией
     * @param i - номер элемента в библиотеки
     * @return - элемент из библиотеки
     * @throws Exception - ошибка в случае отсутсвия элемента
     */
    public T extractByIndex(int i) throws Exception {
        if (i<0||i>mediasList.size()) {
            throw new Exception("Out of range");
        }
        return mediasList.get(i);
    }
    /**
     * Возвращает элемент из библиотеку с названием name
     * @param name - название элемента в библиотеке
     * @return - элемент из библиотеки
     * @throws Exception - ошибка в случае отсутсвия элемента
     */
    public T extractByName(String name) throws Exception {
        for (T t : mediasList) {
            if(t.getName().equals(name))
                return t;
        }
        throw new Exception("No such film "+ name);
    }
    /**
     * Выводи все элементы хранящиеся в библиотеке
     */
    public void showLibrary(){
        System.out.println("Available media files:");
        for (T t : mediasList) {
            System.out.println(t);
        }
        System.out.println("-+-+-+-End+-+-+-+");

    }

}
