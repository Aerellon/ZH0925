package hu.training360.javasetraining.spaceagency;

public class Satellite {

    private CelestialCoordinates destinationCoordinates;
    private String registerIdent;

    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) throws InvalidSatelliteOperationException {
        if (registerIdent == null || registerIdent.isEmpty()) {
            throw new InvalidSatelliteOperationException(ErrorCode.INVALID_REGISTERIDENT);
        }
        this.destinationCoordinates = destinationCoordinates;
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff) {
        destinationCoordinates = diff;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "registerIdent = '" + registerIdent + '\'' +
                ", x = " + destinationCoordinates.getX() +
                ", y = " + destinationCoordinates.getY() +
                ", z = " + destinationCoordinates.getZ() + '}';
    }
}
