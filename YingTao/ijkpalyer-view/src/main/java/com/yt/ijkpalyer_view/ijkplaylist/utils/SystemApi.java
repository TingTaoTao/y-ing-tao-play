package com.yt.ijkpalyer_view.ijkplaylist.utils;

import android.os.Build;

/**
 * Created by jiatao on 17/3/30
 */

public class SystemApi {

    /**
     * 判断android SDK 版本是否大于等于5.0
     * @return
     */
    public static boolean isAndroid5() {

        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

}
