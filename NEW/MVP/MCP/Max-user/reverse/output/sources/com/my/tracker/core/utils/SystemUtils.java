package com.my.tracker.core.utils;

import android.text.TextUtils;
import com.my.tracker.core.Tracer;

/* loaded from: classes.dex */
public final class SystemUtils {
    public static String getValueFromSystemProperties(String str) {
        String str2;
        try {
            str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            Tracer.d("SystemUtils: error occurred when getting value for property - " + str, th);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        Tracer.d("SystemUtils: value in system properties is null for " + str);
        return null;
    }
}
