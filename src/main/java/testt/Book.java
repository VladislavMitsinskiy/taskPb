package testt;

public class Book {
    String title;
    Author author;
    int year;

public Book(String title, Author author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
}

public class Review {
    String text;
    int rating;

public Review(String text, int rating) {
    this.text = text;
    this.rating = rating;
}

public void printReview() {
System.out.println("Рецензия на книгу '" + title + "': (" + rating +"/5) " + text);
}
}
}



