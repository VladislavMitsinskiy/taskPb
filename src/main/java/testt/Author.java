package testt;

public final class Author extends Person {
    private Genre mainGenre;
    public Author(String name, Genre mainGenre){
        super(name);
        this.mainGenre = mainGenre;
        }
        @Override
    public void printBio() {
        System.out.println(name + ", автор в жанре " + mainGenre);
    }
}
