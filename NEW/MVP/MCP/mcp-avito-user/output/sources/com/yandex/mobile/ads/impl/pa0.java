package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.yandex.mobile.ads.R;

/* loaded from: classes8.dex */
public final class pa0 {
    @Y61.l
    public static Boolean a(@Y61.k Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            String string = context.getResources().getString(R.string.yandex_mobileads_age_restricted_user);
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable unused) {
                applicationInfo = null;
            }
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(string)) {
                return null;
            }
            Object obj = bundle.get(string);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean b(@Y61.k Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Boolean bool = null;
        try {
            String string = context.getResources().getString(R.string.yandex_mobileads_automatic_sdk_initialization);
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(string)) {
                Object obj = bundle.get(string);
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
            }
        } catch (Throwable unused2) {
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
