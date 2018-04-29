package dev.prateek.com.tourguide;

public class LocationObject {

    private int mObjectNameId;

    private int mObjectInfoId;

    private int mObjectPhotoId;

    public LocationObject(int objectNameId, int objectInfoId) {
        mObjectNameId = objectNameId;
        mObjectInfoId = objectInfoId;
    }

    public LocationObject(int objectPhotoId, int objectNameId, int objectInfoId) {
        mObjectNameId = objectNameId;
        mObjectPhotoId = objectPhotoId;
        mObjectInfoId = objectInfoId;
    }

    public int getObjectNameId() {
        return mObjectNameId;
    }

    public int getObjectInfoId() {
        return mObjectInfoId;
    }

    public int getObjectPhotoId() {
        return mObjectPhotoId;
    }

}
