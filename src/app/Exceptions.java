package app;

import app.ExceptionHandler.ExceptionsHandler;
import app.ExceptionsProvider.ExceptionsProvider;

public class Exceptions {

    public static void main(String[] args) {


        ExceptionsProvider provider = new ExceptionsProvider();
        String heights = provider.getHeight();
        ExceptionsHandler hadler = new ExceptionsHandler();

        getOUtPut(hadler.HandleExceptions(heights));

        getOUtPut("Some code.");
    }
        private static void getOUtPut(String output) {
            System.out.println(output);

    }
}
