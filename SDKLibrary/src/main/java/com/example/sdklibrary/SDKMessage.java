package com.example.sdklibrary;

import android.content.Context;
import android.widget.Toast;

public class SDKMessage {
    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
