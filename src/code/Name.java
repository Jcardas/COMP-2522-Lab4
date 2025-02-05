/**
 * A Name Class.
 * @ author Ted IP, Justin CARDAS
 * @ version 1.0
 * */

public class Name implements Printable
{
    private final String first; //TODO: validate isString, not null, not blank, less than 50 characters
    private final String last; //TODO: validate isString, not null, not blank, less than 50 characters

    /**
     * Constructor of Name object.
     * @param first first name
     * @param last last name
     */
    public Name(final String first, final String last)
    {
        this.first = first;
        this.last = last;
    }

    @Override
    /* To Prints every instance variable
      (including those in parent classes)
      in a sentence.
     */
    public void display()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(first);
        sb.append(last);
        System.out.println(sb);
    }

}
