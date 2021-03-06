package org.multiverse.api.exceptions;

/**
 * A {@link RetryException} thrown when a {@link org.multiverse.api.StmUtils#retry()} or {@link org.multiverse.api.Txn#retry()}
 * is done while the {@link org.multiverse.api.Txn} doesn't allow blocking transactions.
 * <p/>
 * For more information see {@link org.multiverse.api.TxnFactoryBuilder#setBlockingAllowed(boolean)}
 * and {@link org.multiverse.api.TxnConfig#isBlockingAllowed()}.
 *
 * @author Peter Veentjer.
 * @see org.multiverse.api.TxnFactoryBuilder#setBlockingAllowed(boolean)
 */
public class RetryNotAllowedException extends RetryException {

    private static final long serialVersionUID = 0;

    /**
     * Creates a new RetryNotAllowedException with the provided message.
     *
     * @param message the message
     */
    public RetryNotAllowedException(String message) {
        super(message);
    }

    /**
     * Creates a new RetryNotAllowedException with the provided message and cause.
     *
     * @param message the message
     * @param cause   the cause of this exception.
     */
    public RetryNotAllowedException(String message, Throwable cause) {
        super(message, cause);
    }
}
