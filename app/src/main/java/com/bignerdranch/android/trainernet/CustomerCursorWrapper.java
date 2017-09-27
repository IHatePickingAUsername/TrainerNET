package com.bignerdranch.android.trainernet;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.bignerdranch.android.trainernet.database.CustomerDbSchema;

/**
 * Created by Admin on 9/27/2017.
 */

public class CustomerCursorWrapper extends CursorWrapper {
    public CustomerCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Customer getCustomer() {
        String uuidString = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.UUID));
        String lastName = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.LAST));
        String firstName = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.FIRST));
        String address = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.ADDRESS));
        String city = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.CITY));
        String State = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.STATE));
    }
}
