/**
 * Represents an abstract Book with title, publishing year,
 * and author.
 * Provides methods for displaying, comparing, and reversing the title.
 */
abstract class Book implements Comparable<Book>, Printable, Reversible {
    private final String title;
    private final int yearPublished;
    private final Author author;
    private final int CURRENT_YEAR = 2025;


    /**
     * Constructor of a Book Object with title, year published, and author.
     *
     * @param title         The title of the book.
     *                      Cannot be null,
     *                      blank, or exceed 100 characters.
     * @param yearPublished The year the book was published.
     *                      Must be between AD1 and the current year.
     * @param author        The author of the book.
     *                      Cannot be null.
     * @throws IllegalArgumentException If any of the arguments are invalid.
     */
    public Book(final String title,
                final int yearPublished,
                final Author author) {
        validateTitle(title);
        validateYearPublished(yearPublished);
        validateAuthor(author);

        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    private void validateTitle(final String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
        if (title.length() >= 100) {
            throw new IllegalArgumentException("Title must be less than 100 " +
                                                 "character long.");
        }
    }

    private void validateYearPublished(final int yearPublished) {

        if (yearPublished < 1 || yearPublished > CURRENT_YEAR) {
            throw new IllegalArgumentException("Year published must be " +
                                                "between AD1 and current year");
        }
    }

    private void validateAuthor(final Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null.");
        }
    }

    /**
     * Returns the year the book was published.
     * @return The publishing year of the book as an integer.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Returns the title the book.
     * @return The title as a string.
     */
    public String getTitle() {
        return title;
    }


    /**
     * Compares this book with another book based on their publishing year.
     * Older books are "larger."
     *
     * @param o The book to compare to. Cannot be null.
     * @return A negative integer, zero, or a positive integer if this book
     * was published after, in the same year as, or before the specified book.
     * @throws IllegalArgumentException If the provided object is null 
     *                                  or not an instance of Book.
     */
    @Override
    public int compareTo(Book o) {
        if (o == null || !(o instanceof Book)) {
            throw new IllegalArgumentException("Parameter must be a Book object.");
        }
        return o.getYearPublished() - this.getYearPublished();
    }

    /**
     * Print out the book's title, publishing year, and author details.
     */
    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Year Published: " + yearPublished);
        System.out.print("Author: ");
        author.display();
    }

    /**
     * Prints the title of the book in reverse order by character.
     */
    @Override
    public void backward() {

        for (int i = 0; i < this.getTitle().length(); i++) {
            System.out.print(this.getTitle().charAt(this.getTitle().length() - 1 - i));
        }
    }
}
