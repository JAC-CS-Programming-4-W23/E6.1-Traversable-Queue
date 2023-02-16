/*
 * Copyright (c) 2021 Ian Clement. All rights reserved.
 */

/**
 * Exception thrown when a queue overflows.
 *
 * @author Ian Clement
 */
public class QueueOverflowException extends RuntimeException {

    public QueueOverflowException() {
        super();
    }

    public QueueOverflowException(String message) {
        super(message);
    }
}
