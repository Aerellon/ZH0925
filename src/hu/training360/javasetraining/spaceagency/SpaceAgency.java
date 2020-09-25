package hu.training360.javasetraining.spaceagency;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satelliteList = new ArrayList<>();

    public void registerSatellite(Satellite satellite) throws InvalidSatelliteOperationException {
        if (satellite == null) {
            throw new InvalidSatelliteOperationException(ErrorCode.SATELLITE_IS_NULL);
        }
        satelliteList.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) throws InvalidSatelliteOperationException {
        for (Satellite satellite : satelliteList) {
            if (registerIdent.equals(satellite.getRegisterIdent())) {
                return satellite;
            }
        }
        throw new InvalidSatelliteOperationException(ErrorCode.INVALID_REGISTERIDENT);
    }
}
