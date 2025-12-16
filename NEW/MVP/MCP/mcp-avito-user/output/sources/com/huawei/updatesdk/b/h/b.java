package com.huawei.updatesdk.b.h;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Integer f363863a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f363864b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f363865c = false;

    /* renamed from: d, reason: collision with root package name */
    private static Field f363866d;

    /* renamed from: com.huawei.updatesdk.b.h.b$b, reason: collision with other inner class name */
    public static class RunnableC10761b implements Runnable {
        private RunnableC10761b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageManagerRunnable", "PackageManagerRunnable run!!!!");
            com.huawei.updatesdk.a.a.d.d.a(new File(com.huawei.updatesdk.b.d.d.b()));
        }
    }

    private static int a(Context context, String str) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("appgallery_support_function")) {
                return bundle.getInt("appgallery_support_function");
            }
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.a.a("PackageUtils", "getAgMetaData appgallery_support_function : " + e12.toString());
        }
        return 0;
    }

    public static int b(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageInfo packageInfo = com.huawei.updatesdk.a.b.a.a.c().a().getPackageManager().getPackageInfo(str, 128);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("com.huawei.maple.flag")) ? 0 : 1;
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "getMapleStatus not found: " + str);
            return 0;
        }
    }

    public static int c(Context context, String str) throws PackageManager.NameNotFoundException {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            com.huawei.updatesdk.a.a.a.b("PackageUtils", "pkgName: " + str + ", versionCode: " + packageInfo.versionCode + ", versionName: " + packageInfo.versionName);
            return packageInfo.versionCode;
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "getVersioncode:" + e12.toString());
            return 0;
        }
    }

    public static boolean d(Context context, String str) {
        return c(context, str) > 0;
    }

    public static boolean e(Context context, String str) throws PackageManager.NameNotFoundException {
        int iA2 = a(context, str);
        com.huawei.updatesdk.a.a.a.b("PackageUtils", "UpdateSDK ag_support_function = " + iA2);
        boolean z12 = (iA2 & 2) == 2;
        com.huawei.updatesdk.a.a.a.b("PackageUtils", "UpdateSDK isMetaDataSupport = " + z12);
        return z12;
    }

    public static boolean f(Context context, String str) {
        return c(context, str) >= 70203000 && g(context, str);
    }

    private static boolean g(Context context, String str) {
        Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateAction");
        intent.setPackage(str);
        try {
            return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.a.b("PackageUtils", "isSupportToHiApp: " + e12.toString());
            return false;
        }
    }

    public static int a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if ((applicationInfo.flags & 1) == 0) {
            return 0;
        }
        return a(applicationInfo) ? 1 : 2;
    }

    public static String b(Context context, String str) {
        String installerPackageName;
        try {
            installerPackageName = context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.a.b("PackageUtils", "can not find installer pkg." + str);
            installerPackageName = null;
        }
        com.huawei.updatesdk.a.a.c.a.a.a.c("PackageUtils", "installer pkg: " + installerPackageName);
        return installerPackageName;
    }

    public static Integer c() throws ClassNotFoundException {
        String string;
        StringBuilder sb2;
        if (f363864b) {
            return f363863a;
        }
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            f363863a = Integer.valueOf(cls.getDeclaredField("PARSE_IS_REMOVABLE_PREINSTALLED_APK").getInt(cls));
        } catch (ClassNotFoundException e12) {
            e = e12;
            sb2 = new StringBuilder("isDelApp error ClassNotFoundException:");
            sb2.append(e.toString());
            string = sb2.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", string);
            f363864b = true;
            return f363863a;
        } catch (IllegalAccessException e13) {
            e = e13;
            sb2 = new StringBuilder("isDelApp error IllegalAccessException:");
            sb2.append(e.toString());
            string = sb2.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", string);
            f363864b = true;
            return f363863a;
        } catch (IllegalArgumentException e14) {
            e = e14;
            sb2 = new StringBuilder("isDelApp error IllegalArgumentException:");
            sb2.append(e.toString());
            string = sb2.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", string);
            f363864b = true;
            return f363863a;
        } catch (NoSuchFieldException e15) {
            e = e15;
            sb2 = new StringBuilder("isDelApp error NoSuchFieldException:");
            sb2.append(e.toString());
            string = sb2.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", string);
            f363864b = true;
            return f363863a;
        } catch (Exception e16) {
            string = e16.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", string);
            f363864b = true;
            return f363863a;
        }
        f363864b = true;
        return f363863a;
    }

    public static PackageInfo a(String str, Context context) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "not found: " + str);
            return null;
        }
    }

    public static Field b() {
        if (f363865c) {
            return f363866d;
        }
        try {
            f363866d = ApplicationInfo.class.getField("hwFlags");
        } catch (NoSuchFieldException unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", "can not find hwFlags");
        }
        f363865c = true;
        return f363866d;
    }

    public static void a() {
        com.huawei.updatesdk.b.g.c.f363854a.execute(new RunnableC10761b());
    }

    private static boolean a(ApplicationInfo applicationInfo) throws ClassNotFoundException {
        StringBuilder sb2;
        int i12 = applicationInfo.flags;
        Integer numC = c();
        if (numC != null && (i12 & numC.intValue()) != 0) {
            return true;
        }
        Field fieldB = b();
        if (fieldB == null) {
            return false;
        }
        try {
            return (fieldB.getInt(applicationInfo) & 33554432) != 0;
        } catch (IllegalAccessException e12) {
            e = e12;
            sb2 = new StringBuilder("can not get hwflags");
            sb2.append(e.toString());
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", sb2.toString());
            return false;
        } catch (IllegalArgumentException e13) {
            e = e13;
            sb2 = new StringBuilder("can not get hwflags");
            sb2.append(e.toString());
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", sb2.toString());
            return false;
        }
    }

    public static boolean a(String str) {
        boolean z12 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Context contextA = com.huawei.updatesdk.a.b.a.a.c().a();
        Uri uri = Uri.parse("content://" + str + ".commondata/item/7");
        if (!d.a(contextA, uri, str)) {
            return false;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contextA.getContentResolver().query(uri, null, str, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    z12 = Boolean.parseBoolean(cursorQuery.getString(0));
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused) {
                        com.huawei.updatesdk.a.a.a.a("PackageUtils", "cursor close error");
                    }
                }
                throw th2;
            }
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.a.a("PackageUtils", "getAgreeProtocolStatus : " + e12.toString());
            if (cursorQuery != null) {
            }
        }
        if (cursorQuery != null) {
            try {
                cursorQuery.close();
            } catch (Exception unused2) {
                com.huawei.updatesdk.a.a.a.a("PackageUtils", "cursor close error");
            }
        }
        return z12;
    }
}
