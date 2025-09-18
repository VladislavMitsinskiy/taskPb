package testt;

public class LibraryDemo {

    public static void main(String[] args) {

        Author author = new Author("Джордж Оруэлл", Genre.SCIENCE_FICTION);


        Book book = new Book("1984", author, 1949);


        Book.Review review = book.new Review("Великая антиутопия, актуальная и сегодня.", 5);

        System.out.println("--- Информация об авторе ---");
        author.printBio();

        System.out.println("\n--- Рецензия на книгу ---");
        review.printReview();
    }
}
