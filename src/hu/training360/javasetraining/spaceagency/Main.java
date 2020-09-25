package hu.training360.javasetraining.spaceagency;

public class Main {

    public static void main(String[] args) {
        SpaceAgency agency = new SpaceAgency();

        try {
            Satellite s1 = new Satellite(new CelestialCoordinates(751,589,912), "TRE489");
            Satellite s2 = new Satellite(new CelestialCoordinates(128,147,181), "GWE168");
            Satellite s3 = new Satellite(new CelestialCoordinates(658,512,255), "HFD678");

            agency.registerSatellite(s1);
            agency.registerSatellite(s2);
            agency.registerSatellite(s3);

            System.out.println(agency.findSatelliteByRegisterIdent("TRE489"));
            System.out.println(agency.findSatelliteByRegisterIdent("GWE168"));
            System.out.println(agency.findSatelliteByRegisterIdent("HFD678"));
        } catch (InvalidSatelliteOperationException ex) {
            System.out.println("ERROR: " + ex.getErrorCode());
        }
    }
}
