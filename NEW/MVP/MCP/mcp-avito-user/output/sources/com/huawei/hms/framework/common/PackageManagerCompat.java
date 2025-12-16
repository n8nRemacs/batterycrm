package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* loaded from: classes7.dex */
public class PackageManagerCompat {
    public static Bundle a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager;
        Bundle bundle = Bundle.EMPTY;
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return bundle;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return bundle;
            }
            Bundle bundle2 = applicationInfo.metaData;
            return bundle2 != null ? bundle2 : bundle;
        } catch (PackageManager.NameNotFoundException | RuntimeException e12) {
            Logger.w("PackageUtils", "NameNotFoundException:", e12);
            return bundle;
        }
    }

    public static Bundle b(Context context) {
        if (ContextHolder.getKitContext() != null) {
            context = ContextHolder.getKitContext();
        }
        if (context == null) {
            Logger.v("PackageUtils", "the kitContext is null");
            return Bundle.EMPTY;
        }
        if (context.getApplicationInfo() == null) {
            Logger.v("PackageUtils", "the kit applicationInfo is null");
            return Bundle.EMPTY;
        }
        Bundle bundle = context.getApplicationInfo().metaData;
        return bundle == null ? Bundle.EMPTY : bundle;
    }

    public static String getAppPackageName(Context context) {
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), Http2.INITIAL_MAX_FRAME_SIZE).packageName;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w("PackageUtils", "Failed to get Package managers Package Info");
            return "";
        }
    }

    public static String getAppVersion(Context context) {
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            return String.valueOf(packageManager.getPackageInfo(context.getPackageName(), Http2.INITIAL_MAX_FRAME_SIZE).versionCode);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w("PackageUtils", "Failed to get Package managers Package Info");
            return "";
        }
    }

    public static String getMetaDataFromApp(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        Bundle bundleA = a(context);
        return bundleA != null ? bundleA.getString(str, str2) : str2;
    }

    public static String getMetaDataFromKit(Context context, String str, String str2) {
        try {
            Bundle bundleB = b(context);
            return bundleB == null ? str2 : bundleB.getString(str, str2);
        } catch (RuntimeException unused) {
            Logger.v("PackageUtils", "the kit metaData is runtimeException");
            return str2;
        }
    }

    public static String getMetaDataFromKitOrApp(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        Bundle bundleB = b(context);
        if (bundleB == null || bundleB.isEmpty()) {
            bundleB = a(context);
        }
        return bundleB.getString(str, str2);
    }

    public static Map<String, String> getMetaDataMapFromKitOrApp(Context context, String str) throws PackageManager.NameNotFoundException {
        HashMap map = new HashMap();
        Bundle bundleB = b(context);
        if (bundleB == null || bundleB.isEmpty()) {
            bundleB = a(context);
        }
        Bundle bundleB2 = b(context);
        if (bundleB2 == null || bundleB2.isEmpty()) {
            bundleB2 = a(context);
        }
        for (String str2 : bundleB2.keySet()) {
            if (str2.startsWith(str)) {
                String string = bundleB.getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str2.substring(str.length()), string);
                }
            }
        }
        return map;
    }
}
