/**
 * Represents a person's name with a first and last name.
 * Implements the {@link Printable} interface.
 *
 * @author Ted IP, Justin CARDAS
 * @version 1.0
 */
public class Name implements Printable
{
    private final String firstName;
    private final String lastName;

    /**
     * Constructs a Name object with a first and last name.
     *
     * @param firstName The first name. Cannot be null, blank, or exceed 50 characters.
     * @param lastName  The last name. Cannot be null, blank, or exceed 50 characters.
     * @throws IllegalArgumentException if the first or last name is invalid.
     */
    public Name(final String firstName,
                final String lastName)
    {
        validateFirstName(firstName);
        validateLastName(lastName);

        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Validates the first name.
     *
     * @param firstName The first name to validate.
     * @throws IllegalArgumentException if the first name is null, blank, or exceeds 50 characters.
     */
    private void validateFirstName(final String firstName)
    {
        if (firstName == null || firstName.isBlank())
        {
            throw new IllegalArgumentException("First name cannot be null or blank.");
        }
        if (firstName.length() > 50)
        {
            throw new IllegalArgumentException("First name cannot exeed 50 characters. " +
                    "First name is [" + firstName.length() + "] characters long.");
        }
    }

    /**
     * Validates the last name.
     *
     * @param lastName The last name to validate.
     * @throws IllegalArgumentException if the last name is null, blank, or exceeds 50 characters.
     */
    private void validateLastName(final String lastName)
    {
        if (lastName == null || lastName.isBlank())
        {
            throw new IllegalArgumentException("Last name cannot be null or blank.");
        }
        if (lastName.length() > 50)
        {
            throw new IllegalArgumentException("Last name cannot exeed 50 characters. " +
                    "Last name is [" + lastName.length() + "] characters long.");
        }
    }

    /**
     * Returns the first name.
     *
     * @return The first name.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Returns the last name.
     *
     * @return The last name.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Prints the full name in "First Last" format.
     */
    @Override
    public void display()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getFirstName());
        sb.append(" "); // Added space between first and last name.
        sb.append(this.getLastName());
        System.out.println(sb);
    }
}
