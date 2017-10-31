package com.example.ama021.geo_camera;

import android.content.Context;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ama02 on 10/26/2017.
 */

public class ListManager {
    private static ListManager sListManager;

    private List<PictureItem> mPictureItems;

    public static ListManager get (Context context) {
        if (sListManager == null) {
            sListManager = new ListManager(context);
        }

        return sListManager;
    }

    public List<PictureItem> getPictureItems() {
        return mPictureItems;
    }

    private ListManager(Context context) {
        mPictureItems = new ArrayList<>();
    }
}
