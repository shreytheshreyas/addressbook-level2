package seedu.addressbook.commands;


import java.util.Stack;

import static seedu.addressbook.Main.CommandHistory;

public class HistoryCommand extends Command{

    public static final String COMMAND_WORD = "history";
    public static final String MESSAGE_USAGE = "Shows all the commands history in reverse chronological order.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Displaying all past commands!";

    @Override
    public CommandResult execute() {
        Stack<String> CHCopy = CommandHistory;
        while (!CHCopy.empty()) {
            System.out.println("|| " + CHCopy.pop());
        }
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
