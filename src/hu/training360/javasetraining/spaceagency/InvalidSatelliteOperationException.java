package hu.training360.javasetraining.spaceagency;

public class InvalidSatelliteOperationException extends RuntimeException {

    private ErrorCode errorCode;

    public InvalidSatelliteOperationException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public InvalidSatelliteOperationException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return this.errorCode;
    }
}
