package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.PackageManager;
import okhttp3.internal.http2.Http2;

/* loaded from: classes7.dex */
public class PackageUtils {
    public static String getVersionName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), Http2.INITIAL_MAX_FRAME_SIZE).versionName;
        } catch (PackageManager.NameNotFoundException e12) {
            Logger.w("PackageUtils", "", e12);
            return "";
        }
    }
}
