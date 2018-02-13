package seedu.addressbook.commands;

import seedu.addressbook.data.person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Sorts all persons in the address book and displays the result to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in lexicographically by their names and displays the result to user. \n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<Person> sortedPersons = sortAllPersons(addressBook.getAllPersons().mutableListView());
        return new CommandResult(getMessageForPersonSortShownSummary(sortedPersons), sortedPersons);
    }

    /**
     * Sorts all persons by their names in lexicographical order.
     *
     * @param allPersons to be sorted
     * @return list of persons sorted
     */
    private List<Person> sortAllPersons(List<Person> allPersons) {
        List<Person> sortedPersons = new ArrayList<>(allPersons);
        Collections.sort(sortedPersons, Comparator.comparing(p -> p.getName().toString()));
        return sortedPersons;
    }
}
