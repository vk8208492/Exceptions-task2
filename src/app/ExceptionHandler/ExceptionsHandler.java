package app.ExceptionHandler;

import app.ExceptionsValidator.ExceptionsValidator;
import app.HeightExceptions.HeightExceptions;

public class ExceptionsHandler {

    public String HandleExceptions(String exception){

        ExceptionsValidator validator = new ExceptionsValidator();
        try {
            return validator.validateHeight(validator.validateInputHeight(exception));
        }catch (IllegalArgumentException | HeightExceptions e){
            return e.getMessage();
        }
    }
}
