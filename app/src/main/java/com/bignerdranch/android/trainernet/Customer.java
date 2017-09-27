package com.bignerdranch.android.trainernet;

import java.util.UUID;

/**
 * Created by Admin on 9/26/2017.
 */

public class Customer {

    private UUID mId;
    private String mLast;
    private String mFirst;
    private String mAddress;
    private String mCity;
    private String mState;
    private int mZip;
    private String mPhone;

    public UUID getId() {
        return mId;
    }

    public String getLast() {
        return mLast;
    }

    public void setLast(String last) {
        mLast = last;
    }

    public String getFirst() {
        return mFirst;
    }

    public void setFirst(String first) {
        mFirst = first;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public int getZip() {
        return mZip;
    }

    public void setZip(int zip) {
        mZip = zip;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public Customer(String last, String first, String address, String city, String state, int zip, String phone) {
        mId = new UUID();
        mLast = last;
        mFirst = first;
        mAddress = address;
        mCity = city;
        mState = state;
        mZip = zip;
        mPhone = phone;
    }
}
