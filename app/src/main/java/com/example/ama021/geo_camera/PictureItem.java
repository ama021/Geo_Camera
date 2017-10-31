package com.example.ama021.geo_camera;

import android.graphics.Bitmap;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by ama02 on 10/26/2017.
 */

/*
    Make sure to check for deletion from the gallery? If the image is deleted then delete from the
    app as well?
 */

public class PictureItem {
    private Bitmap mPictureBitMap;
    private String mCurrentPhotoPath;
    private String mCityLocation;
    private String mTimeStamp;
    private LatLng mCoordinates;

    public PictureItem() {
        mPictureBitMap = null;
        mCurrentPhotoPath = "";
        mCityLocation = "";
        mTimeStamp = "";
        mCoordinates = null;
    }

    public Bitmap getmPictureBitMap() {
        return mPictureBitMap;
    }

    public void setmPictureBitMap(Bitmap mPictureBitMap) {
        this.mPictureBitMap = mPictureBitMap;
    }

    public String getmCurrentPhotoPath() {
        return mCurrentPhotoPath;
    }

    public void setmCurrentPhotoPath(String mCurrentPhotoPath) {
        this.mCurrentPhotoPath = mCurrentPhotoPath;
    }

    public String getmCityLocation() {
        return mCityLocation;
    }

    public void setmCityLocation(String mCityLocation) {
        this.mCityLocation = mCityLocation;
    }

    public String getmTimeStamp() {
        return mTimeStamp;
    }

    public void setmTimeStamp(String mTimeStamp) {
        this.mTimeStamp = mTimeStamp;
    }

    public LatLng getmCoordinates() {
        return mCoordinates;
    }

    public void setmCoordinates(LatLng mCoordinates) {
        this.mCoordinates = mCoordinates;
    }
}
