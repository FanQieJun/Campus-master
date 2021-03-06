package com.xue.zz.campus.utlis;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by XUE on 2017/4/26.
 */

public class ToastUtils {
    private static Toast toast;
    public static void showToast(Context context, String content) {
        if (toast == null) {
            toast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }

}
