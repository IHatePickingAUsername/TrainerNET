package com.bignerdranch.android.trainernet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.bignerdranch.android.trainernet.database.CustomerBaseHelper;
import com.bignerdranch.android.trainernet.database.CustomerDbSchema;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Admin on 9/26/2017.
 */

public class CustomerLab {
    private static CustomerLab sCustomerLab;

    private Context mContext;
    private SQLiteDatabase mDatabase;

    private CustomerLab(Context context) {
        mContext = context.getApplicationContext();
        mDatabase = new CustomerBaseHelper(mContext).getWritableDatabase();
    }

    public void addCustomer(Customer c) {
        ContentValues values = getContentValues(c);

        mDatabase.insert(CustomerDbSchema.CustomerTable.NAME, null, values);
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>();
    }

    public Customer getCustomer(UUID id) {
        return null;
    }

    private static ContentValues getContentValues(Customer customer) {
        ContentValues values = new ContentValues();
        values.put(CustomerDbSchema.CustomerTable.Cols.UUID, customer.getId().toString());
        values.put(CustomerDbSchema.CustomerTable.Cols.LAST, customer.getLast());
        values.put(CustomerDbSchema.CustomerTable.Cols.FIRST, customer.getFirst());
        values.put(CustomerDbSchema.CustomerTable.Cols.ADDRESS, customer.getAddress());
        values.put(CustomerDbSchema.CustomerTable.Cols.CITY, customer.getCity());
        values.put(CustomerDbSchema.CustomerTable.Cols.STATE, customer.getState());
        values.put(CustomerDbSchema.CustomerTable.Cols.ZIP, customer.getZip());
        values.put(CustomerDbSchema.CustomerTable.Cols.PHONE, customer.getPhone());

        return values;
    }

    private Cursor queryCustomers(String whereClause, String[] whereArgs) {
        Cursor cursor = mDatabase.query(
                CustomerDbSchema.CustomerTable.NAME,
                null,
                whereClause,
                whereArgs,
                null,
                null,
                null
        );

        return cursor;
    }
}
