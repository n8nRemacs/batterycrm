package com.huawei.hms.framework.common;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public class SystemPropUtils {
    public static String getProperty(String str, String str2, String str3, String str4) throws ClassNotFoundException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Logger.w("SystemPropUtils", "reflect class for method has exception.");
            return str4;
        }
        try {
            Class<?> cls = Class.forName(str3);
            return (String) cls.getMethod(str, String.class, String.class).invoke(cls, str2, str4);
        } catch (Exception e12) {
            Logger.e("SystemPropUtils", "getProperty catch exception: ", e12);
            return str4;
        }
    }
}
