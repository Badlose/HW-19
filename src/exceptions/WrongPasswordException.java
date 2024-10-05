package exceptions;

import java.io.IOException;

public class WrongPasswordException extends IOException {
    public WrongPasswordException() {
        System.out.println("password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPasswordException(Throwable cause) {
        super(cause);
    }
}