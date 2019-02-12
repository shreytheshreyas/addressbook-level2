package seedu.addressbook.commands;


public class HistoryCommand extends Command{

    public static final String COMMAND_WORD = "history";
    public static final String MESSAGE_USAGE = "Shows all the commands history in reverse chronological order.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Displaying all commands!";

    @Override
    public CommandResult execute() {
        System.out.println("Testing history command");
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
