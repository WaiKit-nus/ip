public class Parser {
    /**
     * Takes the user input and identify the index which,
     * the user wants to mark as completed.
     *
     * @param userInput
     * @return taskIndex.
     */
    public String[] identifyUserInput(String userInput){
        String[] parts = userInput.split(" ");
        return parts;
    }

    /**
     * Takes the user input and identify the dateline which,
     * the user wants the task to be.
     *
     * @param userInput
     * @return String array of string split at "/".
     */
    public String[] identifyDeadlineCommand(String userInput){
        String[] parts = userInput.split("/");
        return parts;
    }

    /**
     * Splits userinput to find the keyword they are looking for.
     * @param userInput
     * @return
     */
    public String identifyKeyword(String userInput){
        String keyword = userInput.substring(5);
        return keyword;
    }
}