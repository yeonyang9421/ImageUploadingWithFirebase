package kr.co.woobi.imyeon.imageuploadingwithfirebase;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageUri;
    private String mKey;

    public Upload() {
        //empty construct needed
    }

    public Upload(String mName, String mImageUri) {
        if (mName.trim().equals("")) {
            mName = "No Name";
        }
        this.mName = mName;
        this.mImageUri = mImageUri;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUri() {
        return mImageUri;
    }

    @Exclude
    public String getmKey() {
        return mKey;
    }

    @Exclude
    public void setmKey(String mKey) {
        this.mKey = mKey;
    }

    public void setmImageUri(String mImageUri) {
        this.mImageUri = mImageUri;
    }
}
