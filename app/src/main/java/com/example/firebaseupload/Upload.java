package com.example.firebaseupload;

import com.google.firebase.database.Exclude;

public class Upload {

    private String mName;
    private String mImageUrl;
    private String mKey;
    private int mGotFiltered;
    private int mLikes;
    private int mOwnerId;
    private int mTimeStamp;

//    private String mGotFiltered;
//    private boolean mGotFiltered;

    public Upload(){
        //empty constructor needed
    }

//    public Upload(String name, String imageUrl){
//        if(name.trim().equals("")){
//            name = "No Name";
//
//        }
//        mName = name;
//        mImageUrl = imageUrl;
//        mGotFiltered= false;
//    }
    public Upload(String name, String imageUrl, int b, int likes, int owner, int time){
        if(name.trim().equals("")){
            name = "No Name";

        }
        mName = name;
        mImageUrl = imageUrl;
        mGotFiltered= b;
        mLikes = likes;
        mOwnerId = owner;
        mTimeStamp = time;
    }

//    public Upload(String name, String imageUrl, String filtered){
//        if(name.trim().equals("")){
//            name = "No Name";
//
//        }
//        mName = name;
//        mImageUrl = imageUrl;
//        //mGotFiltered = filtered;
//    }
    public void setName(String name){
        mName = name;
    }

    public String getName(){
        return mName;
    }

    public void setImageUrl(String imageUrl){
        mImageUrl = imageUrl;
    }
    public String getImageUrl(){
        return mImageUrl;
    }


//    public String getmGotFiltered(){
//        return mGotFiltered;
//    }
//
//    public void setmGotFiltered(String b){
//        mGotFiltered = b;
//    }
//    public Boolean getmGotFiltered(){
//    return mGotFiltered;
//}
//
//    public void setmGotFiltered(Boolean b){
//        mGotFiltered = b;
//    }
    public int getmGotFiltered(){
    return mGotFiltered;
}

    public void setmGotFiltered(int b){
        mGotFiltered = b;
    }

    public int getmLikes(){
        return mLikes;
    }

    public void setmLikes(int b){
        mLikes = b;
    }

    public int getmOwnerId(){
        return mOwnerId;
    }

    public void setmOwnerId(int b){
        mOwnerId = b;
    }

    public int getmTimeStamp(){
        return mTimeStamp;
    }

    public void setmTimeStamp(int b){
        mTimeStamp = b;
    }

    @Exclude
    public String getKey(){
        return mKey;
    }

    @Exclude
    public void setKey(String key){
        mKey = key;
    }
}
