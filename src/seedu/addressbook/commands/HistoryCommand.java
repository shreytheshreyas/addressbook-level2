package seedu.addressbook.commands;


import java.util.Stack;

//import static seedu.addressbook.Main.CommandHistory;

/**
 * Displays all the past commands inputted by the user.
 */
public class HistoryCommand extends Command {

    public static final String COMMAND_WORD = "history";
    public static final String MESSAGE_USAGE = "Shows all the commands history in reverse chronological order.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Displaying all past commands!";

    public static Stack<String> CommandHistory;

    @Override
    public CommandResult execute() {
        Stack<String> CHCopy = (Stack<String>) CommandHistory.clone();
        while (!CHCopy.empty()) {
            System.out.println("|| " + CHCopy.pop());
        }
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
