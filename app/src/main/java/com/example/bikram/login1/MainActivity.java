package com.example.bikram.login1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SocialMediaProvider mProfile;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void performFacebookLogin(View view) {
        Log.d("tag","chal gaya");
        mProfile = SocialMediaProvider.FACEBOOK;   // putting enum value we for options we have to do particular thing (like login in a particular account
        performLogin();

    }
    public void performTwitterLogin(View view) {

        mProfile = SocialMediaProvider.TWITTER;
        performLogin();


    }

    public void performInstagramLogin(View view) {

        mProfile = SocialMediaProvider.INSTAGRAM;
        performLogin();

    }

    public void performGoogleLogin(View view) {

        mProfile = SocialMediaProvider.GOOGLE_PLUS;
        performLogin();

    }

    public void performWindowsLogin(View view) {

        mProfile = SocialMediaProvider.WINDOWS_LIVE;
        performLogin();

    }
    public void performYahooLogin(View view) {

        mProfile = SocialMediaProvider.YAHOO;
        performLogin();


    }
    public void performGithubLogin(View view) {

        mProfile = SocialMediaProvider.GITHUB;
        performLogin();


    }
    public void performLinkdinLogin(View view) {
        mProfile = SocialMediaProvider.LINKED_IN;
        performLogin();

    }

    public void performLogin(){
        Intent intent = new Intent(this,LoginService.class);
        intent.putExtra(LoginService.EXTRA_PROFILE, mProfile);  // taking key value from LoginSerivce class
        startService(intent);
    }
}
