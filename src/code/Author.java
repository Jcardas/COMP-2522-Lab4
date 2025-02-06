/**
 * Class of author who is a person with a specific genre.
 * @author Ted IP and Justin Cardas
 * @version 1.0
 */
public class Author extends Person implements Printable {
    private final String genre;

    /**
     * Constructs a {@link Person} with a {@link Name}, {@link Date} of birth, and optionally a {@link Date} of death.
     *
     * @param name        The name of the person. Cannot be null.
     * @param dateOfBirth The date of birth of the person. Cannot be null.
     * @param dateOfDeath The date of death of the person (nullable).
     * @param genre       The literary genre associated with the author.
     *                    Cannot be null or blank.
     * @throws IllegalArgumentException if name, dateOfBirth, or genre
     *                                  is null or blank.
     */
    public Author(Name name,
                  Date dateOfBirth,
                  Date dateOfDeath,
                  String genre)
    {
        super(name, dateOfBirth, dateOfDeath);
        validateGenre(genre);
        this.genre = genre;
    }

    private void validateGenre(final String genre) {
        if (genre == null || genre.isBlank() || genre.length()>=30) {
            throw new IllegalArgumentException("Genre cannot be null, " +
                                                "blank or greater than " +
                                                "30 characters.");
        }
    }

    /**
     * Getter of genre.
     * @return The author's genre.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Print out author's name, date of birth, and literary genre.
     */
    @Override
    public void display() {
        System.out.print("Author is ");
        super.display();
        System.out.println("Genre is "+ this.getGenre());
    }

}
