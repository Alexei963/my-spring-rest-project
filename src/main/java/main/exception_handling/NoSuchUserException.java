package main.exception_handling;

public class NoSuchUserException extends RuntimeException{
    public NoSuchUserException(String message) {
        super(message);
    }
}