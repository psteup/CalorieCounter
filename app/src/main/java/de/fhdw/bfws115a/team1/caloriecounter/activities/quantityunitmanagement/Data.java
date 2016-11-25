package de.fhdw.bfws115a.team1.caloriecounter.activities.quantityunitmanagement;

import android.os.Bundle;
import de.fhdw.bfws115a.team1.caloriecounter.database.DatabaseEntityManager;
import de.fhdw.bfws115a.team1.caloriecounter.database.DatabaseHelper;

/**
 * Created by Florian on 08.11.2016.
 */
public class Data {

    /* Data variables */
    private Init mActivity;
    private String mNewQuantityUnitName;

    /* Database Entity Manager */
    private DatabaseEntityManager mDatabaseEntityManager;


    /* Default values */
    private final String DEFAULT_NEWQUANTITYUNITNAME = "";

    /* Keys */
    private final String KEY_NEWQUANTITYUNITNAME = "quantityunitmanagement1";

    public Data(Bundle savedInstanceState, Init activity) {
        mActivity = activity;
        mDatabaseEntityManager = new DatabaseEntityManager(new DatabaseHelper(mActivity.getApplicationContext()));

        if (savedInstanceState == null) {
            mNewQuantityUnitName = DEFAULT_NEWQUANTITYUNITNAME;
        } else {
            restoreDataFromBundle(savedInstanceState);
        }
    }

    public void saveDataInBundle(Bundle b) {
        b.putString(KEY_NEWQUANTITYUNITNAME, mNewQuantityUnitName);
    }

    private void restoreDataFromBundle(Bundle b) {
        mNewQuantityUnitName = b.getString(KEY_NEWQUANTITYUNITNAME);
    }

    /* Getter methods */
    public Init getActivity() {
        return mActivity;
    }

    public String getNewQuantityUnitName() {
        return mNewQuantityUnitName;
    }

    public DatabaseEntityManager getDatabaseEntityManager() {
        return mDatabaseEntityManager;
    }

    /* Setter methods */
    public void setNewQuantityUnitName(String mNewQuantityUnitName) {
        this.mNewQuantityUnitName = mNewQuantityUnitName;
    }
}
