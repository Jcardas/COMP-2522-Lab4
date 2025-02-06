/**
 * Represents a person with a name, date of birth, and optionally a date of death.
 * Implements {@link Comparable}, {@link Printable}, and {@link Reversible} interfaces.
 *
 * @author Ted Ip, Justin Cardas
 * @version 1.0
 */
public class Person implements Comparable, Printable, Reversible
{

    private Name name;
    private Date dateOfBirth;
    private Date dateOfDeath;


    /**
     * Constructs a {@link Person} with a {@link Name}, {@link Date} of birth, and optionally a {@link Date} of death.
     *
     * @param name        The name of the person. Cannot be null.
     * @param dateOfBirth The date of birth of the person. Cannot be null.
     * @param dateOfDeath The date of death of the person (nullable).
     * @throws IllegalArgumentException if name or dateOfBirth is null.
     */
    public Person(final Name name,
                  final Date dateOfBirth,
                  final Date dateOfDeath)
    {
        validateName(name);
        validateDateOfBirth(dateOfBirth);

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    // Overloaded constructor for when there is no dateOfDeath.
    /**
     * Overloaded constructor for {@link Person} with no {@code dateOfDeath}.
     * Constructs a Person with a name and date of birth.
     *
     * @param name        The name of the person. Cannot be null.
     * @param dateOfBirth The date of birth of the person. Cannot be null.
     * @throws IllegalArgumentException if name or dateOfBirth is null.
     */
    public Person(final Name name,
                  final Date dateOfBirth)
    {
        validateName(name);
        validateDateOfBirth(dateOfBirth);

        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Date of birth cannot be null
    private void validateDateOfBirth(final Date dateOfBirth)
    {
        if(dateOfBirth == null)
        {
            throw new IllegalArgumentException("Date of birth cannot be null.");
        }
    }

    // Name cannot be null.
    private void validateName(final Name name)
    {
        if(name == null)
        {
            throw new IllegalArgumentException("Name cannot be null.");
        }
    }

    /**
     * Returns the name of the person.
     *
     * @return The person's name.
     */
    public Name getName()
    {
        return name;
    }

    /**
     * Returns the date of birth of the person.
     *
     * @return The person's date of birth.
     */
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    /**
     * Returns the date of death of the person, if applicable.
     *
     * @return The person's date of death, or null if still alive.
     */
    public Date getDateOfDeath()
    {
        return dateOfDeath;
    }

    /**
     * Prints all instance variables in a readable format.
     * This includes attributes from any parent classes.
     */
    @Override
    public void display()
    {
        // TODO Code here
    }

    /**
     * Prints the person's full name in reverse order.
     */
    @Override
    public void backward()
    {
        // TODO Code here
    }

    /**
     * Compares two persons based on their age.
     * Older persons are considered "larger."
     *
     * @param p2 The person to compare to.
     * @return //
     */
    @Override
    public int compareTo(Object p2)
    {
        // TODO Implement compareTo()
        return 0;
    }
}
