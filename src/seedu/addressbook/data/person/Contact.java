package seedu.addressbook.data.person;

public abstract class Contact {
    public String value;
    boolean isPrivate;

    abstract public boolean isValid(String string);

    @Override
    public String toString() {
        return value;
    }


    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
