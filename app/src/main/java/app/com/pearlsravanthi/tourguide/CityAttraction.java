package app.com.pearlsravanthi.tourguide;

/**
 * Created by sravanthi on 27/1/17.
 */
public class CityAttraction {
    private final String mCity = "Ann Arbor";
    private final String mState = "Michigan";
    private String mName;
    private String mAddress;
    private int mImageResourceId;
    private final int NO_IMAGE_ID = -1;

    public CityAttraction(String name, String address) {
        mName = name;
        mAddress = address;
        mImageResourceId = NO_IMAGE_ID;
    }

    public CityAttraction(String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public void setName(String name) { mName = name; }

    public String getName() { return mName; }
    public String getAddress() { return mAddress + ", " + mCity + ", " + mState ; }
    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_ID; }
}
