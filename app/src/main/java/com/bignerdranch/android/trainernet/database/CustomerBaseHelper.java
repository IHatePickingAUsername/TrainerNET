package com.bignerdranch.android.trainernet.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 9/26/2017.
 */

public class CustomerBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "customerBase.db";

    public CustomerBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + CustomerDbSchema.CustomerTable.NAME + "{" + " _id integer primary key autoincrement, " +
                CustomerDbSchema.CustomerTable.Cols.UUID + ", " +
                CustomerDbSchema.CustomerTable.Cols.LAST + ", " +
                CustomerDbSchema.CustomerTable.Cols.FIRST + ", " +
                CustomerDbSchema.CustomerTable.Cols.ADDRESS + ", " +
                CustomerDbSchema.CustomerTable.Cols.CITY + ", " +
                CustomerDbSchema.CustomerTable.Cols.STATE + ", " +
                CustomerDbSchema.CustomerTable.Cols.ZIP + ", " +
                CustomerDbSchema.CustomerTable.Cols.PHONE + "}"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int NewVersion) {

    }
}
