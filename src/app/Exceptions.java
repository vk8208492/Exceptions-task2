package app;

import app.ExceptionHandler.ExceptionsHandler;
import app.ExceptionsProvider.ExceptionsProvider;

public class Exceptions {

    public static void main(String[] args) {


        ExceptionsProvider provider = new ExceptionsProvider();
        String height = provider.getHeight();
        ExceptionsHandler hadler = new ExceptionsHandler();

        getOUtPut(hadler.HandleExceptions(height));

        getOUtPut("Some code.");
    }
        private static void getOUtPut(String output) {
            System.out.println(output);

    }
}
