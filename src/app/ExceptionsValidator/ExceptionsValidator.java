package app.ExceptionsValidator;

import app.HeightExceptions.HeightExceptions;

public class ExceptionsValidator {

    private static final int MAX_HEIGHT = 355;
    public static final String INPUT_REGEX = "^\\d + $";

    public String validateInputHeight(String input) throws IllegalArgumentException {
        if ( !input.matches(INPUT_REGEX) )
            throw new IllegalArgumentException(input + " is wrong height");
        return input;
    }

    public String validateHeight(String height) throws HeightExceptions {
        if ( Integer.parseInt(height) < MAX_HEIGHT ) {
            throw new HeightExceptions("Height" + height + "is height of"  +  MAX_HEIGHT + "!");
        }
        return "Height" + height + "is OK!";
    }
}
