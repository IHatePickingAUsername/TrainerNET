package com.bignerdranch.android.trainernet.database;

/**
 * Created by Admin on 9/26/2017.
 */

public class CustomerDbSchema {
    public static final class CustomerTable {
        public static final String NAME = "customers";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String LAST = "last";
            public static final String FIRST = "first";
            public static final String ADDRESS = "address";
            public static final String CITY = "city";
            public static final String STATE = "state";
            public static final String ZIP = "zip";
            public static final String PHONE = "phone";
        }
    }
}
