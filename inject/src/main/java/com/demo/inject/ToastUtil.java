package com.demo.inject;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    private static Toast toast;

    /*
     const-string v0, "btn2 inject"

     invoke-static {p0, v0}, Lcom/demo/inject/ToastUtil;->showShortToast(Landroid/content/Context;Ljava/lang/String;)V
     */
    public static void showShortToast(Context context, String msg) {
        if (context != null) {
            if (toast == null) {
                toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
            } else {
                toast.setText(msg);
            }
            toast.show();
        }
    }
}