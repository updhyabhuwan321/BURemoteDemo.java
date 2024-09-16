
/**
 * The purpose of this class is to model a remote.
 * Bhuwan Upadhyaya
 * 2/22/2024
 *
 * @author BhuwanAcer321
 */
class BU_Remote {

    // The 2 private named constant fields
    private final String MANUFACTURER; // hold the brand name
    private final String LOCATION; // identifies the room in which remote will be used

    // Declare the 3 remaining private fields
    private boolean powerOn; // power status: powerOn or powerOff
    private int channel;     // hold the value of the station
    private int volume;      //hold numeric value for volume or loudness

    /**
     * Constructor regrading manufacturer name and location
     *
     * @param brand is the manufacturer name
     * @param room the location in which room remote will be used
     */
    public BU_Remote(String brand, String room) {
        MANUFACTURER = brand;
        LOCATION = room;
        powerOn = false; // power is off
        volume = 14; // initially volume set to 14
        channel = 5; // initially channel set to 5
    }

    // Accessor methods
    /**
     * The getVolume method will return the value stored in the volume field
     *
     * @return volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * The getChannel method will return the value stored in the channel field
     *
     * @return
     */
    public int getChannel() {
        return channel;
    }

    /**
     * The getManufacturer method will return the constant value stored in the
     * MANUFACTURER field
     *
     * @return
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }

    /**
     * The getLocation method will return the constant value stored in the
     * LOCATION field.
     *
     * @return
     */
    public String getLocation() {
        return LOCATION;
    }

    // Mutator methods
    /**
     * The setChannel method will store the desired station in the channel
     * field.
     *
     * @param station
     */
    public void setChannel(int station) {
        channel = station;
    }

    /**
     * The power method will toggle the power between on and off
     */
    public void power() {
        powerOn = !powerOn;
    }

    /**
     * The volumeUp method will increase the value stored in the volume field by
     * 1
     *
     */
    public void volumeUp() {
        volume++;
    }

    /**
     * The volumeDown method will decrease the value stored in the volume field
     * by 1
     */
    public void volumeDown() {
        volume--;
    }

}
